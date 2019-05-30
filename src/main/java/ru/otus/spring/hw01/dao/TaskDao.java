package ru.otus.spring.hw01.dao;

import java.util.List;

import ru.otus.spring.hw01.domain.Task;

public interface TaskDao {
	List<Task> getAllTasks();
}
