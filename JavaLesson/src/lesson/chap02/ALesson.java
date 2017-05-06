package lesson.chap02;

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
    println(Messages.getString("ALesson.0")); //$NON-NLS-1$
    outOld();
  }

  /**
   * ２人の年齢から平均年齢を算出するメソッド
   */
  public static void outOld() {
    // java.io系を一式importしておきましょう
    // 文字入力を支援
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // 繰り返しで初期化されてほしくない値を格納お
    // 配列を超先取りで使ってみた
    String[] name = new String[2];
    int age = 0;

    // できるだけ冗長なコードはなくしていきましょう
    // 2人の入力方法は共通なので繰り返し処理採用
    for (int i = 0; i < 2; i++) {
      try {
        println((i + 1) + Messages.getString("ALesson.1")); //$NON-NLS-1$
        name[i] = reader.readLine();

        println(name[i] + Messages.getString("ALesson.2")); //$NON-NLS-1$
        String inputString = reader.readLine();
        // 入力は文字列で受け付けるのでパースしてあげましょう
        age += Integer.parseInt(inputString);
      } catch (IOException e) {
        // IOに関するエラーがある場合
        println("" + e); //$NON-NLS-1$
      } catch (NumberFormatException e) {
        println(Messages.getString("ALesson.4")); //$NON-NLS-1$
        println("" + e); //$NON-NLS-1$
      }
    }

    // 2で割ってしまうと小数点以下が切り捨てられてしまうので、double型で計算してあげる
    println(name[0] + Messages.getString("ALesson.5") + name[1] + Messages.getString("ALesson.6") + (age / 2.0) + Messages.getString("ALesson.7")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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
