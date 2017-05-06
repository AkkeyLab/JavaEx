package lesson.chap15;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class ALesson {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    LabelPrinter th = new LabelPrinter(Messages.getString("ALesson.0")); //$NON-NLS-1$
    th.start();
  }
}
