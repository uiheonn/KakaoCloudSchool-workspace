package mycom.dept.test;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MyFrame extends Frame {
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	
	private ArrayList<MyShape> sarr = new ArrayList<MyShape>();
	
	public MyFrame() {
		this.addMouseListener(new MyMouseHandler());
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	// inner
	class MyMouseHandler extends MyMouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			int mx = e.getX();
			int my = e.getY();
			
			sarr.add(new MyShape(mx, my));
			repaint();//repaint --> update() --> paint(g)
		}
	}

	@Override
	public void paint(Graphics g) {
		if(sarr != null) {
			for(MyShape shape : sarr) {
				shape.display(g);
			}
		}
	}
	
}
