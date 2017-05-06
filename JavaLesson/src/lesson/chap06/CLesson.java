package lesson.chap06;

import java.io.*;


/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class CLesson {

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    String[] baseStrings = {"<!DOCTYPE html>", "<html>", "<head>", "<title>My Page</title>", "</head>", "<body>", "</body>", "</html>"}; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$

    for (int i = 0; i < 6; i++) {
      println(baseStrings[i]);
    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String input;

    try {
      // 未入力になるまでループ
      while ((input = reader.readLine()) != null) {
        // 入力文字の初めが「■」であれば
        if (input.startsWith("■")) { //$NON-NLS-1$
          // substringは、始まりと終わりの文字位置を指定することで、その間の文字列を抜き出すことが可能
          // 0スタートなので、2文字以降を取り出す
          println("<h1>" + input.substring(1) + "</h1>"); //$NON-NLS-1$ //$NON-NLS-2$
        } else if (input.startsWith("●")) { //$NON-NLS-1$
          println("<h2>" + input.substring(1) + "</h2>"); //$NON-NLS-1$//$NON-NLS-2$
        } else {
          println("<p>" + input + "</p>"); //$NON-NLS-1$ //$NON-NLS-2$
        }
      }
    } catch (IOException e) {
      println("" + e); //$NON-NLS-1$
    }

    for (int i = 6; i < 8; i++) {
      println(baseStrings[i]);
    }
  }

  /**
   * 文字出力が簡単にできるメソッド
   * 
   * @param s 出力する文字列
   */
  public static void println(String s) {
    System.out.println(s);
  }
}
