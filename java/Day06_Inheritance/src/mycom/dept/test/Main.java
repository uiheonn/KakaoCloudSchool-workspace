package mycom.dept.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player();
		p1.display();
		
		Enemy e1 = new Enemy();
		e1.display();
		e1.moveDown();
		e1.moveLeft();
		e1.display();
	}

}
