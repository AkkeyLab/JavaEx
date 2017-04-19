package lesson.chap16;

import java.io.*;

public class ALesson {
	public static void main(String[] args) {
		if (args.length != 2) {
			println("How to use：java ALesson SearchString SearchFiles");
			println("ex：java ALesson System ALesson.java");
			System.exit(0);
		}
		String findstring = args[0];
		String filename = args[1];
		try {
			String line;
			int linenum = 1;
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			while ((line = reader.readLine()) != null) {
				int n = line.indexOf(findstring);
				if (n >= 0) {
					System.out.println(linenum + ":" + line);
				}
				linenum++;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			println(filename + ": Not found!");
		} catch (IOException e) {
			println("" + e);
		}
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
