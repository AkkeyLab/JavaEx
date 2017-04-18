package lesson.chap09;

public class Rectangle {
	// フィールド
	int width;
	int height;

	// コンストラクタ
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// オーバーライド
	@Override
	public String toString() {
		return "[ " + width + ", " + height + " ]";
	}
}
