package vn.qlns;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import vn.qlns.service.BuService;



@SpringBootApplication
public class QlNhanSuApplication implements CommandLineRunner {
	BuService departmentService;
	public static void main(String[] args) {
		SpringApplication.run(QlNhanSuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//departmentService.findAll().forEach(item->System.out.println(item));
	}

	
}

