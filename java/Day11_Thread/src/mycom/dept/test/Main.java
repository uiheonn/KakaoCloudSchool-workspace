package mycom.dept.test;

public class Main {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new MyThread());
		thread.start(); // 이제 메인 쓰레드 1, MyThread 1 가 경쟁한다	
		
		for(int i=0;i<10;i++) {
			System.out.println("main_thread : " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("main_thread가 깨어납니다.");
			}
		}
	}
}
