package ru.otus.spring.hw01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.otus.spring.hw01.service.Examinator;


public class App {

	public static void main(String[] args) {
    	try(ClassPathXmlApplicationContext context = 
    			new ClassPathXmlApplicationContext("/spring-context.xml")) {    		
    		context.getBean(Examinator.class).takeAnExam();
    	}
	}

}
