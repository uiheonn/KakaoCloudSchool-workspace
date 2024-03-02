package mycom.dept.test;

public class MyService {
	@PrintAnnotation()
	public void printTest() {
		System.out.println("인쇄 실행");
	}
	@PrintAnnotation()
	public void printTest2() {
		System.out.println("인쇄 실행2");
	}
	@PrintAnnotation()
	public void printTest3() {
		System.out.println("인쇄 실행3");
	}
}
