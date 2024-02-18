package mycom.dept.test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class MyShape extends MyFrame {
	private int x;
	private int y;
	public static final int size = 30;
	
	public MyShape() {
		Random rnd = new Random();
		x = rnd.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT - 140) + 70;
	}
	public MyShape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, size, size);
	}
}
