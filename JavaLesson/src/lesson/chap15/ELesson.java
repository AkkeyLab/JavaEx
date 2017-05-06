package lesson.chap15;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class ELesson {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    new Thread(new ThreadAsterisk2()).start();
    new Thread(new ThreadEqual2()).start();
  }
}
