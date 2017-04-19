package lesson.chap14;

class CoreClass {
	public static CoreClass last = null;
	public String name;

	public CoreClass(String name) {
		this.name = name;
		last = this;
		// 生まれたときにメッセージを表示する
		System.out.println(this + "が生まれました");
	}

	@Override
	public String toString() {
		return "[" + name + "]";
	}
}
