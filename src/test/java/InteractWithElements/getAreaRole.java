package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAreaRole {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        String role = driver.findElement(By.xpath("//*[@id=\"column-a\"]")).getAriaRole();
        System.out.println(role);
        driver.quit();
    }
}
