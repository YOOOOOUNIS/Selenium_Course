package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class doubleClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Actions action = new Actions(driver);
        WebElement doubleClick = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        action.doubleClick(doubleClick).perform();
//        driver.quit();
    }
}
