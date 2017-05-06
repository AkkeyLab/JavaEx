package lesson.chap12;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class CLesson {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    println("" + factorial(10)); //$NON-NLS-1$
  }

  /**
   * 階乗計算を行うメソッド
   * 
   * @param n 数値
   * @return 階乗結果
   */
  public static int factorial(int n) {
    if (n <= 0) {
      return 1;
    }
    return n * factorial(n - 1);
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
