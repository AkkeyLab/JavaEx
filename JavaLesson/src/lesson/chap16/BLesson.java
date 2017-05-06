package lesson.chap16;

import java.io.*;


/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class BLesson {

  static final int MAX_PRIME = 1000;
  private static PrintWriter writer;

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    // コマンド引数は適切？
    if (args.length != 1) {
      println(Messages.getString("BLesson.0")); //$NON-NLS-1$
      println(Messages.getString("BLesson.1")); //$NON-NLS-1$
      // 終了
      System.exit(0);
    }

    // 引数を取得
    String filename = args[0];
    try {
      writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
      writePrime(writer);
      writer.close();
    } catch (FileNotFoundException e) {
      println(filename + Messages.getString("BLesson.2")); //$NON-NLS-1$
      println("" + e); //$NON-NLS-1$
    } catch (IOException e) {
      println("" + e); //$NON-NLS-1$
    }
  }

  /**
   * prime配列の内容確定を行うメソッド
   * 
   * @param m_writer PrintWriter型
   */
  public static void writePrime(PrintWriter m_writer) {
    boolean[] prime = new boolean[MAX_PRIME];
    for (int n = 0; n < MAX_PRIME; n++) {
      prime[n] = true;
    }
    prime[0] = false;
    prime[1] = false;
    for (int n = 0; n < MAX_PRIME; n++) {
      if (prime[n]) {
        m_writer.println(n);
        for (int i = 2; i * n < MAX_PRIME; i++) {
          prime[i * n] = false;
        }
      }
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
