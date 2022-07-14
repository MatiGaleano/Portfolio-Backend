package ar.com.matiasgaleano.Portfolio.controller;

import ar.com.matiasgaleano.Portfolio.model.Work;
import ar.com.matiasgaleano.Portfolio.service.WorkService.IWorkService;
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
public class WorkController {

  @Autowired
  private IWorkService workServ;

  @GetMapping("/work")
  public List<Work> getWorkList() {
    return workServ.getWorkList();
  }

  @GetMapping("/work/{id}")
  public Work getWork(@PathVariable Long id) {
    return workServ.getWork(id);
  }

  @PostMapping("/work")
  public void addWork(@RequestBody Work data) {
    workServ.addWork(data);

  }

  @PutMapping("/work")
  public void editWork(@RequestBody Work data) {
    workServ.editWork(data);
  }

  @DeleteMapping("work/{id}")
  public void deleteWork(@PathVariable Long id) {
    workServ.deleteWork(id);
  }

}
