import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


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

  private List<Plate> plateList = new ArrayList<Plate>();

  /**
   * 合計金額を取得するメソッド
   * 
   * @return 合計金額
   */
  public int getTotalPrice() {
    int totalPrice = 0;
    Iterator<Plate> it = this.plateList.iterator();

    while (it.hasNext()) { // 次のデータが存在するのなら
      Plate plate = it.next(); // 次のデータを取得
      totalPrice += plate.getPrice(); // 金額を加算
    }

    return totalPrice;
  }

  /**
   * 購入皿に赤皿を追加
   * 
   * @param lap 何周目であるか
   * @param isDiscount 割引対象であるか
   */
  public void addRedPlate(int lap, boolean isDiscount) {
    this.plateList.add(Plate.createRedPlate(lap, isDiscount)); // 何周目であるかを引数で指定
  }

  /**
   * 購入皿に青皿を追加
   * 
   * @param lap 何周目であるか
   * @param isDiscount 割引対象であるか
   */
  public void addBluePlate(int lap, boolean isDiscount) {
    this.plateList.add(Plate.createBluePlate(lap, isDiscount)); // 何周目であるかを引数で指定
  }

  /**
   * 購入皿に黃皿を追加
   * 
   * @param lap 何周目であるか
   * @param isDiscount 割引対象であるか
   */
  public void addYellowPlate(int lap, boolean isDiscount) {
    this.plateList.add(Plate.createYellowPlate(lap, isDiscount)); // 何周目であるかを引数で指定
  }

}
