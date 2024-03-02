package mycom.dept.test;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Horse extends Canvas implements Runnable {
	public static int winNum = 1;
	private int r;
	private int x;
	private int y;
	private int HORSE_SIZE = 30;
	
	
	public Horse() {
		this.x = 20;
		this.y = 20;
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, HORSE_SIZE, HORSE_SIZE);
		if(x >= 750) {
			g.drawString(winNum + "등", x, y);
			winNum++;
		}
	}

	@Override
	public void run() {
		while(x < 750) {
			Random random = new Random();
			r = random.nextInt(5);
			x+=r;
			repaint();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				System.out.println("에러 발생");
			}
		}
	}
	
	
}
