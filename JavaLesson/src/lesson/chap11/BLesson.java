package lesson.chap11;

class BLesson {
	Rectangle r;
	int x;
	int y;

	BLesson() {
		r = new Rectangle();
		setLocation(0, 0);
	}

	BLesson(int x, int y) {
		r = new Rectangle();
		setLocation(x, y);
	}

	BLesson(int x, int y, int width, int height) {
		r = new Rectangle(width, height);
		setLocation(x, y);
	}

	void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[ (" + x + ", " + y + ") " + r + "]";
	}

	public static void main(String[] args) {
		BLesson a = new BLesson();
		BLesson b = new BLesson(12, 34);
		BLesson c = new BLesson(31, 41, 59, 26);
		BLesson d = new BLesson(100, 200, 3, 4);
		d.setLocation(1, 2);
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
