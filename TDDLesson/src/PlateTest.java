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
    assertEquals(100, plate.getPrice(), 0);

    Plate plate2 = Plate.createRedPlate(2);
    assertEquals(plate.getPrice(), plate2.getPrice(), 0);

    Plate plate3 = Plate.createRedPlate(3);
    assertEquals(plate.getPrice(), plate3.getPrice(), 0);

    Plate plate4 = Plate.createRedPlate(4);
    assertEquals(plate.getPrice(), plate4.getPrice(), 0);
    // -----
    Plate plate5 = Plate.createRedPlate(5);
    assertEquals(plate.getPrice() * 0.9, plate5.getPrice(), 0);

    Plate plate6 = Plate.createRedPlate(6);
    assertEquals(plate.getPrice() * 0.9, plate6.getPrice(), 0);

    Plate plate7 = Plate.createRedPlate(7);
    assertEquals(plate.getPrice() * 0.9, plate7.getPrice(), 0);

    Plate plate8 = Plate.createRedPlate(8);
    assertEquals(plate.getPrice() * 0.9, plate8.getPrice(), 0);

    Plate plate9 = Plate.createRedPlate(9);
    assertEquals(plate.getPrice() * 0.9, plate9.getPrice(), 0);
    // -----
    Plate plate10 = Plate.createRedPlate(10);
    assertEquals(plate.getPrice() * 0.8, plate10.getPrice(), 0);
  }

  /**
   * 青皿の金額取得に関するテスト
   */
  @Test
  public void testGetPriceBlue() {
    Plate plate = Plate.createBluePlate(1); // 何周目であるかを引数で指定
    assertEquals(300, plate.getPrice(), 0);

    Plate plate2 = Plate.createBluePlate(2);
    assertEquals(plate.getPrice(), plate2.getPrice(), 0);

    Plate plate3 = Plate.createBluePlate(3);
    assertEquals(plate.getPrice(), plate3.getPrice(), 0);

    Plate plate4 = Plate.createBluePlate(4);
    assertEquals(plate.getPrice(), plate4.getPrice(), 0);
    // -----
    Plate plate5 = Plate.createBluePlate(5);
    assertEquals(plate.getPrice() * 0.9, plate5.getPrice(), 0);

    Plate plate6 = Plate.createBluePlate(6);
    assertEquals(plate.getPrice() * 0.9, plate6.getPrice(), 0);

    Plate plate7 = Plate.createBluePlate(7);
    assertEquals(plate.getPrice() * 0.9, plate7.getPrice(), 0);

    Plate plate8 = Plate.createBluePlate(8);
    assertEquals(plate.getPrice() * 0.9, plate8.getPrice(), 0);

    Plate plate9 = Plate.createBluePlate(9);
    assertEquals(plate.getPrice() * 0.9, plate9.getPrice(), 0);
    // -----
    Plate plate10 = Plate.createBluePlate(10);
    assertEquals(plate.getPrice() * 0.8, plate10.getPrice(), 0);
  }

  /**
   * 黃皿の金額取得に関するテスト
   */
  @Test
  public void testGetPriceYellow() {
    Plate plate = Plate.createYellowPlate(1); // 何周目であるかを引数で指定
    assertEquals(450, plate.getPrice(), 0);

    Plate plate2 = Plate.createYellowPlate(2);
    assertEquals(plate.getPrice(), plate2.getPrice(), 0);

    Plate plate3 = Plate.createYellowPlate(3);
    assertEquals(plate.getPrice(), plate3.getPrice(), 0);

    Plate plate4 = Plate.createYellowPlate(4);
    assertEquals(plate.getPrice(), plate4.getPrice(), 0);
    // -----
    Plate plate5 = Plate.createYellowPlate(5);
    assertEquals(plate.getPrice() * 0.9, plate5.getPrice(), 0);

    Plate plate6 = Plate.createYellowPlate(6);
    assertEquals(plate.getPrice() * 0.9, plate6.getPrice(), 0);

    Plate plate7 = Plate.createYellowPlate(7);
    assertEquals(plate.getPrice() * 0.9, plate7.getPrice(), 0);

    Plate plate8 = Plate.createYellowPlate(8);
    assertEquals(plate.getPrice() * 0.9, plate8.getPrice(), 0);

    Plate plate9 = Plate.createYellowPlate(9);
    assertEquals(plate.getPrice() * 0.9, plate9.getPrice(), 0);
    // -----
    Plate plate10 = Plate.createYellowPlate(10);
    assertEquals(plate.getPrice() * 0.8, plate10.getPrice(), 0);
  }

}
