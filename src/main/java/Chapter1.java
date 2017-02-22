/**
 * Created by akonovalenko on 2/21/2017.
 */

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.*;

public class Chapter1 {
    @FindBy(how = How.LINK_TEXT,linkText = "Home Page")
   private SelenideElement homePageLink;

    @FindBy(how = How.ID, id = "divontheleft")
   private SelenideElement textOnPageLabel;

    public HomePage navigateToHomePage(){
        textOnPageLabel.click();
        return page(HomePage.class);
    }

    public void verifyTextLabel(String expectedText){
        Assert.assertEquals(textOnPageLabel.text(),expectedText);
    }
}

