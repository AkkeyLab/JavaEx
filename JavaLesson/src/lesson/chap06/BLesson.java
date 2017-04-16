package lesson.chap06;

public class BLesson {
	public static void main(String[] args) {
        int i = 0;
        
        // 10未満である限り繰り返す
        while (i < 10) {
            int j = 0;
            while (j < i * i) {
                print("*");
                j++;
            }
            i++;
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
