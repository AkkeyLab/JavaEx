
/*
 * Created on May 8, 2017
 * Copyright (C) 2017 Koga Laboratory. All rights reserved.
 *
 */

/**
 * @author akkey
 * @version $Revision$, May 8, 2017
 */
public class Conveyer {

  private String[] netas;

  /**
   * ベルトコンベア上にあるネタリストを取得
   * 
   * @return ネタリスト
   */
  public String[] getFewNetaList() {
    return this.netas;
  }

  /**
   * ベルトコンベア上にネタを追加する
   * @param neta ネタ名
   */
  public void add(String neta) {
    // TODO 自動生成されたメソッド・スタブ
    this.netas = new String[1];
    this.netas[0] = neta;
  }

}
