package com.anil;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anil.Repository.MobilesRepo;
import com.anil.entity.Mobiles;

@SpringBootApplication
public class DatajpaCrud12Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(DatajpaCrud12Application.class, args);
		MobilesRepo a=ctx.getBean(MobilesRepo.class);
		  Mobiles mobile1 = new Mobiles();
	        mobile1.setMobileId(1);
	        mobile1.setMobilePrice(10000);
	        mobile1.setMobileName("redmi");
	        a.save(mobile1);

	        Mobiles mobile2 = new Mobiles();
	        mobile2.setMobileId(2);
	        mobile2.setMobilePrice(20000);
	        mobile2.setMobileName("Iphone");
	        a.save(mobile2);

	        Mobiles mobile3 = new Mobiles();
	        mobile3.setMobileId(3);
	        mobile3.setMobilePrice(30000);
	        mobile3.setMobileName("samsung");
	        a.save(mobile3);
		

	}

}
