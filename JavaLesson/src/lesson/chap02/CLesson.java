package lesson.chap02;

public class CLesson {
	public static void main(String[] args) {
		// 基本的に制度が高い数値に合わせて結果が出力される
		println("光が1日に進む距離は" + (300000L * 60 * 60 * 24) + "kmです");
	}
	
	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
