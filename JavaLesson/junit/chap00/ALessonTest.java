/*
 * Created on May 7, 2017
 * Copyright (C) 2017 Koga Laboratory. All rights reserved.
 *
 */
package chap00;

import static org.junit.Assert.*;

import org.junit.Test;

import lesson.chap00.Messages;


/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class ALessonTest {

  /**
   * Test method for {@link lesson.chap00.ALesson#main(java.lang.String[])}.
   */
  @Test
  public void testMain() {
    assertEquals("failed test", "Hello world", Messages.getString("ALesson.0"));   //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
  }

}
