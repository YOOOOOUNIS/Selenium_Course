package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class click {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.tatmeen.sa/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"__nuxt\"]/div/div/div[1]/div/ul[2]/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("finaltest@consultant.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test@1234");
        driver.findElement(By.xpath("//*[@id=\"__nuxt\"]/div/div/div[2]/div/div/div/form/button")).click();
    }
}
