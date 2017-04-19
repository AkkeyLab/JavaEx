package lesson.chap12;

public class DLesson {
	public static void main(String[] args) {
		try {
			method1(0);
		} catch (Exception e) {
			println("method1:Exception:" + e);
		}
		try {
			method2(0);
		} catch (Exception e) {
			println("method2:Exception:" + e);
		}
		try {
			method3(0);
		} catch (Exception e) {
			println("method3:Exception:" + e);
		}
	}

	static void method1(int x) throws Exception {
		if (x > 0) {
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
