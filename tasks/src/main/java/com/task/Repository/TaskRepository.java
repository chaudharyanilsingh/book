package com.task.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.task.db.entity.Task;

@Repository 
public interface TaskRepository extends CrudRepository<Task, Integer> {

}
