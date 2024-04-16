package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class TopNav extends ParentPage{
    public TopNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
}
