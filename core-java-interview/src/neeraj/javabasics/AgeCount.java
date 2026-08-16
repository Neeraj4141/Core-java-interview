package neeraj.javabasics;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		LocalDate cDate = LocalDate.of(1999, 05, 05);

		Period p = Period.between(date, cDate);

		System.out.println("Year = " + p.getYears());
		System.out.println("Month = " + p.getMonths());
		System.out.println("Days = " + p.getDays());
	}

}
