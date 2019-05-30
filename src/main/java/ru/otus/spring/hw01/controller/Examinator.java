package ru.otus.spring.hw01.controller;

import java.util.function.Consumer;
import java.util.function.Supplier;

import ru.otus.spring.hw01.domain.Answer;
import ru.otus.spring.hw01.domain.Task;

// move to service
public class Examinator implements Supplier<Task>, Consumer<Answer> {

	@Override
	public void accept(Answer t) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Task get() {
		// TODO Auto-generated method stub
		return null;
	}
}
