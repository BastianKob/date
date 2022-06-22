package com.example.demo;

import org.apache.tomcat.jni.Local;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest
class DateApplicationTests {
	DateApplication da = new DateApplication();
	@Test
	void test_get_current_time() {
		String time = LocalTime.now().toString();
		String time2 = da.get_current_time();
		Assertions.assertEquals(time, time2);
	}
	@Test
	void test_get_current_date_no_param(){
		String date = LocalDate.now().toString();
		String date2 = da.get_current_date("");
		Assertions.assertEquals(date, date2);
	}

	@Test
	void test_get_current_date_param(){
		LocalDate date = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fdate = date.format(dtf).toString();
		String date2= da.get_current_date("dd/MM/yyyy");
		Assertions.assertEquals(fdate, date2);
	}

}
