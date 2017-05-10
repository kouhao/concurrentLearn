package concurrent.fiveDay;

public class MyThread1 implements Runnable {
	private int ticket = 5;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (ticket > 0) {
				System.out.println(Thread.currentThread().getName() + ":ticket = " + ticket--);
			}
		}

	}

}
