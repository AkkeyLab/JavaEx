
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
  private static final String TYPE_RED = "RED"; //$NON-NLS-1$
  private static final String TYPE_BLUE = "BLUE"; //$NON-NLS-1$
  private static final String TYPE_YELLOW = "YELLOW"; //$NON-NLS-1$

  /**
   * 新しく生成された<code>Plate</code>オブジェクトを初期化します。
   * 
   * @param type 皿のタイプ
   */
  private Plate(String type, int lap) {
    // ここへ自由に値を代入できることは脆弱性にも繋がるため、外部からのアクセスを遮断
    this.type = type;
    this.lap = lap;
  }

  /**
   * 各種皿の金額を取得するメソッド
   * 
   * @return 金額
   */
  public double getPrice() {
    double price = 0;

    if (this.type.equals(TYPE_RED)) {
      price = 100;
    } else if (this.type.equals(TYPE_BLUE)) {
      price = 300;
    } else if (this.type.equals(TYPE_YELLOW)) {
      price = 450;
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
   * 
   * @return Plateオブジェクト
   */
  public static Plate createRedPlate(int lap) {
    return new Plate(TYPE_RED, lap);
  }

  /**
   * 青皿に関するオブジェクト生成メソッド
   * 
   * @param lap 何周目であるか
   * 
   * @return Plateオブジェクト
   */
  public static Plate createBluePlate(int lap) {
    return new Plate(TYPE_BLUE, lap);
  }

  /**
   * 黃皿に関するオブジェクト生成メソッド
   * 
   * @param lap 何周目であるか
   * 
   * @return Plateオブジェクト
   */
  public static Plate createYellowPlate(int lap) {
    return new Plate(TYPE_YELLOW, lap);
  }

}
