package lesson.chap08;

public class ALesson {
	public static void main(String[] args) {
		double[] data = { 3.1, 4.1, 5.9, 2.6, 5.3, 9.7 };
		double sum = 0.0;
		for (double d : data) {
			sum += d;
		}
		println("sum = " + sum);
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
