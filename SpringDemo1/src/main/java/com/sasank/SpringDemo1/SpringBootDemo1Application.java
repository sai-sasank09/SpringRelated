package com.sasank.SpringDemo1;

import com.sasank.SpringDemo1.model.Alien;
import com.sasank.SpringDemo1.model.Laptop;
import com.sasank.SpringDemo1.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemo1Application {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpringBootDemo1Application.class, args);
		Laptop lap= context.getBean(Laptop.class);
		LaptopService service=context.getBean(LaptopService.class);
		service.addLaptop(lap);


		//		Alien obj= context.getBean(Alien.class);
//		obj.compile();
//		System.out.println(obj.getAge());


	}

}
