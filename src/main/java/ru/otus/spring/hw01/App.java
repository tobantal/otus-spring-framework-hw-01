package ru.otus.spring.hw01;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.otus.spring.hw01.controller.Examinator;
import ru.otus.spring.hw01.dao.TaskDao;

public class App {

	public static void main(String[] args) {
    	try(ClassPathXmlApplicationContext context = 
    			new ClassPathXmlApplicationContext("/spring-context.xml")) {
    		TaskDao dao = context.getBean(TaskDao.class);
    		dao.getQueueTasks().forEach(System.out::println);
    		
    		Examinator examinator = context.getBean(Examinator.class);
    		
    		try (Scanner scanner = new Scanner(System.in)) {
    			// TODO input first name and last name
    			while(true) {
    				System.out.println(examinator.get());
    				examinator.accept(scanner.next());
    			}
    		} catch(java.util.NoSuchElementException nsee) {
    			System.out.println(examinator.showResult());
    		}

    	}

	}

}
