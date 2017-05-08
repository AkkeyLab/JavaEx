import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
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
  public String[] getFewNetaListOld() {
    List<String> fewNetaList = new ArrayList<String>();

    Iterator<String> netaKeys = this.netaMap.keySet().iterator();
    for (; netaKeys.hasNext();) { // 次のデータが存在するのなら
      String netaKey = netaKeys.next(); // 次のデータを取得

      int count = this.netaMap.get(netaKey).intValue(); // コンベア上の皿の数を取得
      if (count <= 5) { // 5皿以下なら出力結果に加える
        fewNetaList.add(netaKey);
      }
    }

    return fewNetaList.toArray(new String[0]);
  }

  /**
   * ベルトコンベア上にあるネタリストを取得（改良版）
   * 
   * @return ネタリスト
   */
  public List<NetaCountVo> getFewNetaList() {
    List<NetaCountVo> netas = new ArrayList<NetaCountVo>();

    Iterator<String> netaKeys = this.netaMap.keySet().iterator();
    for (; netaKeys.hasNext();) { // 次のデータが存在するのなら
      String netaKey = netaKeys.next(); // 次のデータを取得

      int count = this.netaMap.get(netaKey).intValue(); // コンベア上の皿の数を取得
      if (count <= 5) { // 5皿以下なら出力結果に加える
        NetaCountVo vo = new NetaCountVo(netaKey, count);
        netas.add(vo);
      }
    }

    return netas;
  }

  /**
   * ベルトコンベア上にネタを追加する
   * 
   * @param neta ネタ名
   */
  public void add(String neta) {
    if (this.netaMap.containsKey(neta)) { // すでに同じネタ名が存在すれば
      int count = this.netaMap.get(neta).intValue();
      count++;
      this.netaMap.put(neta, new Integer(count)); // カウントアップした値をセット
    } else {
      this.netaMap.put(neta, new Integer(1)); // 初めてだから初期値1
    }
  }

}
