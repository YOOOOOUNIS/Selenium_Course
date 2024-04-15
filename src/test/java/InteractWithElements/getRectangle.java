package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectangle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Rectangle name = driver.findElement(By.xpath("//*[@id=\"column-a\"]")).getRect();
        System.out.println(name.x);
//        System.out.println(name.y);
//        System.out.println(name.height);
//        System.out.println(name.width);
        driver.quit();
    }
}

/*
by using this class, u can know all the dimensions instead of get size or location
 */
