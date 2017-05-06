package lesson.chap02;

/**
 * @author akkey
 * @version $Revision$, May 6, 2017
 */
public class CLesson {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    // 基本的に制度が高い数値に合わせて結果が出力される
    println(Messages.getString("CLesson.0") + (300000L * 60 * 60 * 24) + Messages.getString("CLesson.1")); //$NON-NLS-1$ //$NON-NLS-2$
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
