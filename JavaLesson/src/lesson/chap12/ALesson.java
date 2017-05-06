package lesson.chap12;

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
    int[] myarray = new int[3];
    // 確保していないアドレスへのアクセスを試みる
    // もちろんエラーが返ってくる
    myAssign(myarray, 100, 0);
    println(Messages.getString("ALesson.0")); //$NON-NLS-1$
  }

  static void myAssign(int[] arr, int index, int value) {
    println(Messages.getString("ALesson.1")); //$NON-NLS-1$
    try {
      println(Messages.getString("ALesson.2")); //$NON-NLS-1$
      arr[index] = value;
      println(Messages.getString("ALesson.3")); //$NON-NLS-1$
    } catch (ArrayIndexOutOfBoundsException e) {
      println(Messages.getString("ALesson.4")); //$NON-NLS-1$
      println(Messages.getString("ALesson.5") + e); //$NON-NLS-1$
    }
    println(Messages.getString("ALesson.6")); //$NON-NLS-1$
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
