package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;



public class MallardDuck extends Duck implements Flyable, Quackable{
	public MallardDuck() {
		super();
	}
	public MallardDuck(int x,int y) {
		super(x,y);
	}
	@Override
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, Duck.DUCK_SIZE, DUCK_SIZE);
	}
	@Override
	public void fly(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("날다", super.x-1, super.y+ 7 + DUCK_SIZE);
	}
	@Override
	public void quack(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("꽥꽥", super.x + DUCK_SIZE, super.y - 1);
	}
}
