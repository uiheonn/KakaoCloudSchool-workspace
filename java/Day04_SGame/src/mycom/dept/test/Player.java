package mycom.dept.test;
import java.util.*;

public class Player {
	// 인스턴스 변수 = 속성
	private int x;
	private int y;
	private String shape;
	
	public Player() {
		Random random = new Random();
		random.nextInt(800);
		x = random.nextInt(800);
		y = random.nextInt(600);
		shape = "Player";
	}
	// 메소드의 오버로딩
	public Player(int mx, int my) {
		this.x = mx;
		this.y = my;
		shape = "Player";
	}
	
	public void display() {
		System.out.println("x : " + x + " y : " + y);
		System.out.println("shape : " + shape);
	}
	public void moveLeft() {
		this.x = this.x - 1;
		System.out.println("왼쪽으로 한칸 이동합니다");
		this.display();
	}
	public void moveRight() {
		this.x = this.x + 1;
		System.out.println("오른쪽으로 한칸 이동합니다");
		this.display();
	}
}
