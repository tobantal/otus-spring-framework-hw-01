package ru.otus.spring.hw01.domain;

public class Task {
	
	private final long id;
	private final String text;
	private final String rightAnswer;
	
	public Task(long id, String text, String answer) {
		super();
		this.id = id;
		this.text = text;
		this.rightAnswer = answer;
	}

	public long getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public String getAnswer() {
		return rightAnswer;
	}

	@Override
	public String toString() {
		return String.format("Task [id=%s, text=%s, rightAnswer=%s]", id, text, rightAnswer);
	}
	
	

}
