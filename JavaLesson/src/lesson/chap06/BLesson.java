package lesson.chap06;

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
    int i = 0;

    // 10未満である限り繰り返す
    while (i < 10) {
      int j = 0;
      while (j < i * i) {
        print("*"); //$NON-NLS-1$
        j++;
      }
      i++;
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
