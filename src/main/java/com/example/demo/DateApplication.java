package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.*;

@SpringBootApplication
@RestController
public class DateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateApplication.class, args);
	}

	@GetMapping("/api/time")
	public String get_current_time(){
		return LocalTime.now().toString();
	}

	@GetMapping("api/date")
	public String get_current_date(){
		return LocalDate.now().toString();
	}

}
