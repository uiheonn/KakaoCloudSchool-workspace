package mycom.dept.test;

import java.awt.Color;
import java.awt.Graphics;

public class MallrdDuck extends Duck {
	public MallrdDuck() {
		super();
		super.myShape = "MallrdDuck";
	}
	public MallrdDuck(int x,int y) {
		super(x,y);
		super.myShape = "MallrdDuck";
	}
	@Override
	public void display(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.drawString(myShape, x, y);
	}
}
