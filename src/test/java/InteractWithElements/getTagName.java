package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        String TagName = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getTagName();
        System.out.println(TagName);
        driver.quit();
    }
}
