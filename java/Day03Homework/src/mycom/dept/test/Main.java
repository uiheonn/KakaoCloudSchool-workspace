package mycom.dept.test;

public class Main {

	public static void main(String[] args) {
		// 1번
		for(int i=0; i < 5; i++) {
			for(int j=0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 2번
		for(int i=0; i < 5; i++) {
			for(int j=0; j < 5; j++) {
				if(i <= j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 3번
		for(int i=0; i < 5; i++) {
			for(int j=i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		
		//4번
		int left = 3;
		int right = 3;
		for(int i=0; i < 4; i++) {
			for(int j=0; j < left; j++) {
				System.out.print(" ");
			}
			for(int j = left; j < right+1; j++) {
				System.out.print("*");
			}
			for(int j = right+1; j < 7; j++) {
				System.out.print(" ");
			}
			left--;
			right++;
			System.out.println();
		}
	}
}