package lesson.chap07;

/*
 * ----- name func -----
 * AKIO
 * ITAYA
 * ---------------------
 * AKIO
 * ITAYA
 * 
 * 別のメソッドで宣言した配列と、それを戻り値として得た配列が同様であることが確認できる
 * まだまだわからないことが多い
 * 
 */

public class BLesson {
	public static void main(String[] args) {
		String[] names = name();
		outString(names);
	}
	
	public static void outString(String[] s) {
		for(int i = 0; i < s.length; i++) {
			println(s[i]);
		}
	}
	
	public static String[] name() {
		// 配列生成と同時に初期値を設定しておく
		String[] names = { "AKIO", "ITAYA"};
		
		println("----- name func -----");
		outString(names);
		println("---------------------");
		return names;
	}
	
	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}