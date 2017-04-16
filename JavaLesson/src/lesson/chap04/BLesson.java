package lesson.chap04;

import java.io.*;

public class BLesson {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		println("0〜6の数字を入力してください\n対応した曜日を表示します");
		try {
			String inputString = reader.readLine();
            int n = Integer.parseInt(inputString);
            outAns(n);
            
		} catch(IOException e) {
            System.out.println(e);
        } catch(NumberFormatException e) {
            System.out.println("数字の形式が正しくありません");
        }
	}
	
	public static void outAns(int n) {
		String[] week = {
	            "日曜日",
	            "月曜日",
	            "火曜日",
	            "水曜日",
	            "木曜日",
	            "金曜日",
	            "土曜日",
	        };
		
		 if (0 <= n && n < 7) {
             println(week[n]);
         } else {
             println("0〜6の範囲で入力してください");
         }
	}
	
	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
