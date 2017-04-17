package lesson.chap08;

public class ALesson {
	public static void main(String[] args) {
		double[] data = { 3.1, 4.1, 5.9, 2.6, 5.3, 9.7 };
		double sum = 0.0;

		// データ型 変数名: コレクション

		// Swiftでは以下のように書く。ほぼ同じ。
		// for d in data {
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
