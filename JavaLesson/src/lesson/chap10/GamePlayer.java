package lesson.chap10;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class GamePlayer {

  /** */
  public String playername;
  // このように、staticで宣言した場合、新しくオブジェクト（インスタンス）を作成しても、すべてのオブジェクトで値が共有される
  /** */
  public static String commonName;

  /**
   * 新しく生成された<code>GamePlayer</code>オブジェクトを初期化します。
   * 
   * @param name 名前
   * @param common 共通名称
   */
  public GamePlayer(String name, String common) {
    this.playername = name;
    commonName = common;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return Messages.getString("GamePlayer.0") + this.playername + Messages.getString("GamePlayer.1") + commonName + Messages.getString("GamePlayer.2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
  }
}
