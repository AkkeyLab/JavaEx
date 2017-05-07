
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
    // TODO 自動生成されたメソッド・スタブ
    if (this.type.equals("RED")) { //$NON-NLS-1$
      return 100;
    } else if (this.type.equals("BLUE")) { //$NON-NLS-1$
      return 300;
    } else if (this.type.equals("YELLOW")) { //$NON-NLS-1$
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
    // TODO 自動生成されたメソッド・スタブ
    return new Plate("RED"); //$NON-NLS-1$
  }

  /**
   * 青皿に関するオブジェクト生成メソッド
   * 
   * @return Plateオブジェクト
   */
  public static Plate createBluePlate() {
    // TODO 自動生成されたメソッド・スタブ
    return new Plate("BLUE"); //$NON-NLS-1$
  }

  /**
   * 黃皿に関するオブジェクト生成メソッド
   * 
   * @return Plateオブジェクト
   */
  public static Plate createYellowPlate() {
    // TODO 自動生成されたメソッド・スタブ
    return new Plate("YELLOW"); //$NON-NLS-1$
  }

}
