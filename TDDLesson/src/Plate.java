
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
  public Plate(String type) {
    // TODO 自動生成されたコンストラクター・スタブ
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

}
