package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownMenu {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();

//        WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
//        Select coursesDropDown  = new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]")));
//        coursesDropDown.selectByIndex(0);

//        or

        Select coursesDropDown  = new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]")));
//        coursesDropDown.selectByIndex(1);

//        or

        coursesDropDown.selectByVisibleText("Option 1");

        driver.quit();

    }
}
