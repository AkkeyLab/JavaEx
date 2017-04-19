package lesson.chap09;

public class BLesson {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10, 20);

		println("" + rec);
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
