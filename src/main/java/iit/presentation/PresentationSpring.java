package iit.presentation;
import iit.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IService metier=(IService) context.getBean("service");
		System.out.println(metier.calcul());
		

	}

}
