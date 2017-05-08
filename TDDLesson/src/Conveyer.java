import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


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

  private Map<String, Integer> netaMap = new LinkedHashMap<String, Integer>();

  /**
   * ベルトコンベア上にあるネタリストを取得
   * 
   * @return ネタリスト
   */
  public String[] getFewNetaList() {
    String[] netas = new String[this.netaMap.size()];

    Iterator<String> netaKeys = this.netaMap.keySet().iterator();
    for (int i = 0; netaKeys.hasNext(); i++) {
      String netaKey = netaKeys.next();
      netas[i] = netaKey;
    }

    return netas;
  }

  /**
   * ベルトコンベア上にネタを追加する
   * 
   * @param neta ネタ名
   */
  public void add(String neta) {
    this.netaMap.put(neta, new Integer(1));
  }

}
