package lesson.chap04;

import java.io.*;

public class ALesson {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		outQuestion();
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
	
	public static void outQuestion() {
		println("飲み物は何が好きですか？");
        println("1 オレンジジュース");
        println("2 コーヒー");
        println("3 ミルク");
        println("4 どれでもない");
        println("1, 2, 3, 4のどれかを選んでください");
	}
	
	public static void outAns(int n) {
		// C言語と同じと考えておけば問題ない
		// Swiftでは貫通しない
		
		// あまり使わないとは思うが、比較に文字も最新Javaでは使用できる
		switch(n) {
        case 1:
            System.out.println("オレンジジュースです");
            break;
        case 2:
            System.out.println("コーヒーです");
            break;
        case 3:
            System.out.println("ミルクです");
            break;
        default:
            System.out.println("どれでもありません");
            break;
        }
	}
	
	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
