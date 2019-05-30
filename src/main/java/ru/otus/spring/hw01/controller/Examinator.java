package ru.otus.spring.hw01.controller;

import java.util.function.Consumer;
import java.util.function.Supplier;

import ru.otus.spring.hw01.domain.Answer;
import ru.otus.spring.hw01.domain.Task;

public class Examinator {
	private Supplier<Task> taskSupplier;
	private Consumer<Answer> ansConsumer;
}
