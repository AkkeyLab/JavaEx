package lesson.chap04;

import java.io.*;

public class ALesson {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		outQuestion();
		try {
			String inputString = reader.readLine();
			int n = Integer.parseInt(inputString);
			outAns(n);

		} catch (IOException e) {
			println("" + e);
		} catch (NumberFormatException e) {
			println("数字の形式が正しくありません");
		}
	}

	public static void outQuestion() {
		String[] qStrings = { "飲み物は何が好きですか？", "1 オレンジジュース", "2 コーヒー", "3 ミルク", "4 どれでもない", "1, 2, 3, 4のどれかを選んでください" };

		for (int i = 0; i < qStrings.length; i++) {
			println(qStrings[i]);
		}
	}

	public static void outAns(int n) {
		// C言語と同じと考えておけば問題ない
		// Swiftでは貫通しない

		// あまり使わないとは思うが、比較に文字も最新Javaでは使用できる
		switch (n) {
		case 1:
			System.out.println("オレンジジュースです");
			break;
		case 2:
			System.out.println("コーヒーです");
			break;
		case 3:
			System.out.println("ミルクです");
			break;
		default:
			System.out.println("どれでもありません");
			break;
		}
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
