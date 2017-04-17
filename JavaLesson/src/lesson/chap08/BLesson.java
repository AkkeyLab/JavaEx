package lesson.chap08;

public class BLesson {
	public static void main(String[] args) {
		String[] message = { "おはよう！", "こんにちは！", "こんばんは！" };

		println("----- input command -----");
		for (int i = 0; i < args.length; i++) {
			// C言語などでは実行ファイルの指定も取得できていたが、ここでは実行ファイル名以降がコマンドとして取得できることがわかる
			println(args[i]);
		}
		println("-------------------------");

		if (args.length != 1) {
			println("実行時に整数を引数に指定してください");
			// Systemにはexitが用意されており、終了方法を指定してプログラムの実行を終了する
			// 0以外は異常終了を意味する
			// https://ja.wikipedia.org/wiki/終了ステータス
			System.exit(0);
		}
		// ここ、数字以外が渡された時も考えたほうが良い（エラー分的にも）
		int num = Integer.parseInt(args[0]);
		if (0 <= num && num < message.length) {
			println(message[num]);
		} else {
			println("番号は0〜" + (message.length - 1) + "の範囲で指定してください");
		}
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
