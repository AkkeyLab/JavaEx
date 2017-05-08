import static org.junit.Assert.*;

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
    String[] fewNetas = conveyer.getFewNetaList();

    assertEquals(3, fewNetas.length);
    assertEquals("まぐろ", fewNetas[0]); //$NON-NLS-1$
    assertEquals("とろ", fewNetas[1]); //$NON-NLS-1$
    assertEquals("いくら", fewNetas[2]); //$NON-NLS-1$
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
    String[] fewNetas = conveyer.getFewNetaList();

    assertEquals(2, fewNetas.length);
    assertEquals("とろ", fewNetas[0]); //$NON-NLS-1$
    assertEquals("いくら", fewNetas[1]); //$NON-NLS-1$
  }

}
