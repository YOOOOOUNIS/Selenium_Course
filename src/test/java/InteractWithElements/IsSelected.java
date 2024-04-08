package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
check if radio button or check box is selected or not
 */

public class IsSelected {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
        boolean check = driver.findElement(By.xpath("//*[@id=\"__nuxt\"]/div/div/div[1]/div/ul[2]/li[2]/a")).isSelected();
        System.out.println(check);
        driver.quit();
    }
}
