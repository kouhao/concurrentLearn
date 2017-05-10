package concurrent.fiveDay;

public class ThreadDemo {
	public static void main(String[] args) {
		new MyThread().start();
		new MyThread().start();
		new MyThread().start();
	}
}
