package lesson.chap14;

class SubClass extends CoreClass {
	public CoreClass friend;

	public SubClass(String name) {
		super(name);
	}

	public SubClass(String name, CoreClass friend) {
		super(name);
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "[" + name + ", " + friend + "]";
	}
}
