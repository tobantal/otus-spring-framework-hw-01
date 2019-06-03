package ru.otus.spring.hw01.dao;

import ru.otus.spring.hw01.domain.Task;


public interface TaskDao {
	
	Task getNextTask();
	
	int getNumberOfTasks();
	
}
