/*
 * Created on May 7, 2017
 * Copyright (C) 2017 Koga Laboratory. All rights reserved.
 *
 */
package lesson.chap07;

import java.util.MissingResourceException;
import java.util.ResourceBundle;


/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class Messages {

  private static final String BUNDLE_NAME = "lesson.chap07.messages"; //$NON-NLS-1$

  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

  private Messages() {}

  /**
   * @param key 文字列識別子
   * @return 文字列
   */
  public static String getString(String key) {
    try {
      return RESOURCE_BUNDLE.getString(key);
    } catch (MissingResourceException e) {
      System.out.println(e);
      return '!' + key + '!';
    }
  }
}
