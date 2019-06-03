package ru.otus.spring.hw01.service;

import java.util.Queue;

@FunctionalInterface
public interface Interviewer {
	
	Queue<String> ask(Queue<String> questions);
	
}
