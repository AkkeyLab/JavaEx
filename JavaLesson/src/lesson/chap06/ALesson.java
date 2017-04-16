package lesson.chap06;

import java.io.*;

public class ALesson {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String inputString;
			// 未入力になるまで繰り返す
			while ((inputString = reader.readLine()) != null) {
				// endsWithでは文字列の終わりが引数と等しいかを判定する
				// ちなみに、文字列のはじめに関してはstartsWithを使用して判定する
				if (inputString.endsWith("{") || inputString.endsWith("}")) {
					println(inputString);
				}
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
