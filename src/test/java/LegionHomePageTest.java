import io.qameta.allure.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.selenium.pages.HomePage;
import utilities.BaseTest;

public class LegionHomePageTest extends BaseTest {

@Epic("Legion Home Page")
@Feature("Home Page Navigation")
@Story("Verify that user can navigate to the home page")
@Severity(SeverityLevel.BLOCKER)
@Tag("sanity")
@Owner("Marina")
@Test
        public void legionURLTest(){
    page.getPage(HomePage.class)
            .givenIAmaHomePage()
            .verifyHomePageIsLoaded();
        }

    @Epic("Legion Home Page")
    @Feature("Home Page Navigation")
    @Story("Verify that user can navigate to the courses page")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("sanity")
    @Owner("Marina")
    @Test
    public void legionCoursesPageTest(){
    page.getPage(HomePage.class)
            .verifyHomePageIsLoaded()
            .verifyHomePageIsLoaded();
    }
    }

