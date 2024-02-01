package mycom.dept.test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Main {

	public static void main(String[] args) {
		Frame f = new Frame();
		
		// 화면 구성
		Button btn = new Button("배경색 바꾸기");
		Button btnExit = new Button("종료하기");
		
		// Container Component 생성
		Panel pNorth = new Panel();
		
		// 계층 구조
		pNorth.add(btn);
		pNorth.add(btnExit);
		f.add("North", pNorth);
		
		f.setSize(800, 600);
		f.setVisible(true); // 운영체제에게 프레임 화면에 대한 권한을 f에게 전가
	}
}
