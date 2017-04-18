package lesson.chap09;

public class Alesson {
	public static void main(String[] args) {
		// Studentオブジェクトを配列に格納
		// Studentオブジェクト生成には初期値が必要（なように設計した）
		Student[] data = { new Student("結城浩", 65, 90, 100), new Student("阿部和馬", 82, 73, 64),
				new Student("伊藤光一", 74, 31, 42), new Student("佐藤太郎", 100, 95, 99), };
		// toStringをカスタマイズしているので、文字列表示を行おうとするとtoStringの処理が行われる
		// Studentクラスに含まれるメソッドも実行可能
		for (int i = 0; i < data.length; i++) {
			println("" + data[i] + "\t-> " + data[i].total());
		}
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
