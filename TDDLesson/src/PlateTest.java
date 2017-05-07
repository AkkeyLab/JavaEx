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
    Plate plate = Plate.createRedPlate(1); // 何周目であるかを引数で指定
    assertEquals(100, plate.getPrice());
  }

  /**
   * 青皿の金額取得に関するテスト
   */
  @Test
  public void testGetPriceBlue() {
    Plate plate = Plate.createBluePlate(1); // 何周目であるかを引数で指定
    assertEquals(300, plate.getPrice());
  }

  /**
   * 黃皿の金額取得に関するテスト
   */
  @Test
  public void testGetPriceYellow() {
    Plate plate = Plate.createYellowPlate(1); // 何周目であるかを引数で指定
    assertEquals(450, plate.getPrice());
  }

}
