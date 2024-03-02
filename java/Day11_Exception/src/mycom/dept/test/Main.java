package mycom.dept.test;

import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		int j = 100;
		int z = 0;
		
		try {
			z = j/i;
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println("분모는 0이 될 수 없습니다");
		}
		
	}
}
