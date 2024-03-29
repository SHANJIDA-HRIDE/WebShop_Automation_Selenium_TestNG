package PageObjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import frameworks.BaseForm;
import org.openqa.selenium.By;

public class UserDashboardPage extends BaseForm {
    public UserDashboardPage(){
        super(By.linkText("Wishlist"), "User HomePage page is not open");
    }
    private final ILink clickBookLink = getElementFactory().getLink(By.linkText("Books"),"clickBookLink");
    private final ILink clickLogoutLink = getElementFactory().getLink(By.linkText("Log out"),"ClickLogoutLink");
    public void ClickBookLink(){
        clickBookLink.click();
    }
    public void setClickLogoutLink(){
        clickLogoutLink.click();
    }
}
