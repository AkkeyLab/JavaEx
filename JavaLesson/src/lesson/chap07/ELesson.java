package lesson.chap07;

/*
 * ココア
 * (`0言0́*)<ヴェアアアアアアアア
 * ここあ
 * (`0言0́*)<ヴェアアアアアアアア
 * 
 * 同様のオブジェクトを使用すれば変更なども反映される
 * 
 */

class CocoaString {

  // コンストラクタが無いなんて…
  // 良い子は真似しないように
  String name;
  String emoji;
}





/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class ELesson {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    CocoaString object = name();
    println(object.name);
    println(object.emoji);

    object.name = Messages.getString("ELesson.0"); //$NON-NLS-1$
    println(object.name);
    println(object.emoji);
  }

  /**
   * CocoaString型で文字列内容を出力するメソッド
   * 
   * @return CocoaString型
   */
  public static CocoaString name() {
    // オブジェクト生成
    CocoaString cocoa = new CocoaString();
    cocoa.name = Messages.getString("ELesson.1"); //$NON-NLS-1$
    cocoa.emoji = Messages.getString("ELesson.2"); //$NON-NLS-1$

    return cocoa;
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
