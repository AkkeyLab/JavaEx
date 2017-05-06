package lesson.chap15;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class BLesson {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    new LabelPrinter(Messages.getString("BLesson.0")).start(); //$NON-NLS-1$
    new LabelPrinter(Messages.getString("BLesson.1")).start(); //$NON-NLS-1$
    new LabelPrinter(Messages.getString("BLesson.2")).start(); //$NON-NLS-1$
  }
}
