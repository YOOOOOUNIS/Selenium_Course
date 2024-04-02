package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/baianat/IdeaProjects/QaCart_SeleniumCourse/src/test/resources/index.html");
        driver.manage().window().maximize();
        String className = driver.findElement(By.tagName("li")).getText();
        System.out.println(className);
        driver.quit();
    }
}
