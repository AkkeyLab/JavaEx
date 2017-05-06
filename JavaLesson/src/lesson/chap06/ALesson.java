package lesson.chap06;

import java.io.*;


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
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      String inputString;
      // 未入力になるまで繰り返す
      while ((inputString = reader.readLine()) != null) {
        // endsWithでは文字列の終わりが引数と等しいかを判定する
        // ちなみに、文字列のはじめに関してはstartsWithを使用して判定する
        if (inputString.endsWith("{") || inputString.endsWith("}")) { //$NON-NLS-1$ //$NON-NLS-2$
          println(inputString);
        }
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
