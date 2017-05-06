package lesson.chap10;

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
    Data base = new Data();
    Data.setData(base, 5, 4, 3);
    println(Messages.getString("ALesson.0") + base.x); //$NON-NLS-1$

    Data user = new Data();
    Data.setData(user, 1, 2, 3);
    println(Messages.getString("ALesson.1") + user.x); //$NON-NLS-1$

    Data.setData(base, 8, 7, 6);
    println(Messages.getString("ALesson.2") + base.x); //$NON-NLS-1$
    println(Messages.getString("ALesson.3") + user.x); //$NON-NLS-1$

    /* 実行結果
       base : 5
       user : 1
       base : 8
       user : 1
       
       途中でbaseを再度データセットしているため、baseのみ更新されていることがわかる
       ここでは数値を保管する変数がstaticではないので、共有されることはない
       つまり、thisで表現できなくなった場合の対処方法というだけである
     */
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
