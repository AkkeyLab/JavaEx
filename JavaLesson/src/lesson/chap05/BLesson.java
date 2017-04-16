package lesson.chap05;

public class BLesson {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				print(i + "*" + j + "=" + (i * j) + ", ");
			}
			println("");
		}
	}

	// フォーマット指定による実装
	public static void kuku() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				// 「d」で10進数
				// 「-」で左詰め
				// 「4」で最低でも4桁準備
				// http://www.ne.jp/asahi/hishidama/home/tech/java/formatter.html

				// 名前と挙動はC言語似
				System.out.printf("%d*%d=%-4d", i, j, i * j);
			}
			println("");
		}
	}

	// 改行なし
	public static void print(String s) {
		System.out.print(s);
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
