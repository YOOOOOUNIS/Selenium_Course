package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementClass {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/baianat/IdeaProjects/QaCart_SeleniumCourse/src/test/resources/index.html");

        // u can here define web element & use it many times
        // use WebElement at first after get the path and before find element finction
        WebElement welcomeHeader = driver.findElement(By.xpath("/html/body/ul[1]/li[1]"));
        driver.manage().window().maximize();
        String elementText = welcomeHeader.getText();
        System.out.println(elementText);
        driver.quit();
    }
}
