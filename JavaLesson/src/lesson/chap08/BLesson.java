package lesson.chap08;

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
    String[] message = {Messages.getString("BLesson.0"), Messages.getString("BLesson.1"), Messages.getString("BLesson.2")}; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    println(Messages.getString("BLesson.3")); //$NON-NLS-1$
    for (int i = 0; i < args.length; i++) {
      // C言語などでは実行ファイルの指定も取得できていたが、ここでは実行ファイル名以降がコマンドとして取得できることがわかる
      println(args[i]);
    }
    println(Messages.getString("BLesson.4")); //$NON-NLS-1$

    if (args.length != 1) {
      println(Messages.getString("BLesson.5")); //$NON-NLS-1$
      // Systemにはexitが用意されており、終了方法を指定してプログラムの実行を終了する
      // 0以外は異常終了を意味する
      // https://ja.wikipedia.org/wiki/終了ステータス
      System.exit(0);
    }
    // ここ、数字以外が渡された時も考えたほうが良い（エラー分的にも）
    int num = Integer.parseInt(args[0]);
    if (0 <= num && num < message.length) {
      println(message[num]);
    } else {
      println(Messages.getString("BLesson.6") + (message.length - 1) + Messages.getString("BLesson.7")); //$NON-NLS-1$ //$NON-NLS-2$
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
