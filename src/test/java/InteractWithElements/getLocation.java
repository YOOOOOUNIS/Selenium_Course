package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Point Location = driver.findElement(By.xpath("//*[@id=\"column-a\"]")).getLocation();
        System.out.println(Location);
        driver.quit();
    }
}

/*
to display location on browser open "inspect" > "settings" > "preferences" > enable "show roles on hover"
 */
