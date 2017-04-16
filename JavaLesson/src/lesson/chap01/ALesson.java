package lesson.chap01;

public class ALesson {
	public static void main(String[] args) {
		// 整数直後に「L」を付けることでlong intとして扱うことができる
		// Swiftならasで型を指定してあげればいいと思う
		println("" + (100000L * 100000L));
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
