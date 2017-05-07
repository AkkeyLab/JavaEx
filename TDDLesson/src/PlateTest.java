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
    final double RED_PRICE = 100;

    for (int i = 1; i <= 4; i++) {
      assertEquals(RED_PRICE, Plate.createRedPlate(i).getPrice(), 0);
    }

    for (int i = 5; i <= 9; i++) {
      assertEquals(RED_PRICE * 0.9, Plate.createRedPlate(i).getPrice(), 0);
    }

    assertEquals(RED_PRICE * 0.8, Plate.createRedPlate(10).getPrice(), 0);
  }

  /**
   * 青皿の金額取得に関するテスト
   */
  @Test
  public void testGetPriceBlue() {
    final double BLUE_PRICE = 300;

    for (int i = 1; i <= 4; i++) {
      assertEquals(BLUE_PRICE, Plate.createBluePlate(i).getPrice(), 0);
    }

    for (int i = 5; i <= 9; i++) {
      assertEquals(BLUE_PRICE * 0.9, Plate.createBluePlate(i).getPrice(), 0);
    }

    assertEquals(BLUE_PRICE * 0.8, Plate.createBluePlate(10).getPrice(), 0);
  }

  /**
   * 黃皿の金額取得に関するテスト
   */
  @Test
  public void testGetPriceYellow() {
    final double YELLOW_PRICE = 450;

    for (int i = 1; i <= 4; i++) {
      assertEquals(YELLOW_PRICE, Plate.createYellowPlate(i).getPrice(), 0);
    }

    for (int i = 5; i <= 9; i++) {
      assertEquals(YELLOW_PRICE * 0.9, Plate.createYellowPlate(i).getPrice(), 0);
    }

    assertEquals(YELLOW_PRICE * 0.8, Plate.createYellowPlate(10).getPrice(), 0);
  }

}
