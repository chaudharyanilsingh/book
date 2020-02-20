package com.task.Service;

import java.util.List;
import java.util.Optional;

import com.task.db.entity.Task;

public interface TaskService {

	void saveTask(Task task);

	void deletetask(int id);

	Iterable<Task> showall();

	Optional<Task> showById(int id);

	void upadateTask(Task task);

}
