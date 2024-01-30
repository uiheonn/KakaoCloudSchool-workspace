package mycom.dept.test;

import java.util.Random;

public class Enemy {
	private int x;
	private int y;
	private String shape;
	
	public Enemy() {
		Random random = new Random();
		this.x = random.nextInt(800);
		this.y = random.nextInt(600);
		shape = "Enemy";
	}
	
	public Enemy(int Ex, int Ey) {
		this.x = Ex;
		this.y = Ey;
		shape = "Enemy";
	}
	
	public void display() {
		System.out.println("x : " + this.x + " y : " + this.y);
		System.out.println("shape : " + this.shape);
	}
	public void moveLeft() {
		this.x = this.x - 1;
		System.out.println("왼쪽으로 한칸 이동합니다");
		display();
	}
	public void moveRight() {
		this.x = this.x + 1;
		System.out.println("오른쪽으로 한칸 이동합니다");
		display();
	}
	public void moveUp() {
		this.y = this.y - 1;
		System.out.println("위쪽으로 한칸 이동합니다");
		display();
	}
	public void moveDown() {
		this.y = this.y + 1;
		System.out.println("아래쪽으로 한칸 이동합니다");
		display();
	}
}
