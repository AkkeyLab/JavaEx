package lesson.chap07;

/*
 * ----- name func -----
 * AKIO
 * ITAYA
 * ---------------------
 * AKIO
 * ITAYA
 * 
 * 別のメソッドで宣言した配列と、それを戻り値として得た配列が同様であることが確認できる
 * まだまだわからないことが多い
 * 
 */

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class BLesson {

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
    // 配列生成と同時に初期値を設定しておく
    String[] names = {Messages.getString("BLesson.0"), Messages.getString("BLesson.1")}; //$NON-NLS-1$ //$NON-NLS-2$

    println(Messages.getString("BLesson.2")); //$NON-NLS-1$
    outString(names);
    println(Messages.getString("BLesson.3")); //$NON-NLS-1$
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