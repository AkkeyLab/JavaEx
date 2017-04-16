package lesson.chap01;

public class CLesson {
	public static void main(String[] args) {
		println("" + trapezoid(2, 3, 4));
	}
	
	public static int trapezoid(int a, int b, int h) {
		// 台形の面積は、上底と下底の和に高さをかけた値を2で割ることで求められる
		// まぁ、長方形にして考えてるだけなんだけどね
		return (a + b) * h / 2;
	}
	
	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
