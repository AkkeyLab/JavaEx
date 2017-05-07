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
   * ベルトコンベア上にあるネタ数取得に関するテスト
   */
  @Test
  public void testFewNetaList1() {
    Conveyer conveyer = new Conveyer();
    String[] fewNetas = conveyer.getFewNetaList();

    assertEquals("まぐろ", fewNetas[0]); //$NON-NLS-1$
  }

}
