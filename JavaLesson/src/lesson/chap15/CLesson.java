package lesson.chap15;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class CLesson extends Thread {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    for (int ti = 0; ti < 3; ti++) {
      new CLesson().start();
    }
    for (int i = 0; i < 10; i++) {
      System.out.println(Messages.getString("CLesson.0") + i + Messages.getString("CLesson.1") + currentThread().getName()); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(Messages.getString("CLesson.2") + i + Messages.getString("CLesson.3") + getName()); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }
}
