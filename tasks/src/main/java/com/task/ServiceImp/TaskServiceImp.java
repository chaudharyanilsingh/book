package com.task.ServiceImp;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.Repository.TaskRepository;
import com.task.Service.TaskService;
import com.task.db.entity.Task;

@Service 
public class TaskServiceImp implements TaskService{

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public void saveTask(Task task) 
	{
		
		String s=task.getEstimatedHours();
		String[] time = s.split(":");
		Float hour = Float.parseFloat(time[0]);
	    Float mins = Float.parseFloat(time[1]);
	    Float finaltime=hour+mins/60;
	    task.setEstimatedHours(finaltime.toString());
		
		taskRepository.save(task);
		
		
	}

	@Override
	public void deletetask(int id) {
		taskRepository.deleteById(id);
		
	}

	@Override
	public Iterable<Task> showall() {
		Iterable<Task> task=taskRepository.findAll();
		return task;
	}

	@Override
	public Optional<Task> showById(int id) {
		Optional<Task> task=taskRepository.findById(id);
		return task;
	}

	@Override
	public void upadateTask(Task task) {
		Optional<Task> tasks=taskRepository.findById(task.getTicketNumber());
		Date date=tasks.get().getCreateAt();		
		task.setCreateAt(date);
		
		taskRepository.save(task);
		
	}

}
