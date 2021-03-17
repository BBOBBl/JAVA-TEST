package runna;

class Multi1 implements Runnable{
	public void run() {
		for(int i =1 ; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + "다른작업수행");
		}
	}
}
public class MultiThreadTest {

	public static void main(String[] args) {
		Multi1 m1 = new Multi1();
		Thread t1 = new Thread(m1);
		
		t1.setName("t1");
		t1.start();
		
		Multi1 m2 = new Multi1();
		Thread t2 = new Thread(m2);
		t2.setName("t2");
		t2.start();
		
		for(int i =1 ; i<=5; i++) {
			System.out.println("메인작업수행");
		}
	}
}
