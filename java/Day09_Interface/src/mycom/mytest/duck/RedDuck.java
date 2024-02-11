package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck implements Flyable, Quackable{
	public RedDuck() {
		super();
	}
	public RedDuck(int x,int y) {
		super(x,y);
	}
	@Override
	public void display(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, Duck.DUCK_SIZE, DUCK_SIZE);
	}
	@Override
	public void fly(Graphics g) {
		g.setColor(Color.RED);
		g.drawString("날다", super.x-1, super.y+ 7 + DUCK_SIZE);
	}
	@Override
	public void quack(Graphics g) {
		g.setColor(Color.RED);
		g.drawString("꽥꽥", super.x + DUCK_SIZE, super.y - 1);
	}
}
