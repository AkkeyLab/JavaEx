package lesson.chap04;

import java.io.*;


/**
 * @author akkey
 * @version $Revision$, May 6, 2017
 */
public class ALesson {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    outQuestion();
    try {
      String inputString = reader.readLine();
      int n = Integer.parseInt(inputString);
      outAns(n);

    } catch (IOException e) {
      println("" + e); //$NON-NLS-1$
    } catch (NumberFormatException e) {
      println(Messages.getString("ALesson.1")); //$NON-NLS-1$
      println("" + e); //$NON-NLS-1$
    }
  }

  /**
   * 質問文の出力を行うメソッド
   */
  public static void outQuestion() {
    String[] qStrings = {Messages.getString("ALesson.2"), Messages.getString("ALesson.3"), Messages.getString("ALesson.4"), Messages.getString("ALesson.5"), Messages.getString("ALesson.6"), //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$//$NON-NLS-4$//$NON-NLS-5$
        Messages.getString("ALesson.7")}; //$NON-NLS-1$

    for (int i = 0; i < qStrings.length; i++) {
      println(qStrings[i]);
    }
  }

  /**
   * 選択数値に応じた返答を文字列で出力するメソッド
   * 
   * @param n 返答数値
   */
  public static void outAns(int n) {
    // C言語と同じと考えておけば問題ない
    // Swiftでは貫通しない

    // あまり使わないとは思うが、比較に文字も最新Javaでは使用できる
    switch (n) {
      case 1:
        System.out.println(Messages.getString("ALesson.8")); //$NON-NLS-1$
        break;
      case 2:
        System.out.println(Messages.getString("ALesson.9")); //$NON-NLS-1$
        break;
      case 3:
        System.out.println(Messages.getString("ALesson.10")); //$NON-NLS-1$
        break;
      default:
        System.out.println(Messages.getString("ALesson.11")); //$NON-NLS-1$
        break;
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
