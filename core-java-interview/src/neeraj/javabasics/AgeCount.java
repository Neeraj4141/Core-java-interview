package neeraj.javabasics;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		LocalDate cDate = LocalDate.of(2026, 05, 05);

		Period p = Period.between(cDate, date);

		System.out.println("Year = " + p.getYears());
		System.out.println("Month = " + p.getMonths());
		System.out.println("Days = " + p.getDays());
	}

}
