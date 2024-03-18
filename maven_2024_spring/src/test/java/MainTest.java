import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Main.getSum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.assertEquals;

public class MainTest {
        @Test
        public void testGetSum(){
                        Assert.assertEquals(getSum(0, 0), 0);
                Assert.assertEquals(getSum(5, 5), 10);
                Assert.assertEquals(getSum(-1, -3), -4);
                Assert.assertEquals(getSum(-1, 3), 2);
                Assert.assertEquals(getSum(100, 100), 200);
    }
    @Test
    public void testTest(){
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.selenium.dev/selenium/web/web-form.html");

                String title = driver.getTitle();
                assertEquals("Web form", title);

                driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

                WebElement textBox = driver.findElement(By.name("my-text"));
                WebElement submitButton = driver.findElement(By.cssSelector("button"));

                textBox.sendKeys("Selenium");
                submitButton.click();

                WebElement message = driver.findElement(By.id("message"));
                String value = message.getText();
                assertEquals("Received!", value);

                driver.quit();
            }

        }


