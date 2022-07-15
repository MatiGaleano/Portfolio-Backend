package ar.com.matiasgaleano.Portfolio.controller;

import ar.com.matiasgaleano.Portfolio.model.Profile;
import ar.com.matiasgaleano.Portfolio.service.IProfileService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ProfileController {
  
  @Autowired
  private IProfileService profServ;
  
  @GetMapping("/profile")
  public List<Profile> getProfile(){
    return profServ.getProfile();
  }
  
  @PostMapping("/profile")
  public void postProfile(Profile prof){
    profServ.postProfile(prof);
  }
  
  @PutMapping("/profile")
  public void editProfile(Profile prof){
    profServ.editProfile(prof);
  } 
  
}
