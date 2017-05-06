package lesson.chap15;

class ThreadAsterisk2 implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
      System.out.println("***"); //$NON-NLS-1$
    }
  }
}
