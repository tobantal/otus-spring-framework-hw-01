package ru.otus.spring.hw01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.otus.spring.hw01.dao.TaskDao;

public class App {

	public static void main(String[] args) {
    	try(ClassPathXmlApplicationContext context = 
    			new ClassPathXmlApplicationContext("/spring-context.xml")) {
    		TaskDao dao = context.getBean(TaskDao.class);
        	
    		dao.getAllTasks().forEach(System.out::println);

    	}

	}

}
