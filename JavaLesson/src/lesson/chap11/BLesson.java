package lesson.chap11;

class BLesson {

  Rectangle r;
  int x;
  int y;

  BLesson() {
    this.r = new Rectangle();
    setLocation(0, 0);
  }

  BLesson(int x, int y) {
    this.r = new Rectangle();
    setLocation(x, y);
  }

  BLesson(int x, int y, int width, int height) {
    this.r = new Rectangle(width, height);
    setLocation(x, y);
  }

  void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return Messages.getString("BLesson.0") + this.x + Messages.getString("BLesson.1") + this.y + Messages.getString("BLesson.2") + this.r + Messages.getString("BLesson.3"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
  }

  public static void main(String[] args) {
    BLesson a = new BLesson();
    BLesson b = new BLesson(12, 34);
    BLesson c = new BLesson(31, 41, 59, 26);
    BLesson d = new BLesson(100, 200, 3, 4);
    d.setLocation(1, 2);
    println(Messages.getString("BLesson.4") + a); //$NON-NLS-1$
    println(Messages.getString("BLesson.5") + b); //$NON-NLS-1$
    println(Messages.getString("BLesson.6") + c); //$NON-NLS-1$
    println(Messages.getString("BLesson.7") + d); //$NON-NLS-1$
  }

  // 文字出力が簡単にできるメソッド
  public static void println(String s) {
    System.out.println(s);
  }
}
