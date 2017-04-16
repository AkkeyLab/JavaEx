package lesson.chap06;

import java.io.*;

public class CLesson {
	public static void main(String[] args) {
		String[] baseStrings = { "<!DOCTYPE html>",
				"<html>",
				"<head>",
				"<title>My Page</title>",
				"</head>",
				"<body>",
				"</body>",
				"</html>" };
		
		for(int i = 0; i < 6; i++) {
			println(baseStrings[i]);
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input;
		
		try {
			// 未入力になるまでループ
			while ((input = reader.readLine()) != null) {
				// 入力文字の初めが「■」であれば
	            if (input.startsWith("■")) {
	            	// substringは、始まりと終わりの文字位置を指定することで、その間の文字列を抜き出すことが可能
	            	// 0スタートなので、2も時以降を取り出す
	                println("<h1>" + input.substring(1) + "</h1>");
	            } else if (input.startsWith("●")) {
	                println("<h2>" + input.substring(1) + "</h2>");
	            } else {
	            	println("<p>" + input + "</p>");
	            }
	        }
		} catch(IOException e) {
            println("" + e);
        }
		
		for(int i = 6; i < 8; i++) {
			println(baseStrings[i]);
		}
	}
	
	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
