
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class SearchTest {

    @Test
    public void testYandexSearch() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://yandex.by");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        WebElement closePopUp =  driver.findElement(By.xpath("/html/body/div[18]/button"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        closePopUp.click();
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"text\"]"));
        searchField.click();
        searchField.sendKeys("RedRover School");
        WebElement findButton = driver.findElement(By.xpath("/html/body/main/div[2]/form/div[3]/button"));
        findButton.click();
        WebElement schoolLink = driver.findElement(By.linkText("RedRover | Бесплатная IT-школа"));
        String value = schoolLink.getText();
        Assert.assertEquals("RedRover | Бесплатная IT-школа", value);
    }
}
