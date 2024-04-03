package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/baianat/IdeaProjects/QaCart_SeleniumCourse/src/test/resources/index.html");
        driver.manage().window().maximize();
        String elementText = driver.findElement(By.xpath("/html/body/ul[2]/li[2]")).getText();
//        String elementText = driver.findElement(By.xpath("//ul[@class='country-list'/li[2]")).getText();
        System.out.println(elementText);
        driver.quit();



        // Xpath
        /*
        tagName[@attribute = 'value']
        or
        *[@attribute = 'value'] means any tag name with this attribute
         */
    }
}
