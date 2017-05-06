package lesson.chap03;

import java.io.*;


/**
 * @author akkey
 * @version $Revision$, May 6, 2017
 */
public class ALesson {

  /**
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    println(Messages.getString("ALesson.0")); //$NON-NLS-1$
    try {
      // tryが必要なのはこの2つ
      String inputString = reader.readLine();
      int n = Integer.parseInt(inputString);

      println(greeting(n));
    } catch (IOException e) {
      println("" + e); //$NON-NLS-1$
    } catch (NumberFormatException e) {
      println(Messages.getString("ALesson.2")); //$NON-NLS-1$
      println("" + e); //$NON-NLS-1$
    }
  }

  /**
   * @param n 時間
   * @return 時間に対応した挨拶文字列
   */
  public static String greeting(int n) {
    if (0 <= n && n <= 11) {
      return Messages.getString("ALesson.3"); //$NON-NLS-1$
    } else if (n == 12) {
      return Messages.getString("ALesson.4"); //$NON-NLS-1$
    } else if (13 <= n && n <= 18) {
      return Messages.getString("ALesson.5"); //$NON-NLS-1$
    } else if (19 <= n && n <= 23) {
      return Messages.getString("ALesson.6"); //$NON-NLS-1$
    } else {
      return Messages.getString("ALesson.7"); //$NON-NLS-1$
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
