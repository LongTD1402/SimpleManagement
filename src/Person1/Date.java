package Person1;

import java.util.Scanner;

public class Date {
	Scanner sc=new Scanner(System.in);
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void inputDate() {
		System.out.print("    Input day:");
		day= sc.nextInt();
		System.out.print("    Input month:");
		month= sc.nextInt();
		System.out.print("    Input year:");
		year= sc.nextInt();
		
	}
	public void showDate() {
		System.out.println(day+"/"+month+"/"+year);
	}
}
