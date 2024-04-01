package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximaizeAndFullScreen {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("file:///Users/baianat/IdeaProjects/QaCart_SeleniumCourse/src/test/resources/index.html");

//        driver.manage().window().fullscreen();
//        driver.manage().window().maximize();
    }
}
