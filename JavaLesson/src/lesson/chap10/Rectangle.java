package lesson.chap10;

class Rectangle {
	final int INITIAL_WIDTH = 10;
	final int INITIAL_HEIGHT = 20;
	int width;
	int height;
	int x;
	int y;

	Rectangle() {
		width = INITIAL_WIDTH;
		height = INITIAL_HEIGHT;
		x = 0;
		y = 0;
	}

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.x = 0;
		this.y = 0;
	}

	Rectangle(int x, int y, int width, int height) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}

	void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "[" + x + ", " + y + ", " + width + ", " + height + "]";
	}

	Rectangle intersect(Rectangle r) {
		int sx = Math.max(this.x, r.x);
		int sy = Math.max(this.y, r.y);
		int ex = Math.min(this.x + this.width, r.x + r.width);
		int ey = Math.min(this.y + this.height, r.y + r.height);
		int newwidth = ex - sx;
		int newheight = ey - sy;
		if (newwidth > 0 && newheight > 0) {
			return new Rectangle(sx, sy, newwidth, newheight);
		} else {
			return null;
		}
	}
}
