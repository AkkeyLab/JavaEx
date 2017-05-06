package lesson.chap05;

/**
 * @author akkey
 * @version $Revision$, May 6, 2017
 */
public class ALesson {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      print(i + Messages.getString("ALesson.0")); //$NON-NLS-1$
      for (int j = 0; j < i * i; j++) {
        print(Messages.getString("ALesson.1")); //$NON-NLS-1$
      }
      println(""); //$NON-NLS-1$
    }
  }

  /**
   * 改行を行わない文字出力
   * 
   * @param s 出力する文字列
   */
  public static void print(String s) {
    System.out.print(s);
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
