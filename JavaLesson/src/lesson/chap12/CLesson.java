package lesson.chap12;

public class CLesson {
	public static void main(String[] args) {
		println("" + factorial(10));
	}

	public static int factorial(int n) {
		if (n <= 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
