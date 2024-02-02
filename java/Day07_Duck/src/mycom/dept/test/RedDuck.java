package mycom.dept.test;


public class RedDuck extends Duck{
	public RedDuck() {
		
	}
	public RedDuck(int x, int y) {
		super(x, y);
	}
	@Override
	public void display() {
		this.myShape = "RedDuck";
		System.out.println("x : " + x + " y : " + y + " -> " + this.myShape);
	}
	
}
