package mycom.mytest.duck;

import java.awt.Graphics;
import java.util.Random;

public class DuckManager {
	private Duck[] ducks = new Duck[20];
	private static DuckManager duckManager = null;
	
	private DuckManager() {
		makeDuck();
	}
	
	public static DuckManager getDuckManager() {
		if(duckManager == null) {
			duckManager = new DuckManager();
		}
		return duckManager;
	}
	
	public void makeDuck() {
		Random random = new Random();
		int type = 0;
		for(int i=0;i<ducks.length;i++) {
			type = random.nextInt(4);
			if(type == 0) {
				ducks[i] = new MallardDuck(); // 업캐스팅
			}
			else if(type == 1) {
				ducks[i] = new RedDuck(); // 업캐스팅
			}
			else if(type == 2) {
				ducks[i] = new RubberDuck(); // 업캐스팅
			}
			else {
				ducks[i] = new DecoyDuck(); // 업캐스팅
			}
		}
	}
	
	public void displayAllDucks(Graphics g) {
		for(Duck duck : ducks) {
			duck.display(g); // 업캐스팅이 되었더라도 오버라이딩한 메소드는 자식것이 불린다
		}
	}
	public void quackAllDucks(Graphics g) {
		for(Duck duck : ducks) {
			// 자식 --> 부모로 업캐스팅 --> 자식으로 다운캐스팅
			// quack을 가지고 있는 자식을 다운캐스팅하면 됨
			if(duck instanceof Quackable) { // Quackable이 가능한 객체이면 quack을 실행
				((Quackable)duck).quack(g);
			}
		}
	}
	public void swimAllDucks(Graphics g) {
		for(Duck duck:ducks) {
			duck.swim(g);
		}
	}
	public void flyAllDucks(Graphics g) {
		for(Duck duck : ducks) {
			if(duck instanceof Flyable) {
				((Flyable)duck).fly(g);
			}
		}
	}
}
