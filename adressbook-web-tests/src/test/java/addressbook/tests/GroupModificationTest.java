package addressbook.tests;

import addressbook.model.GroupData;
import org.junit.Test;

public class GroupModificationTest extends TestBase{

  @Test
  public void groupModification(){
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
