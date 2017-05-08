
/*
 * Created on May 8, 2017
 * Copyright (C) 2017 Koga Laboratory. All rights reserved.
 *
 */

/**
 * @author akkey
 * @version $Revision$, May 8, 2017
 */
public class NetaCountVo {

  /** */
  public String name;
  /** */
  public int count;

  /**
   * 新しく生成された<code>NetaCountVo</code>オブジェクトを初期化します。
   * 
   * @param name ネタ名
   * @param count ネタ個数
   */
  public NetaCountVo(String name, int count) {
    this.name = name;
    this.count = count;
  }

}
