package in.arc.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-cfg.xml");

		Car car = context.getBean(Car.class);
//		
//		car.drive(1432);
//		
	}

}
