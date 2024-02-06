package mycom.dept.test;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck{
	public RedDuck() {
		super();
		super.myShape = "RedDuck";
	}
	public RedDuck(int x,int y) {
		super(x,y);
		super.myShape = "RedDuck";
	}
	@Override
	public void display(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		g.drawString(myShape, x, y);
	}
	
}
