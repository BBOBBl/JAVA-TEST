package day7;

class Multi1 extends Thread{
	public void run() {
		for(int i =1 ; i<=5; i++) {
			System.out.println(getName() + "다른작업수행");
		}
	}
}
public class MultiThreadTest {

	public static void main(String[] args) {
		Multi1 m1 = new Multi1();
		m1.setName("m1");
		m1.start();
		
		Multi1 m2 = new Multi1();
		m2.setName("m2");
		m2.start();
		
		for(int i =1 ; i<=5; i++) {
			System.out.println("메인작업수행");
		}
	}
}