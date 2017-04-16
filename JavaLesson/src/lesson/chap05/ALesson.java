package lesson.chap05;

public class ALesson {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
            print(i + ":");
            for (int j = 0; j < i * i; j++) {
                print("*");
            }
            println("");
        }
	}
	
	// 改行なし
	public static void print(String s) {
		System.out.print(s);
	}
	
	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
