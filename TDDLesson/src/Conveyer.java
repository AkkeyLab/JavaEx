
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
  private int count;

  /**
   * ベルトコンベア上にあるネタリストを取得
   * 
   * @return ネタリスト
   */
  public String[] getFewNetaList() {
    this.netas = new String[this.count];
    this.netas[0] = "まぐろ"; //$NON-NLS-1$
    if (this.count > 1) {
      this.netas[1] = "とろ"; //$NON-NLS-1$
    }
    return this.netas;
  }

  /**
   * ベルトコンベア上にネタを追加する
   * 
   * @param neta ネタ名
   */
  public void add(String neta) {
    this.count++;
  }

}
