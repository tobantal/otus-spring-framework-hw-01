package ru.otus.spring.hw01.service;

import java.util.Queue;

import ru.otus.spring.hw01.domain.Task;

@FunctionalInterface
public interface AnswerTester {

	public int testAnswer(Queue<Task> tasks, Queue<String> answers);

}
