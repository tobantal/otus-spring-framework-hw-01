package ru.otus.spring.hw01.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Queue;
import java.util.function.BiPredicate;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import ru.otus.spring.hw01.domain.Task;

class CsvDaoTest {

	private static final String TEST_CSV_FILE = "test-tasks.csv";
	private static final BiPredicate<Task, Integer> NTH_TASK = (task, i) -> task.getId() == i
			&& task.getText().equals("Task" + i) && task.getAnswer().equals("Answer" + i);

	@Test
	void load_csv_file() {
		TaskDao taskDao = new CsvDao(TEST_CSV_FILE);

		Queue<Task> queue = taskDao.getQueueTasks();
		System.out.println(queue.peek().getText());

		assertTrue(IntStream.rangeClosed(1, 5).allMatch(i -> NTH_TASK.test(queue.poll(), i)));
		assertNull(queue.poll());
	}

}
