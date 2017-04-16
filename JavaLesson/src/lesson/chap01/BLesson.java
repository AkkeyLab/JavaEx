package lesson.chap01;

public class BLesson {
	public static void main(String[] args) {
		product();
	}
	
	// 0x0から10x10までを計算して出力するメソッド
	public static void product() {
		// Swiftであるとこのフォーマットでfor文を書くことができなくなった
		for(int i = 0; i <= 10; i++) {
			println("" + i + "x" + i + "=" + (i * i));
		}
	}
	
	// C言語風にフォーマット指定で記述
	// Swiftでもこのようなフォーマット方法が使用できる。
	public static void product_c() {
		for (int i = 0; i <= 10; i++) {
			// クラス名で区別してるんだ
			System.out.printf("%d × %d = %d%n", i, i, i * i);
		}
	}
	
	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
