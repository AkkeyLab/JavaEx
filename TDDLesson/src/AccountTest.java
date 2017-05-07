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
    this.account.addRedPlate();
    assertEquals(100, this.account.getTotalPrice());
  }

  /**
   * 青皿に関するメソッド
   */
  @Test
  public void testBluePlate() {
    this.account.addBluePlate();
    assertEquals(300, this.account.getTotalPrice());
  }

  /**
   * 黃皿に関するメソッド
   */
  @Test
  public void testYellow() {
    this.account.addYellowPlate();
    assertEquals(450, this.account.getTotalPrice());
  }

  /**
   * 全皿種類に関するメソッド
   */
  @Test
  public void testMultiplePlate() {
    this.account.addBluePlate(); // 300
    this.account.addRedPlate(); // 300 + 100 = 400
    this.account.addRedPlate(); // 400 + 100 = 500
    assertEquals(500, this.account.getTotalPrice());

    for (int i = 0; i < 5; i++) {
      this.account.addRedPlate(); // 500 + 100 * 5 = 1000
    }
    for (int i = 0; i < 8; i++) {
      this.account.addBluePlate(); // 1000 + 300 * 8 = 3400
    }
    for (int i = 0; i < 10; i++) {
      this.account.addYellowPlate(); // 3400 + 450 * 10 = 7900
    }
    assertEquals(7900, this.account.getTotalPrice());
  }

}
