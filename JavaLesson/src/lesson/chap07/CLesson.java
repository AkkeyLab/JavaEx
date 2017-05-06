package lesson.chap07;

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
    String[] names = name();
    outString(names);
  }

  /**
   * 配列内の文字を出力するメソッド
   * 
   * @param s 文字列配列
   */
  public static void outString(String[] s) {
    for (int i = 0; i < s.length; i++) {
      println(s[i]);
    }
  }

  /**
   * 文字列配列を生成するメソッド
   * 
   * @return 文字列配列
   */
  public static String[] name() {
    // 空の配列を生成した後に、それぞれに値を格納する
    // アドレス確保のためにnewをお忘れなく！

    // 当然だが、宣言と代入を別に行うか同時に行うかで挙動に変化はない
    String[] names = new String[2];
    names[0] = Messages.getString("CLesson.0"); //$NON-NLS-1$
    names[1] = Messages.getString("CLesson.1"); //$NON-NLS-1$

    println(Messages.getString("CLesson.2")); //$NON-NLS-1$
    outString(names);
    println(Messages.getString("CLesson.3")); //$NON-NLS-1$
    return names;
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
