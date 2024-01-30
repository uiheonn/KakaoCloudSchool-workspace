package mycom.dept.assignment;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Main {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setSize(300, 200);
		
		Panel pNorth = new Panel(new GridLayout(2,1));
		Panel pCenter = new Panel(new GridLayout(3, 2));
		Panel pSouth = new Panel(new GridLayout(1, 3));
		
		Label northLabel = new Label("로그인 화면", 1);
		northLabel.setBackground(new Color(255, 0, 255));
		Label idLabel = new Label("아이디 : ");
		TextField idField = new TextField();
		Label passLabel = new Label("비밀번호 : ");
		TextField passField = new TextField();
		
		Label btLabel = new Label("");
		Button btn1 = new Button("로그인");
		btn1.setBackground(new Color(255, 0, 255));
		Button btn2 = new Button("취소");
		btn2.setBackground(new Color(255, 0 , 255));
		
		pNorth.add(northLabel);
		pCenter.add(idLabel);
		pCenter.add(idField);
		pCenter.add(passLabel);
		pCenter.add(passField);
		pSouth.add(btLabel);
		pSouth.add(btn1);
		pSouth.add(btn2);
		
		
		frame.add("North", pNorth);
		frame.add("Center", pCenter);
		frame.add("South", pSouth);
		
		frame.setVisible(true);
	}

}
