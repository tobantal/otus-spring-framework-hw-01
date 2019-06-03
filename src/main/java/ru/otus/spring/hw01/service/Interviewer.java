package ru.otus.spring.hw01.service;


public interface Interviewer {
	
	String ask(String question);
	
	void setLimit(int limit);
	
}
