package lesson.chap14;

class CoreClass {

  public static CoreClass last = null;
  public String name;

  // コンストラクタ
  public CoreClass(String name) {
    println(Messages.getString("CoreClass.0")); //$NON-NLS-1$
    // インスタンスごとに管理される値
    this.name = name;
    // このクラスを利用したときのnameが随時更新される
    last = this;

    System.out.println(this + Messages.getString("CoreClass.1")); //$NON-NLS-1$
  }

  @Override
  public String toString() {
    return Messages.getString("CoreClass.2") + this.name + Messages.getString("CoreClass.3"); //$NON-NLS-1$ //$NON-NLS-2$
  }

  // 文字出力が簡単にできるメソッド
  public static void println(String s) {
    System.out.println(s);
  }
}
