package lesson.chap07;

/*
 * ----- name func -----
 * AKIO
 * ITAYA
 * ---------------------
 * AKIO
 * ITAYA
 * 
 * 別のメソッドから配列の中身を変更できていることが確認できる
 * つまり、引数に渡されたものは値の複製ではなく、格納場所のアドレスであるとわかる
 * 
 */

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
    String[] names = new String[2];
    name(names);
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
   * 文字列を出力するメソッド
   * 
   * @param names 文字列配列
   */
  public static void name(String[] names) {
    // 引数からの配列に値を格納する
    // この方法だと引数に渡される配列の大きさが確定されないため、非常に危険である
    names[0] = Messages.getString("DLesson.0"); //$NON-NLS-1$
    names[1] = Messages.getString("DLesson.1"); //$NON-NLS-1$

    println(Messages.getString("DLesson.2")); //$NON-NLS-1$
    outString(names);
    println(Messages.getString("DLesson.3")); //$NON-NLS-1$
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
