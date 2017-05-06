package lesson.chap05;

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
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        print(i + Messages.getString("BLesson.0") + j + Messages.getString("BLesson.1") + (i * j) + Messages.getString("BLesson.2")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
      }
      println(""); //$NON-NLS-1$
    }
  }

  /**
   * 九九を出力するメソッド フォーマット指定による実装
   */
  public static void kuku() {
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        // 「d」で10進数
        // 「-」で左詰め
        // 「4」で最低でも4桁準備
        // http://www.ne.jp/asahi/hishidama/home/tech/java/formatter.html

        // 名前と挙動はC言語似
        System.out.printf("%d*%d=%-4d", i, j, i * j); //$NON-NLS-1$
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
