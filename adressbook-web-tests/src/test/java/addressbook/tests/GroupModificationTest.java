package addressbook.tests;

import addressbook.model.GroupData;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GroupModificationTest extends TestBase{

  @Test
  public void groupModification(){
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    if(! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assertions.assertEquals(after, before);
  }
}
