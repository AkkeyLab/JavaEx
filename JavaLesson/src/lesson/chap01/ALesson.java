package lesson.chap01;

/**
 * @author akkey
 * @version $Revision$, May 6, 2017
 */
public class ALesson {

  /**
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    // 整数直後に「L」を付けることでlong intとして扱うことができる
    // Swiftならasで型を指定してあげればいいと思う
    println("" + (100000L * 100000L)); //$NON-NLS-1$
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
