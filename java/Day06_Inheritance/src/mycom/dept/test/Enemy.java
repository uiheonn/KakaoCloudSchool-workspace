package mycom.dept.test;

public class Enemy extends Character{
	public Enemy() {
		super.myShape = "Enemy";
	}
	public Enemy(int mx, int my) {
		super(mx, my);
		super.myShape = "Enemy";
	}
	public void moveDown() {
		this.y = this.y + 1;
	}
	public void moveUp() {
		this.y = this.y - 1;
	}
}
