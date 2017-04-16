package lesson.chap02;

import java.io.*;

public class BLesson {
	public static void main(String[] args) {
		// 文字入力支援
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			println("好きな文字列を入力してみてください");
			String inputString = reader.readLine();

			// .lengthで文字列の長さを取得することができる
			for (int i = 0; i < inputString.length(); i++) {
				// charAtに何番目の文字を取得したいかを指定して、文字を取得s
				char c = inputString.charAt(i);
				// int型にキャストしてあげることで文字コードを取得することが可能
				// C言語みたい
				println("'" + c + "' の文字コードは " + (int) c + "です");
			}
		} catch (IOException e) {
			println("" + e);
		}
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
