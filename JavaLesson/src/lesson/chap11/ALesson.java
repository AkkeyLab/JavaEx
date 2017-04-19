package lesson.chap11;

public class ALesson extends Rectangle {
	int x;
	int y;

	ALesson() {
		setLocation(0, 0);
	}

	ALesson(int x, int y) {
		setLocation(x, y);
	}

	ALesson(int x, int y, int width, int height) {
		super(width, height);
		setLocation(x, y);
	}

	void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[ (" + x + ", " + y + ") " + super.toString() + "]";
	}

	public static void main(String[] args) {
		ALesson a = new ALesson();
		ALesson b = new ALesson(12, 34);
		ALesson c = new ALesson(31, 41, 59, 26);
		ALesson d = new ALesson(1, 2, 100, 200);
		d.setLocation(3, 4);
		println("a = " + a);
		println("b = " + b);
		println("c = " + c);
		println("d = " + d);
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
