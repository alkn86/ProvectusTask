import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by akonovalenko on 2/21/2017.
 */

public class TestCases {


    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver", Config.driverPath);
        Configuration.browser = Config.browser;
    }

    @Test
    public void checkChapter1Text(){
        open(Config.baseURL);
        HomePage homepage = page(HomePage.class);
        Chapter1 chapter1page = homepage.clickChapter1Link();
        chapter1page.verifyTextLabel(Config.LabelText);
        chapter1page.navigateToHomePage();
    }
}
