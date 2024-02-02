package mycom.dept.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck m1 = new MallardDuck();
		m1.display();
		
		RedDuck r1 = new RedDuck();
		r1.display();

		MallardDuck[] marr = new MallardDuck[10];
		for(MallardDuck mallardDuck :  marr) {
			mallardDuck.display();
		}
	}
}
