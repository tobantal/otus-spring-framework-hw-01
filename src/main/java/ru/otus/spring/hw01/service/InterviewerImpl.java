package ru.otus.spring.hw01.service;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InterviewerImpl implements Interviewer {
	
	@Override
	public Queue<String> ask(Queue<String> questions) {
		Queue<String> answers = new LinkedList<String>();
		try(Scanner scanner = new Scanner(System.in)) {
			questions.forEach(question -> {
				System.out.println(question);
				answers.add(scanner.next());
			});
		}
		return answers;
	}

}
