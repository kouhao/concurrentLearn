package concurrent.fiveDay;

public class RunnableDemo {
	public static void main(String[] args) {
		MyThread1 my = new MyThread1();
		new Thread(my).start();
		new Thread(my).start();
		new Thread(my).start();
	}
}
