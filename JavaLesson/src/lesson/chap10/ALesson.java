package lesson.chap10;

public class ALesson {
	public static void main(String[] args) {
		Data base = new Data();
		base.setData(base, 5, 4, 3);
		println("base : " + base.x);
		
		Data user = new Data();
		user.setData(user, 1, 2, 3);
		println("user : " + user.x);
		
		user.setData(base, 8, 7, 6);
		println("base : " + base.x);
		println("user : " + user.x);
		
		/* 実行結果
		   base : 5
		   user : 1
		   base : 8
		   user : 1
		   
		   途中でbaseを再度データセットしているため、baseのみ更新されていることがわかる
		   ここでは数値を保管する変数がstaticではないので、共有されることはない
		   つまり、thisで表現できなくなった場合の対処方法というだけである
		 */
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
