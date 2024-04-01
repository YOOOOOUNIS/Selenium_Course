package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("file:///Users/baianat/IdeaProjects/QaCart_SeleniumCourse/src/test/resources/index.html");

//        driver.manage().window().fullscreen();
//        driver.manage().window().maximize();
        Dimension iphoneXR = new Dimension(414, 896);
        Dimension IpadAir = new Dimension(820, 1180);
        driver.manage().window().setSize(IpadAir);

    }
}
