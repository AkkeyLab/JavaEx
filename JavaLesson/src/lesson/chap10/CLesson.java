package lesson.chap10;

/*
 * 実行結果 [player:Mad Hatter] [common:Itaya] [player:March Hare]
 * [common:Itaya] [player:Alice] [common:Itaya]
 * 
 * インスタンスが異なるにも関わらず、staticで宣言していた変数の値が共有されているのがわかる
 */

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
    GamePlayer[] player = new GamePlayer[3];
    player[0] = new GamePlayer(Messages.getString("CLesson.0"), Messages.getString("CLesson.1")); //$NON-NLS-1$ //$NON-NLS-2$
    player[1] = new GamePlayer(Messages.getString("CLesson.2"), Messages.getString("CLesson.3")); //$NON-NLS-1$ //$NON-NLS-2$
    player[2] = new GamePlayer(Messages.getString("CLesson.4"), Messages.getString("CLesson.5")); //$NON-NLS-1$ //$NON-NLS-2$
    for (int i = 0; i < player.length; i++) {
      println("" + player[i]); //$NON-NLS-1$
    }
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
