import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


/*
 * Created on May 8, 2017
 * Copyright (C) 2017 Koga Laboratory. All rights reserved.
 *
 */

/**
 * @author akkey
 * @version $Revision$, May 8, 2017
 */
public class ConveyerTest {

  /**
   * ベルトコンベア上にあるネタ数取得に関するテスト1
   */
  @Test
  public void testFewNetaList1() {
    Conveyer conveyer = new Conveyer();
    conveyer.add("まぐろ"); //$NON-NLS-1$
    conveyer.add("まぐろ"); //$NON-NLS-1$
    conveyer.add("とろ"); //$NON-NLS-1$
    conveyer.add("いくら"); //$NON-NLS-1$
    conveyer.add("まぐろ"); //$NON-NLS-1$

    List<NetaCountVo> fewNetas = conveyer.getFewNetaList();
    assertEquals(3, fewNetas.size());

    NetaCountVo vo = fewNetas.get(0);
    assertEquals("まぐろ", vo.name); //$NON-NLS-1$
    assertEquals(3, vo.count);
    vo = fewNetas.get(1);
    assertEquals("とろ", vo.name); //$NON-NLS-1$
    assertEquals(1, vo.count);
    vo = fewNetas.get(2);
    assertEquals("いくら", vo.name); //$NON-NLS-1$
    assertEquals(1, vo.count);
  }

  /**
   * ベルトコンベア上にあるネタ数取得に関するテスト2
   */
  @Test
  public void testFewNetaList2() {
    Conveyer conveyer = new Conveyer();
    // ----- 5皿を超えると検出対象外 -----
    conveyer.add("まぐろ"); //$NON-NLS-1$
    conveyer.add("まぐろ"); //$NON-NLS-1$
    conveyer.add("まぐろ"); //$NON-NLS-1$
    conveyer.add("まぐろ"); //$NON-NLS-1$
    conveyer.add("まぐろ"); //$NON-NLS-1$
    conveyer.add("まぐろ"); //$NON-NLS-1$
    // -----
    conveyer.add("とろ"); //$NON-NLS-1$
    conveyer.add("いくら"); //$NON-NLS-1$

    List<NetaCountVo> fewNetas = conveyer.getFewNetaList();
    assertEquals(2, fewNetas.size());

    NetaCountVo vo = fewNetas.get(0);
    assertEquals("とろ", vo.name); //$NON-NLS-1$
    assertEquals(1, vo.count);
    vo = fewNetas.get(1);
    assertEquals("いくら", vo.name); //$NON-NLS-1$
    assertEquals(1, vo.count);
  }

  /**
   * ベルトコンベア上にあるネタ数取得に関するテスト3
   */
  @Test
  public void testFewNetaList3() {
    Conveyer conveyer = new Conveyer();
    conveyer.add("まぐろ"); //$NON-NLS-1$
    List<NetaCountVo> fewNetas = conveyer.getFewNetaList();

    assertEquals(1, fewNetas.size());
    NetaCountVo vo = fewNetas.get(0);
    assertEquals("まぐろ", vo.name); //$NON-NLS-1$
    assertEquals(1, vo.count);
  }

}
