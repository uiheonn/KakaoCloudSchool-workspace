package mycom.myexam.gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

import mycom.myexam.duck.DecoyDuck;
import mycom.myexam.duck.Duck;
import mycom.myexam.duck.MallardDuck;
import mycom.myexam.duck.RedDuck;
import mycom.myexam.duck.RubberDuck;


public class MyFrame extends Frame {
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	
	Duck[] ducks = new Duck[20];
	
	public MyFrame() {
		super(); // Frame f = new Frame();
		makeDuck();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}

	private void makeDuck() {
		Random random = new Random();
		for(int i=0;i<ducks.length;i++) {
			if(random.nextInt(4) == 0) {
				ducks[i] = new MallardDuck();
				ducks[i] = (MallardDuck)ducks[i];
			}
			else if(random.nextInt(4) == 1) {
				ducks[i] = new RedDuck();
				ducks[i] = (RedDuck)ducks[i];
			}
			else if(random.nextInt(4) == 2) {
				ducks[i] = new RubberDuck();
				ducks[i] = (RubberDuck)ducks[i];
			}
			else {
				ducks[i] = new DecoyDuck();
				ducks[i] = (DecoyDuck)ducks[i];
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		if(ducks!=null) {
			for(Duck s : ducks) {
				if(s!=null) {
					s.display(g);
					s.swim(g);
				}
			}
		}
	}
}
