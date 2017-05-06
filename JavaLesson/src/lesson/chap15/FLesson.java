package lesson.chap15;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class FLesson {

  Job[] jobs;

  /**
   * 新しく生成された<code>FLesson</code>オブジェクトを初期化します。
   * 
   * @param jobcount カウント数値
   */
  public FLesson(int jobcount) {
    this.jobs = new Job[jobcount];
    for (int i = 0; i < jobcount; i++) {
      this.jobs[i] = new Job(i);
    }
  }

  /**
   * 配列内容をすべて出力するメソッド
   */
  public void workAllJobs() {
    for (int i = 0; i < this.jobs.length; i++) {
      this.jobs[i].work();
    }
  }

  /**
   * 実行開始地点
   * 
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    FLesson self = new FLesson(10);
    while (true) {
      self.workAllJobs();
    }
  }
}
