package mycom.dept.test;

import java.util.Random;

public class MyShape {
	private int r;
	private int g;
	private int b;
	private int x;
	private int y;
	
	public MyShape() {
		Random random = new Random();
		r = random.nextInt(256);
		g = random.nextInt(256);
		b = random.nextInt(256);
		x = random.nextInt(770);
		y = random.nextInt(570);
	}

	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
