package mycom.dept.test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MyShape {
	private int x;
	private int y;
	public static final int SHAPE_SIZE = 50;
	
	public MyShape() {
		Random rndRandom = new Random();
		
		this.x = rndRandom.nextInt(MyFrame.FRAME_WIDTH) + 50; // 50 ~ 750
		this.y = rndRandom.nextInt(MyFrame.FRAME_HEIGHT) + 70; // 70 ~ 530
	}
	public MyShape(int x,int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void display(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x,y,MyShape.SHAPE_SIZE,MyShape.SHAPE_SIZE);
	}
}
