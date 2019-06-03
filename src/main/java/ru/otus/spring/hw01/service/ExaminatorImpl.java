package ru.otus.spring.hw01.service;

import ru.otus.spring.hw01.dao.TaskDao;
import ru.otus.spring.hw01.domain.Task;


public class ExaminatorImpl implements Examinator {
	
	private TaskDao taskDao;
	private AnswerTester answerTester;
	private Interviewer interviewer;
	private Task currentTask;
	private int success;
	
	private static final String REPORT_TEMPLATE = 
			"--- Результат теста ---\nИмя: %s\nФамилия: %s\nКоличество правильных ответов: %d";
	
	public ExaminatorImpl(TaskDao taskDao, AnswerTester answerTester, Interviewer interviewer) {
		this.taskDao = taskDao;
		this.answerTester = answerTester;
		this.interviewer = interviewer;
		System.out.println(">>>" + taskDao.getNumberOfTasks());
		interviewer.setLimit(taskDao.getNumberOfTasks());
	}

	@Override
	public void takeAnExam() {
		String firstName = interviewer.ask("Ваше имя?");
		String lastName = interviewer.ask("Ваша фамилия?");

		while( (currentTask = taskDao.getNextTask()) != null ) {
			String answer = interviewer.ask(currentTask.getText());
			if(answerTester.testAnswer(currentTask, answer)) {
				success++;
			}
		}
		
		System.out.println(String.format(REPORT_TEMPLATE, firstName, lastName, success));
	}

}
