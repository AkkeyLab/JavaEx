package lesson.chap08;

/*
 * 31 41 59 26 53 58 97 93 23 84 
 * ----- sort -----
 * 26 41 59 31 53 58 97 93 23 84 
 * 23 41 59 31 53 58 97 93 26 84 
 * 23 31 59 41 53 58 97 93 26 84 
 * 23 26 59 41 53 58 97 93 31 84 
 * 23 26 41 59 53 58 97 93 31 84 
 * 23 26 31 59 53 58 97 93 41 84 
 * 23 26 31 53 59 58 97 93 41 84 
 * 23 26 31 41 59 58 97 93 53 84 
 * 23 26 31 41 58 59 97 93 53 84 
 * 23 26 31 41 53 59 97 93 58 84 
 * 23 26 31 41 53 58 97 93 59 84 
 * 23 26 31 41 53 58 93 97 59 84 
 * 23 26 31 41 53 58 59 97 93 84 
 * 23 26 31 41 53 58 59 93 97 84 
 * 23 26 31 41 53 58 59 84 97 93 
 * 23 26 31 41 53 58 59 84 93 97 
 * ----------------
 * 23 26 31 41 53 58 59 84 93 97
 * 
 */

public class ELesson {
	public static void main(String[] args) {
		int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
		printArray(data);

		// 左から順に、一つを固定して
		// それと右側の数値をそれぞれ比較していく
		println("----- sort -----");
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					// 左が右より大きければ入れ替える
					// Swiftだったら
					// _ a = data[i];
					// と定義するといい
					int a = data[i];
					data[i] = data[j];
					data[j] = a;

					printArray(data);
				}
			}
		}
		println("----------------");

		printArray(data);
	}

	public static void printArray(int[] data) {
		for (int i = 0; i < data.length; i++) {
			print(data[i] + " ");
		}
		println("");
	}

	public static void print(String s) {
		System.out.print(s);
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
