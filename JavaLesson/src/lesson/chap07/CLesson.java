package lesson.chap07;

public class CLesson {
	public static void main(String[] args) {
		String[] names = name();
		outString(names);
	}

	public static void outString(String[] s) {
		for (int i = 0; i < s.length; i++) {
			println(s[i]);
		}
	}

	public static String[] name() {
		// 空の配列を生成した後に、それぞれに値を格納する
		// アドレス確保のためにnewをお忘れなく！

		// 当然だが、宣言と代入を別に行うか同時に行うかで挙動に変化はない
		String[] names = new String[2];
		names[0] = "AKIO";
		names[1] = "ITAYA";

		println("----- name func -----");
		outString(names);
		println("---------------------");
		return names;
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
