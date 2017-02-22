/**
 * Created by akonovalenko on 2/21/2017.
 */

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

 @FindBy(how = How.LINK_TEXT,linkText = "Chapter1")
 private SelenideElement chapter1Link;

public Chapter1 clickChapter1Link(){
    chapter1Link.click();
    return page(Chapter1.class);
}

}

