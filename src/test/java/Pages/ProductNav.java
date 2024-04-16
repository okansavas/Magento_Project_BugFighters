package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class ProductNav extends ParentPage{
    public ProductNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
}
