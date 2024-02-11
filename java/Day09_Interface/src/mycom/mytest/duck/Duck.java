package mycom.mytest.duck;

import java.awt.Graphics;
import java.util.Random;

import mycom.mytest.gui.MyFrame;


public abstract class Duck {
	protected int x;
	protected int y;
	public static final int DUCK_SIZE = 30;
	
	public Duck() {
		Random rnd = new Random();
		this.x = rnd.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;
		this.y = rnd.nextInt(MyFrame.FRAME_HEIGHT - 140) + 70;
	}
	public Duck(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void display(Graphics g);
	public final void swim(Graphics g) {
		g.drawString("수영", x-1, y-1);
	}
}
