package lesson.chap15;

class Job {

  int num;

  public Job(int n) {
    this.num = n;
  }

  public void work() {
    System.out.println(this + Messages.getString("Job.0")); //$NON-NLS-1$
    try {
      int n = (int)(Math.random() * 10000);
      Thread.currentThread();
      Thread.sleep(n);
    } catch (InterruptedException e) {
      System.out.println(e);
    }
  }

  @Override
  public String toString() {
    return Messages.getString("Job.1") + this.num + Messages.getString("Job.2"); //$NON-NLS-1$ //$NON-NLS-2$
  }
}
