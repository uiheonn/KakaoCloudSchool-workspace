package mycom.dept.com;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, "홍길동", 25, 34, 56);
		student1.printId();
		student1.printName();
		student1.printKorean();
		student1.printEnglish();
		student1.printMath();
		student1.printTotal();
		System.out.println();
		
		Student student2 = new Student(2, "김길동", 56, 78, 34);
		student2.printId();
		student2.printName();
		student2.printKorean();
		student2.printEnglish();
		student2.printMath();
		student2.printTotal();
	}

}
