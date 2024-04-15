package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        String CssValue = driver.findElement(By.xpath("//*[@id=\"column-a\"]")).getCssValue("background-color");
        System.out.println(CssValue);
        driver.quit();
    }
}
