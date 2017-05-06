package lesson.chap01;

/**
 * @author akkey
 * @version $Revision$, May 6, 2017
 */
public class CLesson {

  /**
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    println("" + trapezoid(2, 3, 4)); //$NON-NLS-1$
  }

  /**
   * 台形の面積を算出するメソッド
   * 
   * @param a 上庭
   * @param b 下庭
   * @param h 高さ
   * @return 台形の面積
   */
  public static int trapezoid(int a, int b, int h) {
    // 台形の面積は、上底と下底の和に高さをかけた値を2で割ることで求められる
    // まぁ、長方形にして考えてるだけなんだけどね
    return (a + b) * h / 2;
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
