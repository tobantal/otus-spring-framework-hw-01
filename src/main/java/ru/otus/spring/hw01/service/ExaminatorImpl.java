package ru.otus.spring.hw01.service;

import java.util.LinkedList;
import java.util.Queue;

import ru.otus.spring.hw01.dao.TaskDao;
import ru.otus.spring.hw01.domain.Task;

public class ExaminatorImpl implements Examinator {

	private TaskDao taskDao;
	private AnswerTester answerTester;
	private Interviewer interviewer;

	private static final String REPORT_TEMPLATE = "--- Результат теста ---\nИмя: %s\nФамилия: %s\nКоличество правильных ответов: %d";

	public ExaminatorImpl(TaskDao taskDao, AnswerTester answerTester, Interviewer interviewer) {
		this.taskDao = taskDao;
		this.answerTester = answerTester;
		this.interviewer = interviewer;
	}

	@Override
	public void takeAnExam() {
		Queue<String> questions = new LinkedList<String>();
		questions.add("Ваше имя?");
		questions.add("Ваша фамилия?");
		Queue<Task> tasks = taskDao.getQueueTasks();
		tasks.forEach(task -> questions.add(task.getText()));

		Queue<String> answers = interviewer.ask(questions);

		String firstName = answers.poll();
		String lastName = answers.poll();
		int success = answerTester.testAnswer(tasks, answers);

		System.out.println(String.format(REPORT_TEMPLATE, firstName, lastName, success));
	}

}
