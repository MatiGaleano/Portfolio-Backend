package ar.com.matiasgaleano.Portfolio.controller;

import ar.com.matiasgaleano.Portfolio.model.Education;
import ar.com.matiasgaleano.Portfolio.service.EducationService.IEducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class EducationController {

  @Autowired
  private IEducationService educServ;

  @GetMapping("/education")
  public List<Education> getEducationList() {
    return educServ.getEducationList();
  }

  @GetMapping("/education/{id}")
  public Education getEducation(@PathVariable Long id) {
    return educServ.getEducation(id);
  }

  @PostMapping("/education")
  public void addEducation(@RequestBody Education data) {
    educServ.addEducation(data);
  }

  @PutMapping("/education")
  public void editEducation(@RequestBody Education data) {
    educServ.editEducation(data);
  }

  @DeleteMapping("/education/{id}")
  public void deleteEducation(@PathVariable Long id) {
    educServ.deleteEducation(id);
  }

}
