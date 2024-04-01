package visitingWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openHTMLfile {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("file:///Users/baianat/IdeaProjects/QaCart_SeleniumCourse/src/test/resources/index.html");
    }
}
