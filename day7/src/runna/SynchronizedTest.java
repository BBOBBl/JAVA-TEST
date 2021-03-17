package runna;

class MyStackThread extends Thread{
	MyStack st;
	char c;
	MyStackThread(MyStack st, char c){
		this.st = st;
		this.c = c;
	}
	public void run() {
		for(int i = 1; i<=5;i++) {
			
		}
	}
	
}

class MyStack{
	char[] ch = new char[10];
	int idx = 0;
	void push(char c) {
		synchronized(ch) { // 동기화 해줄것
		ch[idx] = c;
		System.out.print(Thread.currentThread().getName() + ", idx = "+ idx + " , ch[idx] = " + ch[idx]);
		}
	}
}
public class SynchronizedTest {

	public static void main(String[] args) {
		

	}

}
