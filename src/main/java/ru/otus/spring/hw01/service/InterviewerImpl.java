package ru.otus.spring.hw01.service;

import java.util.Scanner;

public class InterviewerImpl implements Interviewer {
	
	private Scanner scanner = new Scanner(System.in);
	
	private int limit;
	
	@Override
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	@Override
	public String ask(String question) {
		
		if(limit == 0) {
			throw new UnsupportedOperationException();
		}
		
		System.out.println(question);
		String answer = scanner.next();
		
		if(--limit == 0) {
			scanner.close();
		}
		
		return answer;
	}

}
