package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findMultipleElements {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file:///Users/baianat/IdeaProjects/QaCart_SeleniumCourse/src/test/resources/index.html");
        driver.manage().window().maximize();
        String elementText = driver.findElements(By.cssSelector(".course-list li")).get(7).getText();
        System.out.println(elementText);
        driver.quit();
    }
}
