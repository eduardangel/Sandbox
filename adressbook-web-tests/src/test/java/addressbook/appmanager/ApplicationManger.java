package addressbook.appmanager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManger {
  private final Browser browser;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  public WebDriver driver;
  JavascriptExecutor js;
  private Map<String, Object> vars;

  public ApplicationManger(Browser browser) {
    this.browser = browser;
  }

  public void init() {
    if (browser == Browser.FIREFOX) {
      driver = new FirefoxDriver();
    } else if (browser == Browser.CHROME) {
      driver = new ChromeDriver();
    } else if (browser == Browser.EDGE) {
      driver = new EdgeDriver();
    }
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.get("http://localhost:84/addressbook/group.php");
    groupHelper = new GroupHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);
    sessionHelper.login("admin", "secret");
  }


  public void stop() {
    driver.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
