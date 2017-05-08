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
      assertEquals(RED_PRICE, Plate.createRedPlate(i, true).getPrice(), 0);
    }

    for (int i = 5; i <= 9; i++) {
      assertEquals(RED_PRICE * 0.9, Plate.createRedPlate(i, true).getPrice(), 0);
    }

    assertEquals(RED_PRICE * 0.8, Plate.createRedPlate(10, true).getPrice(), 0);
  }

  /**
   * 青皿の金額取得に関するテスト
   */
  @Test
  public void testGetPriceBlue() {
    final double BLUE_PRICE = 300;

    for (int i = 1; i <= 4; i++) {
      assertEquals(BLUE_PRICE, Plate.createBluePlate(i, true).getPrice(), 0);
    }

    for (int i = 5; i <= 9; i++) {
      assertEquals(BLUE_PRICE * 0.9, Plate.createBluePlate(i, true).getPrice(), 0);
    }

    assertEquals(BLUE_PRICE * 0.8, Plate.createBluePlate(10, true).getPrice(), 0);
  }

  /**
   * 黃皿の金額取得に関するテスト
   */
  @Test
  public void testGetPriceYellow() {
    final double YELLOW_PRICE = 450;

    for (int i = 1; i <= 4; i++) {
      assertEquals(YELLOW_PRICE, Plate.createYellowPlate(i, true).getPrice(), 0);
    }

    for (int i = 5; i <= 9; i++) {
      assertEquals(YELLOW_PRICE * 0.9, Plate.createYellowPlate(i, true).getPrice(), 0);
    }

    assertEquals(YELLOW_PRICE * 0.8, Plate.createYellowPlate(10, true).getPrice(), 0);
  }

  /**
   * 銀皿の金額取得に関するテスト
   */
  @Test
  public void testGetPriceSilver() {
    final double SILVER_PRICE = 550;

    for (int i = 1; i <= 4; i++) {
      assertEquals(SILVER_PRICE, Plate.createSilverPlate(i, true).getPrice(), 0);
    }

    for (int i = 5; i <= 9; i++) {
      assertEquals(SILVER_PRICE * 0.9, Plate.createSilverPlate(i, true).getPrice(), 0);
    }

    assertEquals(SILVER_PRICE * 0.8, Plate.createSilverPlate(10, true).getPrice(), 0);
  }

  /**
   * 金皿の金額取得に関するテスト
   */
  @Test
  public void testGetPriceGold() {
    final double GOLD_PRICE = 700;

    for (int i = 1; i <= 4; i++) {
      assertEquals(GOLD_PRICE, Plate.createGoldPlate(i, true).getPrice(), 0);
    }

    for (int i = 5; i <= 9; i++) {
      assertEquals(GOLD_PRICE * 0.9, Plate.createGoldPlate(i, true).getPrice(), 0);
    }

    assertEquals(GOLD_PRICE * 0.8, Plate.createGoldPlate(10, true).getPrice(), 0);
  }

}
