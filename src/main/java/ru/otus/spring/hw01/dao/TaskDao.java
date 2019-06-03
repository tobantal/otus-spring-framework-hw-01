package ru.otus.spring.hw01.dao;

import java.util.Queue;

import ru.otus.spring.hw01.domain.Task;

@FunctionalInterface
public interface TaskDao {
	
	Queue<Task> getQueueTasks();
	
}
