package lesson.chap12;

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
    try {
      // 以下の各メソッドでthrowsを使っているので、ここに例外が来る
      method1(0);
      method2(0);
      method3(0);
    } catch (Exception e) {
      println(Messages.getString("BLesson.0") + e); //$NON-NLS-1$
      // スタックトレースの出力
      e.printStackTrace();
    }
  }

  // throwsで呼び出し元に例外を投げる
  static void method1(int x) throws Exception {
    if (x > 0) {
      // 手動で例外を生成して投げる
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
