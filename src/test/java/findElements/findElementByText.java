package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementByText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/baianat/IdeaProjects/QaCart_SeleniumCourse/src/test/resources/index.html");
        driver.manage().window().maximize();
        String elementText = driver.findElement(By.name("description")).getText();
        System.out.println(elementText);
        driver.quit();
    }
}
