package lesson.chap07;

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
    for (int n = -8; n <= 8; n++) {
      printGraph(n * n);
    }
  }

  /**
   * グラフを出力するメソッド
   * 
   * @param x 表示回数
   */
  public static void printGraph(int x) {
    for (int i = 0; i < x; i++) {
      print("*"); //$NON-NLS-1$
    }
    println(""); //$NON-NLS-1$
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
