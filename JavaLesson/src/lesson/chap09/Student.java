package lesson.chap09;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class Student {

  String name;
  int[] score;

  /**
   * コンストラクタ 新しく生成された<code>Student</code>オブジェクトを初期化します。
   * 
   * @param name 名前
   * @param x 数値
   * @param y 数値
   * @param z 数値
   */
  public Student(String name, int x, int y, int z) {
    this.score = new int[3];
    this.name = name;
    this.score[0] = x;
    this.score[1] = y;
    this.score[2] = z;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  // 名前とスコアをフォーマットして文字列を生成
  public String toString() {
    String s = Messages.getString("Student.0") + this.name; //$NON-NLS-1$
    for (int i = 0; i < this.score.length; i++) {
      s += Messages.getString("Student.1") + this.score[i]; //$NON-NLS-1$
    }
    s += Messages.getString("Student.2"); //$NON-NLS-1$
    return s;
  }

  /**
   * 合計点を求めるメソッド
   * 
   * @return 数値
   */
  public int total() {
    int sum = 0;
    for (int i = 0; i < this.score.length; i++) {
      sum += this.score[i];
    }
    return sum;
  }
}
