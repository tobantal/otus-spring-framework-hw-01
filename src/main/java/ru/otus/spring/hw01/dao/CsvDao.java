package ru.otus.spring.hw01.dao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import ru.otus.spring.hw01.domain.Task;

public class CsvDao implements TaskDao {
	
	private static final String DELIMITER = ";";
	private String csvPath;
	
	public CsvDao(String csvPath) {
		super();
		this.csvPath = csvPath;
	}

	@Override
	public Queue<Task> getQueueTasks() {	
		Queue<Task> queue = new LinkedList<>();
		try (Scanner scanner = new Scanner(this.getClass().getClassLoader().getResourceAsStream(csvPath));) {
		    while (scanner.hasNextLine()) {
		        String[] line = scanner.nextLine().split(DELIMITER);
		        //Long id = Long.parseLong(line[0]);
		        //String text = line[1].substring(1, line[1].length()-1);
		        //String ans = line[2].substring(1, line[2].length()-1);
		        queue.add(new Task(Long.parseLong(line[0]), line[1], line[2]));
		    }
		}
		return queue;
	}

}
