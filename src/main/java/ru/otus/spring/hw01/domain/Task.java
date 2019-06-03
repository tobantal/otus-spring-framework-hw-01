package ru.otus.spring.hw01.domain;

public class Task {
	
	private Long id;
	private String text;
	private String answer;
	
	public Task(Long id, String text, String answer) {
		this.id = id;
		this.text = text;
		this.answer = answer;
	}

	public long getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public String getAnswer() {
		return answer;
	}

	@Override
	public String toString() {
		return String.format("Task [id=%s, text=%s, rightAnswer=%s]", id, text, answer);
	}
	
	

}
