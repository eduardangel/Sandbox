package addressbook.tests;

import addressbook.appmanager.ApplicationManger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.Browser;

public class TestBase {

  protected final ApplicationManger app = new ApplicationManger(Browser.FIREFOX);

  @Before
  public void setUp() {
    app.init();
  }

  @After
  public void tearDown() {
    app.stop();
  }

}
