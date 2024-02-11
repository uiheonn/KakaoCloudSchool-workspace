package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck implements Quackable{
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
	}
	@Override
	public void quack(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawString("삑삑", super.x + DUCK_SIZE, super.y - 1);
	}
}
