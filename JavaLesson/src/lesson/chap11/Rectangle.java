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
    return Messages.getString("Rectangle.0") + this.width + Messages.getString("Rectangle.1") + this.height + Messages.getString("Rectangle.2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}
}
