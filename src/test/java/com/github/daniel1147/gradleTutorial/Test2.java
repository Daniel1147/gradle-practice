package com.github.daniel1147.gradleTutorial;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class Test2 {
  App app;

  @Before
  public void setUp() {
    app = new App();
  }

  @Test
  public void testZero() {
    assertEquals("zero should return 0", 0, app.zero());
  }
}
