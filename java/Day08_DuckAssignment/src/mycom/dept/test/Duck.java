package mycom.dept.test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Duck {
	protected int x;
	protected int y;
	protected String myShape = "Duck";
	
	public Duck() {
		Random rndRandom = new Random();
		
		this.x = rndRandom.nextInt(MyFrame.FRAME_WIDTH) + 50; // 50 ~ 750
		this.y = rndRandom.nextInt(MyFrame.FRAME_HEIGHT) + 70; // 70 ~ 530
	}
	public Duck(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void display(Graphics g) {
	}
}
