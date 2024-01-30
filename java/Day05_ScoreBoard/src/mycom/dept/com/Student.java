package mycom.dept.com;

public class Student {
	private int id;
	private String name;
	private int korean;
	private int english;
	private int math;
	private int total;
	
	public Student(int id, String name, int korean, int english, int math) {
		this.id = id;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	public void calculate() {
		this.total = this.korean + this.english + this.math;
	}
	public void printKorean() {
		System.out.println("국어 : " + this.korean);
	}
	public void printEnglish() {
		System.out.println("영어 : " + this.english);
	}
	public void printMath() {
		System.out.println("수학 : " + this.math);
	}
	public void printTotal() {
		calculate();
		System.out.println("총점 : " + this.total);
	}
	public void printId() {
		System.out.println("학번 : " + this.id);
	}
	public void printName() {
		System.out.println("이름 : " + this.name);
	}
}
