package lesson.chap08;

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
    double[] data = {3.1, 4.1, 5.9, 2.6, 5.3, 9.7};
    double sum = 0.0;

    // データ型 変数名: コレクション

    // Swiftでは以下のように書く。ほぼ同じ。
    // for d in data {
    for (double d : data) {
      sum += d;
    }
    println(Messages.getString("ALesson.0") + sum); //$NON-NLS-1$
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
