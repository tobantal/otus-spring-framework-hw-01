package ru.otus.spring.hw01.controller;

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface Examinator extends Consumer<String>, Supplier<String> {
	
	//boolean checkAns(Task t, String s);
	
	String showResult();
}
