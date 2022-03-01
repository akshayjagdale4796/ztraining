package amaazon.assignment;

import io.opentelemetry.sdk.metrics.data.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Amazon
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        JavascriptExecutor  js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1200)");
        //js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        //click on todays deal
         driver.findElement(By.xpath("//a[@class='a-link-normal as-title-block-right see-more truncate-1line']")).click();

         //It select 3rd deal
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//div[@class='DealGridItem-module__dealItem_2X_WLYkJ3-dM0LtXI9THcu DealGridItem-module__withBorders_2jNNLI6U1oDls7Ten3Dttl DealGridItem-module__withoutActionButton_2OI8DAanWNRCagYDL2iIqN'][3]")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("maggi");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]")).click();
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("add-to-cart-button")).click();

        System.out.println(driver.findElement(By.id("nav-cart-count")).getText());
        Assert.assertEquals(driver.findElement(By.id("nav-cart-count")).getText(),1);
        System.out.println("fine");


    }

}
