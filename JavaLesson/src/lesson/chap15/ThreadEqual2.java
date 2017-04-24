package lesson.chap15;

class ThreadEqual2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			System.out.println("=====");
		}
	}
}
