package ru.otus.spring.hw01.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ru.otus.spring.hw01.domain.Task;

public class CsvDao implements TaskDao {
	
	private static final String COMMA_DELIMITER = ",";
	private String csvPath;
	
	public void setCsvPath(String csvPath) {
		this.csvPath = csvPath;
	}

	public List<Task> getAllTasks() {	
		List<Task> records = new ArrayList<>();
		try (Scanner scanner = new Scanner(this.getClass().getClassLoader().getResourceAsStream(csvPath));) {
		    while (scanner.hasNextLine()) {
		        String[] line = scanner.nextLine().split(COMMA_DELIMITER);
		        records.add(new Task(Long.parseLong(line[0]), line[1], line[2]));
		    }
		}
		return records;
	}

}
