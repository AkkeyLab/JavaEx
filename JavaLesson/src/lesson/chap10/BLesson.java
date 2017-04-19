package lesson.chap10;

public class BLesson {
	public static void main(String[] args) {
		Rectangle a, b, c, d, e;
		a = new Rectangle(0, 0, 20, 10);
		b = new Rectangle(5, 5, 20, 10);
		c = new Rectangle(20, 10, 20, 10);
		d = new Rectangle(-10, -20, 100, 200);
		e = new Rectangle(21, 11, 20, 10);
		println("a = " + a);
		println("b = " + b);
		println("c = " + c);
		println("d = " + d);
		println("e = " + e);
		println("a と a の重なり = " + a.intersect(a));
		println("a と b の重なり = " + a.intersect(b));
		println("a と c の重なり = " + a.intersect(c));
		println("a と d の重なり = " + a.intersect(d));
		println("a と e の重なり = " + a.intersect(e));
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
