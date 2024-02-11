package mycom.mytest.gui;

import java.awt.Frame;
import java.awt.Graphics;

import mycom.mytest.duck.DuckManager;

public class MyFrame extends Frame{
	
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	DuckManager mgr = DuckManager.getDuckManager();
	
	public MyFrame() {
		super();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		if(mgr != null) {
			mgr.displayAllDucks(g);
			mgr.swimAllDucks(g);
			mgr.quackAllDucks(g);
			mgr.flyAllDucks(g);
		}
		
	}
}
