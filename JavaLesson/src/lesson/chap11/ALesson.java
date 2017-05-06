package lesson.chap11;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class ALesson extends Rectangle {

  int x;
  int y;

  ALesson() {
    setLocation(0, 0);
  }

  ALesson(int x, int y) {
    setLocation(x, y);
  }

  ALesson(int x, int y, int width, int height) {
    super(width, height);
    setLocation(x, y);
  }

  void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return Messages.getString("ALesson.0") + this.x + Messages.getString("ALesson.1") + this.y + Messages.getString("ALesson.2") + super.toString() + Messages.getString("ALesson.3"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
  }

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    ALesson a = new ALesson();
    ALesson b = new ALesson(12, 34);
    ALesson c = new ALesson(31, 41, 59, 26);
    ALesson d = new ALesson(1, 2, 100, 200);
    d.setLocation(3, 4);
    println(Messages.getString("ALesson.4") + a); //$NON-NLS-1$
    println(Messages.getString("ALesson.5") + b); //$NON-NLS-1$
    println(Messages.getString("ALesson.6") + c); //$NON-NLS-1$
    println(Messages.getString("ALesson.7") + d); //$NON-NLS-1$
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
