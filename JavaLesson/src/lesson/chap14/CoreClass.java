package lesson.chap14;

class CoreClass {
	public static CoreClass last = null;
	public String name;

	// コンストラクタ
	public CoreClass(String name) {
		println("<< CoreClass name const >>");
		// インスタンスごとに管理される値
		this.name = name;
		// このクラスを利用したときのnameが随時更新される
		last = this;

		System.out.println(this + "が生まれました");
	}

	@Override
	public String toString() {
		return "[" + name + "]";
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
