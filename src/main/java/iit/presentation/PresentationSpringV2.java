package iit.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import iit.service.IService;

public class PresentationSpringV2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("iit.dao","iit.service","iit.extension");
		IService metier=context.getBean(IService.class);
		System.out.println(metier.calcul());
		

	}

}
