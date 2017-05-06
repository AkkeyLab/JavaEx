package lesson.chap02;

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
    // 文字入力支援
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      println(Messages.getString("BLesson.0")); //$NON-NLS-1$
      String inputString = reader.readLine();

      // .lengthで文字列の長さを取得することができる
      for (int i = 0; i < inputString.length(); i++) {
        // charAtに何番目の文字を取得したいかを指定して、文字を取得s
        char c = inputString.charAt(i);
        // int型にキャストしてあげることで文字コードを取得することが可能
        // C言語みたい
        println(Messages.getString("BLesson.1") + c + Messages.getString("BLesson.2") + (int)c + Messages.getString("BLesson.3")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
      }
    } catch (IOException e) {
      println("" + e); //$NON-NLS-1$
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
