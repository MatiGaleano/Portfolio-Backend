package ar.com.matiasgaleano.Portfolio.controller;

import ar.com.matiasgaleano.Portfolio.service.ImageService.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "*")
public class ImageController {

  @Autowired
  private IImageService imgServ;

  @PostMapping("/image")
  public void addImage(@RequestParam("file") MultipartFile image) {
    imgServ.saveImage(image);
  }

  @GetMapping(path = {"/image/{name}"})
  public ResponseEntity<byte[]> loadImage(@PathVariable("name") String name) {
    return imgServ.loadImage(name);
  }

  @DeleteMapping(path = {"/image/{name}"})
  public void deleteImage(@PathVariable("name") String name) {
    imgServ.deleteImage(name);
  }
}
