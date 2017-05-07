
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
  private static final String TYPE_RED = "RED"; //$NON-NLS-1$
  private static final String TYPE_BLUE = "BLUE"; //$NON-NLS-1$
  private static final String TYPE_YELLOW = "YELLOW"; //$NON-NLS-1$

  /**
   * 新しく生成された<code>Plate</code>オブジェクトを初期化します。
   * 
   * @param type 皿のタイプ
   */
  private Plate(String type) {
    // ここへ自由に値を代入できることは脆弱性にも繋がるため、外部からのアクセスを遮断
    this.type = type;
  }

  /**
   * 各種皿の金額を取得するメソッド
   * 
   * @return 金額
   */
  public int getPrice() {
    if (this.type.equals(TYPE_RED)) {
      return 100;
    } else if (this.type.equals(TYPE_BLUE)) {
      return 300;
    } else if (this.type.equals(TYPE_YELLOW)) {
      return 450;
    }
    return 0;
  }

  /**
   * 赤皿に関するオブジェクト生成メソッド
   * 
   * @return Plateオブジェクト
   */
  public static Plate createRedPlate() {
    return new Plate(TYPE_RED);
  }

  /**
   * 青皿に関するオブジェクト生成メソッド
   * 
   * @return Plateオブジェクト
   */
  public static Plate createBluePlate() {
    return new Plate(TYPE_BLUE);
  }

  /**
   * 黃皿に関するオブジェクト生成メソッド
   * 
   * @return Plateオブジェクト
   */
  public static Plate createYellowPlate() {
    return new Plate(TYPE_YELLOW);
  }

}
