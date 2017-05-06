package lesson.chap14;

// CoreClassを継承している
class SubClass extends CoreClass {
	public CoreClass friend;

	public SubClass(String name) {
		// 継承元と同じ動作をさせる
		super(name);
		println(Messages.getString("SubClass.0")); //$NON-NLS-1$
	}

	// 追加された新しいメソッド
	// 友達の指定が可能になっている
	public SubClass(String name, CoreClass friend) {
		// 友達データの管理以外は継承元と同じ
		super(name);
		this.friend = friend;
		println(Messages.getString("SubClass.1")); //$NON-NLS-1$
	}

	// 友達データの表示に対応
	@Override
	public String toString() {
    return Messages.getString("SubClass.2") + this.name + Messages.getString("SubClass.3") + this.friend + Messages.getString("SubClass.4"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}
}
