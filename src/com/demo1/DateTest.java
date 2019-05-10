package com.demo1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTest {

	public static void main(String[] args) {
		LocalDateTime currentTime = LocalDateTime.now();
	      System.out.println("��ǰʱ��: " + currentTime);
	        
	      LocalDate date1 = currentTime.toLocalDate();
	      System.out.println("date1: " + date1);
	        
	      Month month = currentTime.getMonth();
	      int day = currentTime.getDayOfMonth();
	      int seconds = currentTime.getSecond();
	        
	      System.out.println("��: " + month +", ��: " + day +", ��: " + seconds);
	        
	      LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
	      System.out.println("date2: " + date2);
	        
	      // 12 december 2014
	      LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
	      System.out.println("date3: " + date3);
	        
	      // 22 Сʱ 15 ����
	      LocalTime date4 = LocalTime.of(22, 15);
	      System.out.println("date4: " + date4);
	        
	      // �����ַ���
	      LocalTime date5 = LocalTime.parse("20:15:30");
	      System.out.println("date5: " + date5);
	      
	      LocalDateTime now = LocalDateTime.parse("2019-05-07T12:12:18");
	      System.out.println(now);
	      
	}

}
