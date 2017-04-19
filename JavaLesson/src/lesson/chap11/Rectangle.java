package lesson.chap11;

class Rectangle {
	int width;
	int height;

	Rectangle() {
		setSize(0, 0);
	}

	Rectangle(int width, int height) {
		setSize(width, height);
	}

	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "[" + width + ", " + height + "]";
	}
}
