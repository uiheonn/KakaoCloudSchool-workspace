package mycom.dept.test;

import java.util.Random;

public abstract class Duck {
	protected int x;
	protected int y;
	protected String myShape = "Duck";
	
	public Duck() {
		Random rdn = new Random();
		x = rdn.nextInt(800);
		y = rdn.nextInt(600);
	}
	//overloading

	public Duck(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	// 추상 메소드 = 구현부가 없는 메소드 -> 추상 클래스를 생성해야 함
	public abstract void display();
	public void swim() {
		System.out.println("수영중...");
	}
	public void quack() {
		System.out.println("꽥꽥...");
	}
	
}
