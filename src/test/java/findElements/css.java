package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/baianat/IdeaProjects/QaCart_SeleniumCourse/src/test/resources/index.html");
        driver.manage().window().maximize();
        String elementText = driver.findElement(By.cssSelector("#welcome")).getText();
//        String elementText = driver.findElement(By.cssSelector(".list1")).getText();
        System.out.println(elementText);



        // tag name [@attribute = 'value']
        // #Id
        // .class name




    }
}
