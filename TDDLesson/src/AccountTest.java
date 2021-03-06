import org.junit.Test;

import junit.framework.TestCase;


/*
 * Created on May 8, 2017
 * Copyright (C) 2017 Koga Laboratory. All rights reserved.
 *
 */

/**
 * @author akkey
 * @version $Revision$, May 8, 2017
 */
public class AccountTest extends TestCase {

  private Account account;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    this.account = new Account();
  }

  /**
   * 赤皿に関するメソッド
   */
  @Test
  public void testRedPlate() {
    this.account.addRedPlate(1, true);
    assertEquals(100, this.account.getTotalPrice());
  }

  /**
   * 青皿に関するメソッド
   */
  @Test
  public void testBluePlate() {
    this.account.addBluePlate(1, true);
    assertEquals(300, this.account.getTotalPrice());
  }

  /**
   * 黃皿に関するメソッド
   */
  @Test
  public void testYellowPlate() {
    this.account.addYellowPlate(1, true);
    assertEquals(450, this.account.getTotalPrice());
  }

  /**
   * 銀皿に関するメソッド
   */
  @Test
  public void testSilverPlate() {
    this.account.addSilverPlate(1, true);
    assertEquals(550, this.account.getTotalPrice());
  }

  /**
   * 金皿に関するメソッド
   */
  @Test
  public void testGoldPlate() {
    this.account.addGoldPlate(1, true);
    assertEquals(700, this.account.getTotalPrice());
  }

  /**
   * 全皿種類に関するメソッド
   */
  @Test
  public void testMultiplePlate() {
    this.account.addBluePlate(1, true); // 300
    this.account.addRedPlate(1, true); // 300 + 100 = 400
    this.account.addRedPlate(1, true); // 400 + 100 = 500
    assertEquals(500, this.account.getTotalPrice());

    for (int i = 0; i < 5; i++) {
      this.account.addRedPlate(1, true); // 500 + 100 * 5 = 1000
    }
    for (int i = 0; i < 8; i++) {
      this.account.addBluePlate(1, true); // 1000 + 300 * 8 = 3400
    }
    for (int i = 0; i < 10; i++) {
      this.account.addYellowPlate(1, true); // 3400 + 450 * 10 = 7900
    }
    assertEquals(7900, this.account.getTotalPrice());
  }

  /**
   * 何周目かによる割引を適応したテスト
   */
  @Test
  public void testComplexPlate() {
    this.account.addRedPlate(1, true); // 100
    for (int i = 0; i < 3; i++) {
      this.account.addBluePlate(1, true); // 100 + 300 * 3 = 1000
    }
    this.account.addYellowPlate(1, true); // 1000 + 450 = 1450
    for (int i = 0; i < 2; i++) {
      this.account.addRedPlate(2, true); // 1450 + 100 * 2 = 1650
    }
    this.account.addRedPlate(3, true); // 1650 + 100 = 1750
    for (int i = 0; i < 2; i++) {
      this.account.addBluePlate(4, true); // 1750 + 300 * 2 = 2350
    }
    for (int i = 0; i < 2; i++) {
      this.account.addYellowPlate(5, true); // 450 * 0.9 * 2 = 810 -> 3160
    }
    this.account.addBluePlate(9, true); // 300 * 0.9 = 270 -> 3430
    for (int i = 0; i < 2; i++) {
      this.account.addYellowPlate(10, true); // 450 * 0.8 * 2 = 720 -> 4150
    }
    this.account.addRedPlate(15, true); // 100 * 0.8 = 80 -> 4230

    assertEquals(4230, this.account.getTotalPrice());
  }

  /**
   * 銀皿・金皿・ドリンクに関するテスト
   */
  @Test
  public void testSilverGoldDrink() {
    this.account.addSilverPlate(2, true); // 550
    this.account.addSilverPlate(6, true); // 550 * 0.9 = 495 -> 1045

    this.account.addGoldPlate(10, true); // 700 * 0.8
    this.account.addGoldPlate(30, true); // 700 * 0.8 -> 2165
    this.account.addGoldPlate(5, true); // 700 * 0.9 -> 2795

    this.account.addRedPlate(10, false); // 100 -> 2895

    assertEquals(2895, this.account.getTotalPrice());
  }

}
