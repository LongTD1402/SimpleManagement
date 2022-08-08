import java.util.Scanner;

import Person1.Subject;
import Person1.Teacher;

public class main {
	public static Teacher listTeacher[];
	public static Subject listSubject[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		System.out.print("Number of Subject:");
		m = sc.nextInt();
		listSubject = new Subject[m];
		for (int i = 0; i < listSubject.length; i++) {
			System.out.println("Subject "+(i+1));
			listSubject[i] = new Subject();
			listSubject[i].input();
			System.out.println("-----");
		}
		
		int n;
		System.out.print("Number of Teacher:");
		n = sc.nextInt();
		listTeacher = new Teacher[n];
		for (int i = 0; i < listTeacher.length; i++) {
			System.out.println("Teacher "+(i+1)+" :");
			listTeacher[i] = new Teacher();
			listTeacher[i].input();
			System.out.println("   Input Subject:");
			int choose;
			System.out.println("--Choose subject:");
			for (int j = 1; j <= listSubject.length; j++) {
				System.out.print(j + "." + listSubject[j-1].getName() + "   ");
				System.out.println();
			}
			do {
				choose = sc.nextInt();
			} while (choose > listSubject.length || choose <= 0);
			for (int k = 0; k < listSubject.length; k++) {
				if (choose == k+1) {
					listTeacher[i].setSubject(listSubject[k]);
				}
			}
			System.out.println("Teacher teach "+listTeacher[i].getSubject().getName());
			System.out.println("-----");
		}
		int choose;
		do {
			System.out.println("1.Show list teacher.");
			System.out.println("2.Show a list of teachers whose salary is less than 5.000.000:");
			System.out.println("3.Calculate the total salary of all teachers.");
			System.out.println("4.Move teachers with no hours to the bottom of the list.");
			System.out.println("5.Sort names alphabetically.");
			System.out.println("0.Exit.");
			System.out.println("--->Choose:");
			choose = sc.nextInt();
			switch (choose) {
			case 1: {
				showListTeacher();
				break;
			}
			case 2: {
				Teacher list[]=new Teacher[listTeacher.length];
				teacherSalaryLess5m(list);
				System.out.println("Show a list of teachers whose salary is less than 5.000.000:");
				for (Teacher teacher : list) {
					teacher.output();
				}
				break;
			}
			case 3: {
				System.out.println("Calculate the total salary of all teachers: "+totalSalary());
				break;
			}
			case 4: {
				System.out.println("Move teachers with no hours to the bottom of the list:");
				moveNoHour(listTeacher);
				break;
			}
			case 0: {
				System.out.println("[!!!]Exited");
			}
			default:
				System.out.println("[!!!]This option is not available.");
				break;
			}
		} while (choose != 0);
	}

	public static void showListTeacher() {
		for (Teacher teacher : listTeacher) {
			teacher.output();
			System.out.println("=====================");
		}
	}
	public static Teacher[] teacherSalaryLess5m(Teacher[] list) {
		int count=0;
		for (int i = 0; i < listTeacher.length; i++) {
			if(listTeacher[i].calcuSalary()<5000000) {
				Teacher tea=new Teacher();
				tea=listTeacher[i];
				list[count]=tea;
				count++;
			}
		}
		return list;
	}
	public static Double totalSalary() {
		double total=0;
		for (Teacher tea : listTeacher) {
			total+=tea.calcuSalary();
		}
		return total;
	}
	public static Teacher[] moveNoHour(Teacher[] list) {
		Teacher tea= new Teacher();
		for (int i = 0; i < list.length; i++) {
			if(list[i].getNumberOfTeachingHours()==0) {
				tea=list[i];
				for (int j = i; j < list.length-1; j++) {
					list[j]=list[j+1];
				}
				list[list.length-1]=tea;
			}
		}
		return list;
	}
}
