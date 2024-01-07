package com.internship.taskmanagement.repository;

import com.internship.taskmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;



// TaskRepository.java
public interface TaskRepository extends JpaRepository<Task, Long> {
}
