package ru.otus.spring.hw01.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Queue;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import ru.otus.spring.hw01.domain.Task;


class CsvDaoTest {
	
	private TaskDao taskDao;

	public void setTaskDao(TaskDao taskDao) {
		this.taskDao = taskDao;
	}

	@Test
	void test() {
		
		TaskDao taskDao = new CsvDao(); // new CsvDao("test-tasks.csv");
		CsvDao csvDao = (CsvDao) taskDao;
		String csvPath = "test-tasks.csv";
		csvDao.setCsvPath(csvPath);
		
		
		Queue<Task> queue = taskDao.getQueueTasks();
		System.out.println(queue.peek().getText());
		
		assertTrue(IntStream.rangeClosed(1, 5).allMatch(x -> queue.poll().getId() == x));
		assertNull(queue.poll());
	}

}
