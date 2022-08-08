package Person1;

import java.util.Scanner;

public class Employee {
	Scanner sc=new Scanner(System.in);
	private static int currentCode=0;
	protected int code;
	protected String surname;
	protected String name;
	Date dateOfBirth=new Date();
	int exp;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public Employee() {
		currentCode++;
		this.code=currentCode;
	}
	public void input() {
		System.out.print("   Input Surname:");
		surname=sc.nextLine();
		System.out.print("   Input Name:");
		name=sc.nextLine();
		System.out.println("   Input date of birth:");
		dateOfBirth.inputDate();
		System.out.print("   Input Experience:");
		exp=sc.nextInt();
	}
	public void output() {
		System.out.println("Code: "+code);
		System.out.println("Full name: "+surname+" "+name);
		System.out.println("Date of birth: ");
		dateOfBirth.showDate();
		System.out.println("Experience: "+exp);
	}
}
