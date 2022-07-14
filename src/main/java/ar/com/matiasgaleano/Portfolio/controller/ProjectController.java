package ar.com.matiasgaleano.Portfolio.controller;

import ar.com.matiasgaleano.Portfolio.model.Project;
import ar.com.matiasgaleano.Portfolio.service.ProjectService.IProjectService;
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
public class ProjectController {
  
  @Autowired
  private IProjectService projServ;

  

  @GetMapping("/project")
  public List<Project> getProjecs() {
    return projServ.getProjectList();
  }

  @GetMapping("/project/{id}")
  public Project getProjec(@PathVariable Long id) {
    return projServ.getProject(id);
  }

  @PostMapping("/project")
  public void addProject(@RequestBody Project data) {
    projServ.addProject(data);
  }

  @PutMapping("/project")
  public void editProject(@RequestBody Project data) {
    projServ.editProject(data);
  }

  @DeleteMapping("/project/{id}")
  public void deleteProject(@PathVariable Long id) {
    projServ.deleteProject(id);
  }

}
