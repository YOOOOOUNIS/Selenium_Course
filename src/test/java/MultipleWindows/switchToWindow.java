package MultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class switchToWindow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");


        String parent = driver.getWindowHandle();
//        System.out.println(parent);
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a")).click();

        Set<String> allwindows = driver.getWindowHandles();
//        System.out.println(allwindows);

        for (String  window : allwindows){
            if (!window.equalsIgnoreCase(parent)){
                System.out.println(driver.getPageSource());
                driver.switchTo().window(window);
                System.out.println(driver.getPageSource());
            }
        }

        driver.quit();
    }
}
