package ar.com.matiasgaleano.Portfolio.controller;

import ar.com.matiasgaleano.Portfolio.model.Education;
import ar.com.matiasgaleano.Portfolio.model.Project;
import ar.com.matiasgaleano.Portfolio.model.Work;
import ar.com.matiasgaleano.Portfolio.service.IEducationService;
import ar.com.matiasgaleano.Portfolio.service.IProjectService;
import ar.com.matiasgaleano.Portfolio.service.IWorkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  
  @Autowired
  private IWorkService workServ;
  
  @Autowired
  private IEducationService educServ;
  
  @Autowired
  private IProjectService projServ;
  
  
  @GetMapping ("/project")
  public List<Project> getProjecs() {
    return projServ.getProjectList();
  }
  
  @GetMapping ("/project/{id}")
  public Project getProjec(@PathVariable Long id) {
    return projServ.getProject(id);
  }
  
  @PostMapping ("/project") 
  public void addProject (@RequestBody Project data) {
    projServ.addProject(data);
  }
  
  @PutMapping ("/project")
  public void editProject (@RequestBody Project data) {
    projServ.editProject(data);
  }
  
  @DeleteMapping ("/project/{id}")
  public void deleteProject (@PathVariable Long id){
    projServ.deleteProject(id);
  }
  
  @GetMapping ("/work")
  public List<Work> getWorkList() {
    return workServ.getWorkList();
  }
  
  @GetMapping ("/work/{id}")
  public Work getWork(@PathVariable Long id) {
    return workServ.getWork(id);
  }
  
  @PostMapping ("/work") 
  public void addWork (@RequestBody Work data) {
    workServ.addWork(data);
  }
  
  @PutMapping ("/work")
  public void editWork (@RequestBody Work data) {
    workServ.editWork(data);
  }
  
  @DeleteMapping ("work/{id}")
  public void deleteWork (@PathVariable Long id){
    workServ.deleteWork(id);
  }
  
  @GetMapping ("/education")
  public List<Education> getEducationList() {
    return educServ.getEducationList();
  }
  
  @GetMapping ("/education/{id}")
  public Education getEducation (@PathVariable Long id) {
    return educServ.getEducation(id);
  }
  
  @PostMapping ("/education") 
  public void addEducation (@RequestBody Education data) {
    educServ.addEducation(data);
  }
  
  @PutMapping ("/education")
  public void editEducation (@RequestBody Education data) {
    educServ.editEducation(data);
  }
  
  @DeleteMapping ("/education/{id}")
  public void deleteEducation (@PathVariable Long id){
    educServ.deleteEducation(id);
  }
  
}
