package lesson.chap17;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class ALesson {

  private static final int INITIAL_CAPACITY = 4;
  private String[] ar;
  private int sz;

  /**
   * 新しく生成された<code>ALesson</code>オブジェクトを初期化します。
   */
  public ALesson() {
    this.ar = new String[INITIAL_CAPACITY];
    this.sz = 0;
  }

  /**
   * 追加メソッド
   * 
   * @param s 文字列
   */
  public void add(String s) {
    if (this.ar.length == this.sz) {
      String[] newAr = new String[this.ar.length * 2];
      System.arraycopy(this.ar, 0, newAr, 0, this.ar.length);
      this.ar = newAr;
    }
    this.ar[this.sz] = s;
    this.sz++;
  }

  /**
   * 取得メソッド
   * 
   * @param n 値
   * @return 文字列
   */
  public String get(int n) {
    if (0 <= n && n < this.sz) {
      return this.ar[n];
    }
    throw new IndexOutOfBoundsException();
  }

  /**
   * サイズ取得メソッド
   * 
   * @return 数値
   */
  public int size() {
    return this.sz;
  }
}
