
/*
 * Created on May 8, 2017
 * Copyright (C) 2017 Koga Laboratory. All rights reserved.
 *
 */

/**
 * @author akkey
 * @version $Revision$, May 8, 2017
 */
public class Plate {

  private String type;
  private int lap;
  private boolean isDiscount;
  private static final String TYPE_RED = "RED"; //$NON-NLS-1$
  private static final String TYPE_BLUE = "BLUE"; //$NON-NLS-1$
  private static final String TYPE_YELLOW = "YELLOW"; //$NON-NLS-1$
  private static final String TYPE_SILVER = "SILVER"; //$NON-NLS-1$
  private static final String TYPE_GOLD = "GOLD"; //$NON-NLS-1$

  /**
   * 新しく生成された<code>Plate</code>オブジェクトを初期化します。
   * 
   * @param type 皿のタイプ
   */
  private Plate(String type, int lap, boolean isDiscount) {
    // ここへ自由に値を代入できることは脆弱性にも繋がるため、外部からのアクセスを遮断
    this.type = type;
    this.lap = lap;
    this.isDiscount = isDiscount;
  }

  /**
   * 各種皿の金額を取得するメソッド
   * 
   * @return 金額
   */
  public double getPrice() {
    double price = 0;

    if (this.isDiscount) {
      if (this.type.equals(TYPE_RED)) {
        price = 100;
      } else if (this.type.equals(TYPE_BLUE)) {
        price = 300;
      } else if (this.type.equals(TYPE_YELLOW)) {
        price = 450;
      } else if (this.type.equals(TYPE_SILVER)) {
        price = 550;
      } else if (this.type.equals(TYPE_GOLD)) {
        price = 700;
      }
    }
    return calcDiscount(price);
  }

  private double calcDiscount(double price) {
    // 割引処理
    double discountPrice = price;
    if (this.lap >= 5 && this.lap <= 9) {
      discountPrice *= 0.9;
    } else if (this.lap >= 10) {
      discountPrice *= 0.8;
    }

    return discountPrice;
  }

  /**
   * 赤皿に関するオブジェクト生成メソッド
   * 
   * @param lap 何周目であるか
   * @param isDiscount 割引対象であるか
   * 
   * @return Plateオブジェクト
   */
  public static Plate createRedPlate(int lap, boolean isDiscount) {
    return new Plate(TYPE_RED, lap, isDiscount);
  }

  /**
   * 青皿に関するオブジェクト生成メソッド
   * 
   * @param lap 何周目であるか
   * @param isDiscount 割引対象であるか
   * 
   * @return Plateオブジェクト
   */
  public static Plate createBluePlate(int lap, boolean isDiscount) {
    return new Plate(TYPE_BLUE, lap, isDiscount);
  }

  /**
   * 黃皿に関するオブジェクト生成メソッド
   * 
   * @param lap 何周目であるか
   * @param isDiscount 割引対象であるか
   * 
   * @return Plateオブジェクト
   */
  public static Plate createYellowPlate(int lap, boolean isDiscount) {
    return new Plate(TYPE_YELLOW, lap, isDiscount);
  }

  /**
   * 銀皿に関するオブジェクト生成メソッド
   * 
   * @param lap 何周目であるか
   * @param isDiscount 割引対象であるか
   * @return Plateオブジェクト
   */
  public static Plate createSilverPlate(int lap, boolean isDiscount) {
    // TODO 自動生成されたメソッド・スタブ
    return new Plate(TYPE_SILVER, lap, isDiscount);
  }

  /**
   * 金皿に関するオブジェクト生成メソッド
   * 
   * @param lap 何周目であるか
   * @param isDiscount 割引対象であるか
   * @return PLateオブジェクト
   */
  public static Plate createGoldPlate(int lap, boolean isDiscount) {
    // TODO 自動生成されたメソッド・スタブ
    return new Plate(TYPE_GOLD, lap, isDiscount);
  }

}
