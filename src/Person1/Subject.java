package Person1;

import java.util.Scanner;

public class Subject {
	Scanner sc= new Scanner(System.in);
	private static int currentCode=0;
	private int code;
	private String name;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject() {
		currentCode++;
		this.code=currentCode;
	}
	public void input() {
		System.out.print("    Input name sub:");
		name=sc.nextLine();
	}
	public void showSub() {
		System.out.println("Sub code:"+code+" ; Sub name:"+name);
	}

}
