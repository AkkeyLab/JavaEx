package lesson.chap15;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class OneBank {

  // 預金残高
  private static int value = 0;

  /**
   * 預け入れ・引き出しを行うメソッド
   * 
   * @param money 金額
   */
  public static synchronized void addMoney(int money) {
    // 現在残高を保存
    int currentValue = value;
    // 状況を表示
    System.out.println(Thread.currentThread() + Messages.getString("OneBank.0")); //$NON-NLS-1$
    // 現在残高を変更
    value += money;
    // 矛盾がないかどうかチェック
    if (currentValue + money != value) {
      System.out.println(Thread.currentThread() + Messages.getString("OneBank.1")); //$NON-NLS-1$
      System.exit(-1);
    }
    // 状況を表示
    System.out.println(Thread.currentThread() + Messages.getString("OneBank.2")); //$NON-NLS-1$
  }
}
