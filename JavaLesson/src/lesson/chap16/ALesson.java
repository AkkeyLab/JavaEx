package lesson.chap16;

import java.io.*;


/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class ALesson {

  private static BufferedReader reader;

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    if (args.length != 2) {
      println(Messages.getString("ALesson.0")); //$NON-NLS-1$
      println(Messages.getString("ALesson.1")); //$NON-NLS-1$
      System.exit(0);
    }
    String findstring = args[0];
    String filename = args[1];
    try {
      String line;
      int linenum = 1;
      reader = new BufferedReader(new FileReader(filename));
      while ((line = reader.readLine()) != null) {
        int n = line.indexOf(findstring);
        if (n >= 0) {
          System.out.println(linenum + Messages.getString("ALesson.2") + line); //$NON-NLS-1$
        }
        linenum++;
      }
      reader.close();
    } catch (FileNotFoundException e) {
      println(filename + Messages.getString("ALesson.3")); //$NON-NLS-1$
      println("" + e); //$NON-NLS-1$
    } catch (IOException e) {
      println("" + e); //$NON-NLS-1$
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
