package lesson.chap10;

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
    Rectangle a, b, c, d, e;
    a = new Rectangle(0, 0, 20, 10);
    b = new Rectangle(5, 5, 20, 10);
    c = new Rectangle(20, 10, 20, 10);
    d = new Rectangle(-10, -20, 100, 200);
    e = new Rectangle(21, 11, 20, 10);
    println(Messages.getString("BLesson.0") + a); //$NON-NLS-1$
    println(Messages.getString("BLesson.1") + b); //$NON-NLS-1$
    println(Messages.getString("BLesson.2") + c); //$NON-NLS-1$
    println(Messages.getString("BLesson.3") + d); //$NON-NLS-1$
    println(Messages.getString("BLesson.4") + e); //$NON-NLS-1$
    println(Messages.getString("BLesson.5") + a.intersect(a)); //$NON-NLS-1$
    println(Messages.getString("BLesson.6") + a.intersect(b)); //$NON-NLS-1$
    println(Messages.getString("BLesson.7") + a.intersect(c)); //$NON-NLS-1$
    println(Messages.getString("BLesson.8") + a.intersect(d)); //$NON-NLS-1$
    println(Messages.getString("BLesson.9") + a.intersect(e)); //$NON-NLS-1$
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
