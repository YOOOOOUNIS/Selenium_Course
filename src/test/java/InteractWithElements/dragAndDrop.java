package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        Actions actions = new Actions(driver);

        WebElement source = driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
        WebElement destination = driver.findElement(By.xpath("//*[@id=\"column-a\"]"));

        actions.dragAndDrop(source,destination);
    }
}
