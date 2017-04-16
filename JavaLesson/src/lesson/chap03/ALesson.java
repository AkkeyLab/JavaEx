package lesson.chap03;

import java.io.*;

public class ALesson {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		println("現在時刻24時間法で時間のみ入力してください");
		try {
			// tryが必要なのはこの2つ
			String inputString = reader.readLine();
			int n = Integer.parseInt(inputString);

			println(greeting(n));
		} catch(IOException e) {
            println("" + e);
        } catch(NumberFormatException e) {
            println("数字の形式が正しくありません");
        }
	}

	public static String greeting(int n) {
		if (0 <= n && n <= 11) {
            return "おはようございます";
        } else if (n == 12) {
            return "お昼です";
        } else if (13 <= n && n <= 18) {
            return "こんにちは";
        } else if (19 <= n && n <= 23) {
            return "こんばんは";
        } else {
            return "時刻の範囲を越えています";
        }
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
