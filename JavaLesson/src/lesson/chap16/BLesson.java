package lesson.chap16;

import java.io.*;

public class BLesson {
	static final int MAX_PRIME = 1000;

	public static void main(String[] args) {
		// コマンド引数は適切？
		if (args.length != 1) {
			println("How to use：java BLesson MakeFile");
			println("ex：java BLesson BLesson.txt");
			// 終了
			System.exit(0);
		}
		
		// 引数を取得
		String filename = args[0];
		try {
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
			writePrime(writer);
			writer.close();
		} catch (FileNotFoundException e) {
			println(filename + ": Not found!");
		} catch (IOException e) {
			println("" + e);
		}
	}

	public static void writePrime(PrintWriter writer) {
		boolean[] prime = new boolean[MAX_PRIME];
		for (int n = 0; n < MAX_PRIME; n++) {
			prime[n] = true;
		}
		prime[0] = false;
		prime[1] = false;
		for (int n = 0; n < MAX_PRIME; n++) {
			if (prime[n]) {
				writer.println(n);
				for (int i = 2; i * n < MAX_PRIME; i++) {
					prime[i * n] = false;
				}
			}
		}
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
