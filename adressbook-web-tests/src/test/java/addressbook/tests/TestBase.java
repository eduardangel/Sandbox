package addressbook.tests;

import addressbook.appmanager.ApplicationManger;
import org.junit.After;
import org.junit.Before;

public class TestBase {

  protected final ApplicationManger app = new ApplicationManger();

  @Before
  public void setUp() {
    app.init();
  }

  @After
  public void tearDown() {
    app.stop();
  }

}
