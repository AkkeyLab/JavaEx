package lesson.chap01;

/**
 * @author akkey
 * @version $Revision$, May 6, 2017
 */
public class BLesson {

  /**
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    product();
  }

  /**
   * 0x0から10x10までを計算して出力するメソッド
   */
  public static void product() {
    // Swiftであるとこのフォーマットでfor文を書くことができなくなった
    for (int i = 0; i <= 10; i++) {
      println("" + i + Messages.getString("BLesson.1") + i + Messages.getString("BLesson.2") + (i * i)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }
  }

  /**
   * C言語風にフォーマット指定で記述 Swiftでもこのようなフォーマット方法が使用できる。
   */
  public static void product_c() {
    for (int i = 0; i <= 10; i++) {
      // クラス名で区別してるんだ
      System.out.printf("%d × %d = %d%n", i, i, i * i); //$NON-NLS-1$
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
