package lesson.chap15;

class ThreadEqual1 extends Thread {
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
