
/*
 * Created on May 8, 2017
 * Copyright (C) 2017 Koga Laboratory. All rights reserved.
 *
 */

/**
 * @author akkey
 * @version $Revision$, May 8, 2017
 */
public class Account {

  private int totalPrice;

  /**
   * 合計金額を取得するメソッド
   * 
   * @return 合計金額
   */
  public int getTotalPrice() {
    // TODO 自動生成されたメソッド・スタブ
    return this.totalPrice;
  }

  /**
   * 購入皿に赤皿を追加
   */
  public void addRedPlate() {
    // TODO 自動生成されたメソッド・スタブ
    this.totalPrice += 100;
  }

}
