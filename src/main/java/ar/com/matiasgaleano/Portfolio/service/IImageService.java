package ar.com.matiasgaleano.Portfolio.service;

import java.io.File;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface IImageService {

  public void init();

  public void saveImage(MultipartFile image);

  public ResponseEntity<byte[]> loadImage(String name);

  public void deleteImage(String name);

}
