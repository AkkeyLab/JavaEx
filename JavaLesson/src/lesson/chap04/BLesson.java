package lesson.chap04;

import java.io.*;


/**
 * @author akkey
 * @version $Revision$, May 6, 2017
 */
public class BLesson {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    println(Messages.getString("BLesson.0")); //$NON-NLS-1$
    try {
      String inputString = reader.readLine();
      int n = Integer.parseInt(inputString);
      outAns(n);

    } catch (IOException e) {
      println("" + e); //$NON-NLS-1$
    } catch (NumberFormatException e) {
      println(Messages.getString("BLesson.2")); //$NON-NLS-1$
      println("" + e); //$NON-NLS-1$
    }
  }

  /**
   * 選択数値に応じた返答を文字列で出力するメソッド
   * 
   * @param n 返答数値
   */
  public static void outAns(int n) {
    String[] week = {Messages.getString("BLesson.3"), Messages.getString("BLesson.4"), Messages.getString("BLesson.5"), Messages.getString("BLesson.6"), Messages.getString("BLesson.7"), //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$//$NON-NLS-4$//$NON-NLS-5$
        Messages.getString("BLesson.8"), Messages.getString("BLesson.9")}; //$NON-NLS-1$ //$NON-NLS-2$

    if (0 <= n && n < 7) {
      println(week[n]);
    } else {
      println(Messages.getString("BLesson.10")); //$NON-NLS-1$
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
