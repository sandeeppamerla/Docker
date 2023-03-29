package kaiburr.tasks.kaiburr_task.controller;

import kaiburr.tasks.kaiburr_task.model.Task;
import kaiburr.tasks.kaiburr_task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task2")
public class TaskController {

    @Autowired
    private TaskRepository repository;

    @PutMapping(value = "/addServerDetails")
    public String saveServers(@RequestBody Task task) {
        repository.save(task);
        return "Added server with id : " + task.getId();
    }

    @GetMapping(value = "/findAllServers")
    public List<Task> getServers() {
        return repository.findAll();
    }

    @GetMapping(value = "/findAllServers/{name}")
    public List<Task> getServer(@PathVariable String name) {
        return repository.findByName(name);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteServer(@PathVariable("id") long id) {
        repository.deleteById(id);
        return "Server deleted with id : " + id;
    }

}