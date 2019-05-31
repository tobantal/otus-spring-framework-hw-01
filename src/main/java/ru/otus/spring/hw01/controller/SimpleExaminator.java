package ru.otus.spring.hw01.controller;

import java.util.NoSuchElementException;
import java.util.Queue;

import ru.otus.spring.hw01.dao.TaskDao;
import ru.otus.spring.hw01.domain.Task;


public class SimpleExaminator implements Examinator {
	
	private Queue<Task> queue;
	private int success;
	
	public SimpleExaminator(TaskDao taskDao) {
		this.queue = taskDao.getQueueTasks();
	}

	@Override
	public void accept(String ans) throws UnsupportedOperationException {
		Task task = queue.poll();
		if(task == null) {
			throw new UnsupportedOperationException();
		}
		//System.out.println("RA=" + task.getAnswer() + ", UA=" + ans);
		if(task.getAnswer().equalsIgnoreCase(ans)) {
			success++;
		}
	}

	@Override
	public String get() throws NoSuchElementException {
		return queue.element().getText();
	}

	@Override
	public String showResult() {
		return String.format("Result: %d", success);
	}
}
