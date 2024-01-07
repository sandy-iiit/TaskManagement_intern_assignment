package com.internship.taskmanagement.controller;


import com.internship.taskmanagement.service.TaskService;
import com.internship.taskmanagement.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// TaskController.java
@RestController
@RequestMapping("/tasks")
@CrossOrigin("http://localhost:3001")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{taskId}")
    public Task getTaskById(@PathVariable Long taskId) {
        return taskService.getTaskById(taskId);
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @PutMapping("/{taskId}")
    public Task updateTask(@PathVariable Long taskId, @RequestBody Task task) {
        task.setId(taskId);
        return taskService.saveTask(task);
    }

    @DeleteMapping("/{taskId}")
    public void deleteTask(@PathVariable Long taskId) {
        taskService.deleteTask(taskId);
    }

    @PutMapping("/{taskId}/complete")
    public Task markTaskComplete(@PathVariable Long taskId) {
        Task task = taskService.getTaskById(taskId);
        task.setCompleted(true);
        return taskService.saveTask(task);
    }
}


