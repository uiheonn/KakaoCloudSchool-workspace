package mycom.myexam.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck{
	public RubberDuck() {
		super();
	}
	public RubberDuck(int x,int y) {
		super(x,y);
	}
	@Override
	public void display(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, Duck.DUCK_SIZE, DUCK_SIZE);
		quack(g);
	}
	@Override
	public void quack(Graphics g) {
		g.drawString("삑삑", super.x + DUCK_SIZE, super.y - 1);
	}
}
