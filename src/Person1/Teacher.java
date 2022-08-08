package Person1;

import java.util.Scanner;

public class Teacher extends Employee {
	Scanner sc=new Scanner(System.in);
	private Subject subject;
	private double coefficientsSalary;
	private double salary;
	private int numberOfTeachingHours;
	
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNumberOfTeachingHours() {
		return numberOfTeachingHours;
	}

	public void setNumberOfTeachingHours(int numberOfTeachingHours) {
		this.numberOfTeachingHours = numberOfTeachingHours;
	}
	@Override
	public void input() {
		super.input();
		System.out.print("   Input coefficients Salary:");
		coefficientsSalary=sc.nextDouble();
		System.out.print("   Input salary:");
		salary=sc.nextDouble();
		System.out.print("   Input number of Teaching hours:");
		numberOfTeachingHours=sc.nextInt();
	}

	public void output() {
		super.output();
		System.out.print("Subject-- ");
		subject.showSub();
		System.out.println("Coefficients Salary:" + coefficientsSalary);
		System.out.println("Salary: " + salary);
		System.out.println("Number of Teaching hours: " + numberOfTeachingHours);
		System.out.println("Total salary:"+calcuSalary());
		System.out.println("------------------------");
	}

	public double calcuSalary() {
		return coefficientsSalary * 1150000 + numberOfTeachingHours * 60000;
	}
}
