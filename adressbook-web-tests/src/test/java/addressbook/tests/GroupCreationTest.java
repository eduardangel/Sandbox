package addressbook.tests;// Generated by Selenium IDE

import addressbook.model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTest extends TestBase {

  @Test
  public void groupCreation() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}