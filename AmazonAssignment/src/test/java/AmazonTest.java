import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest
{

    public void firstTest()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
    }
}
