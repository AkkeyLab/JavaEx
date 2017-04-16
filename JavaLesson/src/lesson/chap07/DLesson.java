package lesson.chap07;

/*
 * ----- name func -----
 * AKIO
 * ITAYA
 * ---------------------
 * AKIO
 * ITAYA
 * 
 * 別のメソッドから配列の中身を変更できていることが確認できる
 * つまり、引数に渡されたものは値の複製ではなく、格納場所のアドレスであるとわかる
 * 
 */

public class DLesson {
	public static void main(String[] args) {
		String[] names = new String[2];
		name(names);
		outString(names);
	}

	public static void outString(String[] s) {
		for (int i = 0; i < s.length; i++) {
			println(s[i]);
		}
	}

	// この方法は危険！
	public static void name(String[] names) {
		// 引数からの配列に値を格納する
		// この方法だと引数に渡される配列の大きさが確定されないため、非常に危険である
		names[0] = "AKIO";
		names[1] = "ITAYA";

		println("----- name func -----");
		outString(names);
		println("---------------------");
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
