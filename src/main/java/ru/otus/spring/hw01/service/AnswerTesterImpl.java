package ru.otus.spring.hw01.service;

import java.util.Queue;

import ru.otus.spring.hw01.domain.Task;

public class AnswerTesterImpl implements AnswerTester {

	@Override
	public int testAnswer(Queue<Task> tasks, Queue<String> answers) {
		int count = 0;
		Task task;
		String answer;
		while((task = tasks.poll()) != null && (answer = answers.poll()) != null) {
			if(task.getAnswer().equalsIgnoreCase(answer)) {
				count++;
			}
		}
		return count;
	}

}
