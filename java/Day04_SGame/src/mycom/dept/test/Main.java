package mycom.dept.test;

public class Main {

	public static void main(String[] args) {
		Player pobj = new Player();
		pobj.display();
		pobj.moveLeft();
		
		System.out.println("---------------");
		
		Player pobj2 = new Player(156, 200);
		pobj2.display();
		pobj2.moveRight();
		
		System.out.println("---------------");
		
		Enemy enemy = new Enemy();
		enemy.display();
		enemy.moveDown();
		
		System.out.println("---------------");
		
		Enemy enemy2 = new Enemy(100, 100);
		enemy2.display();
		enemy2.moveUp();
		
	}
}
