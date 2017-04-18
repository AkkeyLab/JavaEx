package lesson.chap09;

public class Student {
	String name;
	int[] score;

	// コンストラクタ
	public Student(String name, int x, int y, int z) {
		this.score = new int[3];
		this.name = name;
		this.score[0] = x;
		this.score[1] = y;
		this.score[2] = z;
	}

	@Override
	// 名前とスコアをフォーマットして文字列を生成
	public String toString() {
		String s = "[" + name;
		for (int i = 0; i < score.length; i++) {
			s += "," + score[i];
		}
		s += "]";
		return s;
	}

	// 合計点を求める
	public int total() {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}
}
