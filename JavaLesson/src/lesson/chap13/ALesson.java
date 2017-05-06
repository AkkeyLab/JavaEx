package lesson.chap13;

import java.awt.Image;


/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public interface ALesson {

  /**
   * @param iconType
   * @return image
   */
  Image getIcon(int iconType);

  /** */
  int ICON_16x16 = 1;
  /** */
  int ICON_32x32 = 2;
}
