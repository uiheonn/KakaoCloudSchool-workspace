package mycom.dept.test;

import java.awt.*;
import java.util.Random;

public class MyFrame extends Frame {
	public final int FRAME_WIDTH = 800;
	public final int FRAME_HEIGHT = 600;
	private int x;
	private int y;
	private int[] numArr = new int[10];
	private MyShape[] mShapes = new MyShape[10];
	
	public MyFrame() {
		super(); // Frame f = new Frame();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
		init();
		arrayInit();
	}
	
	public void init(){
		for(int i=0;i<10;i++) {
			mShapes[i] = new MyShape(); 
		}
	}
	
	public void arrayInit() {
		for(int i=0; i < 10; i++) {
			Random r = new Random();
			int number = r.nextInt(4);
			numArr[i] = number; 
		}
	}
	
	@Override
	public void paint(Graphics g) {
		for(int i=0; i < 10; i++) {
			if(numArr[i] == 0) {
				g.setColor(new Color(mShapes[i].getR(), mShapes[i].getG(), mShapes[i].getB()));
				g.fillOval(mShapes[i].getX(), mShapes[i].getY(), 30, 30);
			}
			else if(numArr[i] == 1) {
				g.setColor(new Color(mShapes[i].getR(), mShapes[i].getG(), mShapes[i].getB()));
				g.fillRect(mShapes[i].getX(), mShapes[i].getY(), 30, 30);
			}
			else if(numArr[i] == 2){
				this.x = mShapes[i].getX();
				this.y = mShapes[i].getY();
				int[] xPoints = {x, x - 30/2, x + 30/2};
		        int[] yPoints = {y - 30/2, y + 30/2, y + 30/2};
				int numPoints = 3;
				g.setColor(new Color(mShapes[i].getR(), mShapes[i].getG(), mShapes[i].getB()));
				g.fillPolygon(xPoints, yPoints, numPoints);
			}
			else {
				this.x = mShapes[i].getX();
				this.y = mShapes[i].getY();
				int[] xPoints = {x+21,x+17,x+6,x+15,x+11,x+21,x+31,x+27,x+36,x+24,x+21};;
				int[] yPoints = {y+6,y+16,y+16,y+22,y+34,y+27,y+34,y+22,y+16,y+16,y+6};
				int numPoints = 10;
				g.setColor(new Color(mShapes[i].getR(), mShapes[i].getG(), mShapes[i].getB()));
				g.fillPolygon(xPoints, yPoints, numPoints);
			}
		}
	}
}
