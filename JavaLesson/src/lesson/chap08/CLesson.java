package lesson.chap08;

public class CLesson {
	public static void main(String[] args) {
		int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };

		println(originalMax(data));
		println(exMax(data));
	}

	// 比較的簡単なアルゴリズムを利用したメソッド
	// 仮の最大値を設定し、各データを比較しながら最大値を更新していくスタイルである
	public static String originalMax(int[] data) {
		int max_data = data[0];
		for (int i = 0; i < data.length; i++) {
			if (max_data < data[i]) {
				max_data = data[i];
			}
		}
		return "最大値は" + max_data + "です";
	}

	public static String exMax(int[] data) {
		int max_data = data[0];
		for (int i = 0; i < data.length; i++) {
			// Mathのmaxは引数に与えられた値の中で最大なものを戻り値として返す
			// ifで分岐させる必要がなくなっている
			max_data = Math.max(max_data, data[i]);
		}
		return "最大値は" + max_data + "です";
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
