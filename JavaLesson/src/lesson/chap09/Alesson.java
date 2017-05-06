package lesson.chap09;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class Alesson {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    // Studentオブジェクトを配列に格納
    // Studentオブジェクト生成には初期値が必要（なように設計した）
    Student[] data = {new Student(Messages.getString("Alesson.0"), 65, 90, 100), new Student(Messages.getString("Alesson.1"), 82, 73, 64), //$NON-NLS-1$ //$NON-NLS-2$
        new Student(Messages.getString("Alesson.2"), 74, 31, 42), new Student(Messages.getString("Alesson.3"), 100, 95, 99),}; //$NON-NLS-1$ //$NON-NLS-2$
    // toStringをカスタマイズしているので、文字列表示を行おうとするとtoStringの処理が行われる
    // Studentクラスに含まれるメソッドも実行可能
    for (int i = 0; i < data.length; i++) {
      println("" + data[i] + Messages.getString("Alesson.5") + data[i].total()); //$NON-NLS-1$ //$NON-NLS-2$
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
