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
  }

}
