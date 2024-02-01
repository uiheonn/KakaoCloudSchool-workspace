package mycom.dept.test;

import java.util.Random;

public class Character {
	protected int x;
	protected int y;
	protected String myShape;
	
	public Character() {
		Random rnd = new Random();
		this.x = rnd.nextInt(800);
		this.y = rnd.nextInt(600);
		this.myShape = "Character";
	}
	public Character(int x, int y) {
		this.x = x;
		this.y = y;
		this.myShape = "Character";
	}
	
	public void display() {
		System.out.println(x + " , " + y + " = " + myShape);
	}
	public void moveLeft() { 
		
	}
	public void moveRight() {
		
	}
	public int getX() {
		return x;
	}
}
