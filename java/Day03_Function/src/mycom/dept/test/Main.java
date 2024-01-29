package mycom.dept.test;

public class Main {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int mmax = 0;
		mmax = getMax(a, b);
		
		a = 30; b = 40;
		mmax = getMax(a, b);
		
		a = -100; b = -200;
		mmax = getMax(a, b);
		
		System.out.println();
	}
	
	static int getMax(int x, int y) {
		int max = x;
		if(max < y) {
			max = y;
		}
		System.out.println("getMax : " + max);
		return max;
	}
}
