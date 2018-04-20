package com.daniel1147.gradleTutorial;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class Test1 {
  App app;

  @Before
  public void setUp() {
    app = new App();
  }

  @Test
  public void testClassName() {
    assertEquals("class name should be App", "App", app.className());
  }
}
