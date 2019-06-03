package ru.otus.spring.hw01.service;

import ru.otus.spring.hw01.domain.Task;

@FunctionalInterface
public interface AnswerTester {

	public boolean testAnswer(Task task, String answer);

}
