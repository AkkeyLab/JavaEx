package lesson.chap08;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class DLesson {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    // 配列の要素中の配列は盗一化させる必要がない
    int[][] arr = {{3, 1, 4, 1}, {5, 9, 2}, {6, 5}, {3}};
    printArray(arr);
  }

  /**
   * 配列を表示するメソッド 多次元配列になっても、そこまで難易度は変わらない
   * 
   * @param a 二次元文字列配列
   */
  public static void printArray(int[][] a) {
    println(Messages.getString("DLesson.0")); //$NON-NLS-1$
    for (int i = 0; i < a.length; i++) {
      print(Messages.getString("DLesson.1")); //$NON-NLS-1$
      for (int j = 0; j < a[i].length; j++) {
        print(a[i][j] + Messages.getString("DLesson.2")); //$NON-NLS-1$
      }
      println(Messages.getString("DLesson.3")); //$NON-NLS-1$
    }
    println(Messages.getString("DLesson.4")); //$NON-NLS-1$
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
