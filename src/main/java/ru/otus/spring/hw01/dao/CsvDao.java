package ru.otus.spring.hw01.dao;

import java.util.List;

import ru.otus.spring.hw01.domain.Task;

public class CsvDao implements TaskDao {
	
	private String csvPath;
	
	public void setCsvPath(String csvPath) {
		this.csvPath = csvPath;
	}

	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return null;
	}

}
