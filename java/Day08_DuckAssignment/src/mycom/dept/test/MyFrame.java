package mycom.dept.test;

import java.awt.Frame;
import java.awt.Graphics;


public class MyFrame extends Frame {
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	
	MallrdDuck[] mallrdDucks = new MallrdDuck[5];
	RedDuck[] redDucks = new RedDuck[5];
	
	public MyFrame() {
		super(); // Frame f = new Frame();
		makeDuck();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	private void makeDuck() {
		for(int i=0;i<5;i++) {
			mallrdDucks[i] = new MallrdDuck(); 
		}
		for(int i=0;i<5;i++) {
			redDucks[i] = new RedDuck(); 
		}
	}
	
	@Override
	public void paint(Graphics g) {
		if(mallrdDucks!=null) {
			for(MallrdDuck s:mallrdDucks) {
				if(s!=null) {
					s.display(g);
				}
			}
		}
		if(redDucks!=null) {
			for(RedDuck s:redDucks) {
				if(s!=null) {
					s.display(g);
				}
			}
		}
	}
}
