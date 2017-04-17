package lesson.chap08;

public class DLesson {
	public static void main(String[] args) {
		// 配列の要素中の配列は盗一化させる必要がない
		int[][] arr = { { 3, 1, 4, 1 }, { 5, 9, 2 }, { 6, 5 }, { 3 } };
		printArray(arr);
	}

	// 多次元配列になっても、そこまで難易度は変わらない
	public static void printArray(int[][] a) {
		println("{");
		for (int i = 0; i < a.length; i++) {
			print("    { ");
			for (int j = 0; j < a[i].length; j++) {
				print(a[i][j] + ", ");
			}
			println("},");
		}
		println("}");
	}

	public static void print(String s) {
		System.out.print(s);
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
