package lesson.chap07;

public class ALesson {
	public static void main(String[] args) {
		for (int n = -8; n <= 8; n++) {
			printGraph(n * n);
		}
	}

	public static void printGraph(int x) {
		for (int i = 0; i < x; i++) {
			print("*");
		}
		println("");
	}

	public static void print(String s) {
		System.out.print(s);
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
