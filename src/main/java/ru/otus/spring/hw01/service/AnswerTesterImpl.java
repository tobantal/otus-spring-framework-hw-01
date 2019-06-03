package ru.otus.spring.hw01.service;

import ru.otus.spring.hw01.domain.Task;

public class AnswerTesterImpl implements AnswerTester {

	@Override
	public boolean testAnswer(Task task, String answer) {
		return task.getAnswer().equalsIgnoreCase(answer);
	}

}
