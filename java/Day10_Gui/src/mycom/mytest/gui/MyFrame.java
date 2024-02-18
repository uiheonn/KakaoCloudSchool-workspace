package mycom.mytest.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame{
	Button btn_colorButton = new Button("배경색 바꾸기");
	Button btn_exitButton = new Button("종료하기");
	Panel pNorth = new Panel();
	public MyFrame() {
		super();
		
		btn_colorButton.addActionListener(new MyHandler());
		btn_exitButton.addActionListener(new MyHandler());
		
		pNorth.add(btn_colorButton);
		pNorth.add(btn_exitButton);
		
		this.add(BorderLayout.NORTH, pNorth);
		
		this.setSize(800, 600);
		this.setVisible(true);
	}
	
	class MyHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn_colorButton) {
				MyFrame.this.setBackground(new Color(255,255,0));
			} else if(e.getSource() == btn_exitButton) {
				System.exit(0);
			}
		}
		
	}
};
