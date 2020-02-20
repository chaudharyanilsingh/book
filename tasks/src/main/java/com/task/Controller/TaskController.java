package com.task.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.task.Service.TaskService;
import com.task.db.entity.Task;

@RestController 
public class TaskController 
{
	@Autowired
	private TaskService taskService;
	@RequestMapping(value="/addtask",produces = { "application/json", "application/xml",
	"text/html" }, consumes = { "application/json", "application/xml",
	"text/html" },method=RequestMethod.POST)
	public String addtask(@RequestBody Task task)
	{
		taskService.saveTask(task);
		return "data saved";
	}

	@RequestMapping(value="/updatetask",produces = { "application/json", "application/xml",
	"text/html" }, consumes = { "application/json", "application/xml",
	"text/html" },method=RequestMethod.PUT)
	public String  updatetask(@RequestBody Task task)
	{
		Task task1=taskService.showById(task.getTicketNumber()).get();
		taskService.upadateTask(task);
		return "data updated";
	}
	@RequestMapping(value="/deletetask/{id}",method=RequestMethod.DELETE)
	public String deletatask(@RequestBody Task task,@PathVariable(value="id") int id)
	{
		taskService.deletetask(id);
		return "data of id  "+id+"  deleted";
	}
	@GetMapping(value="/showalltask")
	public Iterable<Task> showall()
	{
		Iterable<Task> task=taskService.showall();
		return task;
		
	}
	@GetMapping(value="/showtask/{id}")
	public Optional<Task> showtaskbyid(@PathVariable(value="id") int id)
	{
		Optional<Task> task=taskService.showById(id);
		return task;
		
	}
}
