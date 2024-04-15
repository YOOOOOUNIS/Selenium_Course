package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class getAttribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        String name = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getAttribute("name");
        System.out.println(name);
        driver.quit();
    }
}
