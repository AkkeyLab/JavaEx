package lesson.chap09;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class Rectangle {

  // フィールド
  int width;
  int height;

  /**
   * コンストラクタ 新しく生成された<code>Rectangle</code>オブジェクトを初期化します。
   * 
   * @param width 横
   * @param height 縦
   */
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return Messages.getString("Rectangle.0") + this.width + Messages.getString("Rectangle.1") + this.height + Messages.getString("Rectangle.2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
  }
}
