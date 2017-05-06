package lesson.chap12;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class DLesson {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    try {
      method1(0);
    } catch (Exception e) {
      println(Messages.getString("DLesson.0") + e); //$NON-NLS-1$
    }
    try {
      method2(0);
    } catch (Exception e) {
      println(Messages.getString("DLesson.1") + e); //$NON-NLS-1$
    }
    try {
      method3(0);
    } catch (Exception e) {
      println(Messages.getString("DLesson.2") + e); //$NON-NLS-1$
    }
  }

  static void method1(int x) throws Exception {
    if (x > 0) {
      throw new Exception();
    }
  }

  static void method2(int x) throws Exception {
    if (x == 0) {
      throw new Exception();
    }
  }

  static void method3(int x) throws Exception {
    if (x > 0) {
      throw new Exception();
    }
  }

  /**
   * 文字出力が簡単にできるメソッド
   * 
   * @param s 出力する文字列
   */
  public static void println(String s) {
    System.out.println(s);
  }
}
