package lesson.chap12;

public class BLesson {
	public static void main(String[] args) {
		try {
			// 以下の各メソッドでthrowsを使っているので、ここに例外が来る
			method1(0);
			method2(0);
			method3(0);
		} catch (Exception e) {
			println("Exception : " + e);
			// スタックトレースの出力
			e.printStackTrace();
		}
	}

	// throwsで呼び出し元に例外を投げる
	static void method1(int x) throws Exception {
		if (x > 0) {
			// 手動で例外を生成して投げる
			throw new Exception();
		}
	}

	static void method2(int x) throws Exception {
		if (x == 0) {
			throw new Exception();
		}
	}

	static void method3(int x) throws Exception {
		if (x > 0) {
			throw new Exception();
		}
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
