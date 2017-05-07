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
public class PlateTest {

  /**
   * 赤皿の金額取得に関するテスト
   */
  @Test
  public void testGetPriceRed() {
    Plate plate = new Plate("RED"); //$NON-NLS-1$
    assertEquals(100, plate.getPrice());
  }

  /**
   * 青皿の金額取得に関するテスト
   */
  @Test
  public void testGetPriceBlue() {
    Plate plate = new Plate("BLUE"); //$NON-NLS-1$
    assertEquals(300, plate.getPrice());
  }

  /**
   * 黃皿の金額取得に関するテスト
   */
  @Test
  public void testGetPriceYellow() {
    Plate plate = new Plate("YELLOW"); //$NON-NLS-1$
    assertEquals(450, plate.getPrice());
  }

}
