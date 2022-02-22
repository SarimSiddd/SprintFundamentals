package siddiqui.example.Spring.Fundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import siddiqui.example.Spring.Fundamentals.DependencyInjection.Controllers.TestController;

@SpringBootApplication
public class SpringFundamentalsApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringFundamentalsApplication.class, args);
		TestController testController = (TestController) ctx.getBean("testController");
		String text = testController.getGreeting();
		System.out.println(text);

 	}
}
