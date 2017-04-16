package lesson.chap02;

import java.io.*;

public class ALesson {
	public static void main(String[] args) {
		println("このプログラムは2人の年齢から平均年齢を算出します");
		outOld();
	}
	
	public static void outOld() {
		// java.io系を一式importしておきましょう
		// 文字入力を支援
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 繰り返しで初期化されてほしくない値を格納お
		// 配列を超先取りで使ってみた
		String[] name = new String[2];
		int age = 0;
		
		// できるだけ冗長なコードはなくしていきましょう
		// 2人の入力方法は共通なので繰り返し処理採用
		for(int i = 0; i < 2; i++) {
			try {
				println((i + 1) + "人目の人物名を入力してください");
				name[i] = reader.readLine();
				
				println(name[i] + "さんの年齢を入力してください");
				String inputString = reader.readLine();
				// 入力は文字列で受け付けるのでパースしてあげましょう
				age += Integer.parseInt(inputString);
			} catch(IOException e) {
				// IOに関するエラーがある場合
				println("" + e);
			} catch(NumberFormatException e) {
				println("年齢が正しく入力されていません");
			}
		}
		
		// 2で割ってしまうと小数点以下が切り捨てられてしまうので、double型で計算してあげる
		println(name[0] + "さんと" + name[1] + "さんの年齢平均は" + (age / 2.0) + "歳です");
	}
	
	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
