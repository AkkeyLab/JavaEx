import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/*
 * Created on May 8, 2017
 * Copyright (C) 2017 Koga Laboratory. All rights reserved.
 *
 */

/**
 * @author akkey
 * @version $Revision$, May 8, 2017
 */
@RunWith(Suite.class)
@SuiteClasses({AccountTest.class, PlateTest.class})
public class AllTests {

  /**
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    JUnitCore.main(AllTests.class.getName());
  }
}
