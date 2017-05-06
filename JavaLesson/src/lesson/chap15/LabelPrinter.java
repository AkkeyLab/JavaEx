package lesson.chap15;

class LabelPrinter extends Thread {

  String label = Messages.getString("LabelPrinter.0"); //$NON-NLS-1$

  LabelPrinter(String label) {
    this.label = label;
  }

  @Override
  public void run() {
    while (true) {
      System.out.println(this.label);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    }
  }
}
