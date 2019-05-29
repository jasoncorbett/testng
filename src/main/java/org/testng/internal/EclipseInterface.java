package org.testng.internal;

/**
 * Symbols in this class are used by the Eclipse plug-in, do not modify them without updating the
 * plug-in as well.
 *
 * @author Cedric Beust <cedric@beust.com>
 * @since Aug 25, 2012
 */
public class EclipseInterface {
  public static final Character OPENING_CHARACTER = '[';
  public static final Character CLOSING_CHARACTER = ']';
  public static final String ASSERT_SPACER = "\r\n-----------------------------------------------------\r\n";

  public static final String ASSERT_LEFT = "\r\n\tExpected: " + OPENING_CHARACTER;
  public static final String ASSERT_LEFT2 = "Expected not same " + OPENING_CHARACTER;
  public static final String ASSERT_MIDDLE = CLOSING_CHARACTER + " \r\n\tActual: " + OPENING_CHARACTER;
  public static final String ASSERT_MIDDLE_INEQUALITY = CLOSING_CHARACTER + " but found it. " + ASSERT_SPACER;

  public static final String ASSERT_RIGHT = CLOSING_CHARACTER + ASSERT_SPACER;
  public static final String ASSERT_LEFT_INEQUALITY = "\r\n\tDid not expect to find: " + OPENING_CHARACTER;
}
