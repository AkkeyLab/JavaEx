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

public class ELesson {
	public static void main(String[] args) {
		CocoaString object = name();
		println(object.name);
		println(object.emoji);

		object.name = "ここあ";
		println(object.name);
		println(object.emoji);
	}

	public static CocoaString name() {
		// オブジェクト生成
		CocoaString cocoa = new CocoaString();
		cocoa.name = "ココア";
		cocoa.emoji = "(`0言0́*)<ヴェアアアアアアアア";

		return cocoa;
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
