package lesson.chap08;

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
    int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};

    println(originalMax(data));
    println(exMax(data));
  }

  /**
   * 比較的簡単なアルゴリズムを利用したメソッド 仮の最大値を設定し、各データを比較しながら最大値を更新していくスタイルである
   * 
   * @param data 比較対象の数値配列
   * @return ソート後の文字列
   */
  public static String originalMax(int[] data) {
    int max_data = data[0];
    for (int i = 0; i < data.length; i++) {
      if (max_data < data[i]) {
        max_data = data[i];
      }
    }
    return Messages.getString("CLesson.0") + max_data + Messages.getString("CLesson.1"); //$NON-NLS-1$ //$NON-NLS-2$
  }

  /**
   * 一部簡略化したソートメソッド
   * 
   * @param data 比較対象の数値配列
   * @return ソート後の文字列
   */
  public static String exMax(int[] data) {
    int max_data = data[0];
    for (int i = 0; i < data.length; i++) {
      // Mathのmaxは引数に与えられた値の中で最大なものを戻り値として返す
      // ifで分岐させる必要がなくなっている
      max_data = Math.max(max_data, data[i]);
    }
    return Messages.getString("CLesson.2") + max_data + Messages.getString("CLesson.3"); //$NON-NLS-1$ //$NON-NLS-2$
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
