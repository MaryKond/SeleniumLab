import io.qameta.allure.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.selenium.pages.BasePage;
import org.selenium.pages.HomePage;
import utilities.BaseTest;

public class LegionCoursesTest extends BaseTest {
    @Epic("Courses")
    @Feature("Courses Page-Search")
    @Story("Verify that user can successfuly search for a course")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Regression")
    @Owner("Marina")
    @ParameterizedTest
    @ValueSource(strings ={"QA", "Java","Python"})
    public void LegionSearchCourseTest(String input){
        page.getPage(HomePage.class)
                .givenIAmaHomePage()
                .whenIClickCourseTab()
                .iSearchForTheCourse(input)
                .verifyCourseFound();
    }

}
