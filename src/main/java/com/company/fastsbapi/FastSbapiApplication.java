package com.company.fastsbapi;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2Doc
public class FastSbapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastSbapiApplication.class, args);
	}
}
