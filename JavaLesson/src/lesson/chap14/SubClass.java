package lesson.chap14;

// CoreClassを継承している
class SubClass extends CoreClass {
	public CoreClass friend;

	public SubClass(String name) {
		// 継承元と同じ動作をさせる
		super(name);
		println("<< SubClass name const >>");
	}

	// 追加された新しいメソッド
	// 友達の指定が可能になっている
	public SubClass(String name, CoreClass friend) {
		// 友達データの管理以外は継承元と同じ
		super(name);
		this.friend = friend;
		println("<< SubClass name and friend const >>");
	}

	// 友達データの表示に対応
	@Override
	public String toString() {
		return "[" + name + ", " + friend + "]";
	}
}
