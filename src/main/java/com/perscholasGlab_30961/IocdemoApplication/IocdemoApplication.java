package com.perscholasGlab_30961.IocdemoApplication;

import com.perscholasGlab_30961.IocdemoApplication.myServices.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication()

// Note: in above line, "myServices" is a package name
public class IocdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(IocdemoApplication.class, args);

		//	get the bean from spring container
		Coach theCoach = context.getBean(Coach.class);

//		Call a method on the  Bean
		System.out.println(theCoach.getDailyWorkout());

//		Call method to get Daily Fortune
		System.out.println(theCoach.getDailyFortune());

//		Close the Context
		context.close();
	}

}
