package lesson.chap15;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class GLesson extends Thread {

  /**
   * {@inheritDoc}
   */
  @Override
  public void run() {
    while (true) {
      // 100円預け入れ
      OneBank.addMoney(100);
      // 100円引き出し
      OneBank.addMoney(-100);
    }
  }

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    new GLesson().start();
    new GLesson().start();
  }
}
