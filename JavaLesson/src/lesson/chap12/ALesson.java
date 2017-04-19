package lesson.chap12;

public class ALesson {
	public static void main(String[] args) {
		int[] myarray = new int[3];
		// 確保していないアドレスへのアクセスを試みる
		// もちろんエラーが返ってくる
		myAssign(myarray, 100, 0);
		println("END");
	}

	static void myAssign(int[] arr, int index, int value) {
		println("myAssign");
		try {
			println("Let's input value");
			arr[index] = value;
			println("Value input Completed");
		} catch (ArrayIndexOutOfBoundsException e) {
			println("Exception");
			println("Exception : " + e);
		}
		println("return");
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
