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

  /**
   * 赤皿に関するメソッド
   */
  @Test
  public void testRedPlate() {
    Account account = new Account();

    account.addRedPlate();
    assertEquals(100, account.getTotalPrice());
  }

}
