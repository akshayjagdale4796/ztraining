package amazon.assgt.test;

import amazon.assgt.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestApp

{
    Properties Sitedata = new Properties();
    FileInputStream fi = new FileInputStream("C:\\Users\\akshay jagdale\\IdeaProjects\\PageObject\\src\\configuration\\config.properties");

    public TestApp() throws FileNotFoundException
    {
    }

    @Test
    public void firstTest() throws IOException {

        this.Sitedata.load(this.fi);
        String browserKey = this.Sitedata.getProperty("browser");
        System.out.println("browser key " + browserKey);
        System.setProperty("webdriver."+browserKey+".driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(this.Sitedata.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));

        TodaysDeal1 todaysDeal1 =new TodaysDeal1(driver);
        todaysDeal1.todayDeal().click();
        todaysDeal1.thirdDeal().click();

        AddMinQuantityItem2 quantiy=new AddMinQuantityItem2(driver);
        quantiy.searchBox().sendKeys("maggi");
        quantiy.search().click();
        quantiy.item().click();
        quantiy.ScrollDownPage();
        quantiy.addToCart().click();
        System.out.println(quantiy.verifyAdded().getText().equalsIgnoreCase("Added to cart"));

        SearchMobilesInSearchBox3 mobiles=new SearchMobilesInSearchBox3(driver);
        mobiles.searchBox().sendKeys("mobiles");
        mobiles.search().click();
        mobiles.ScrollDownPage();
        mobiles.getLastDisplayedItem().click();

        MobilesFromNavigation4 leftNa=new MobilesFromNavigation4(driver);
        leftNa.selectMobiles().click();
        leftNa.clickOnHomeButton().click();

        SignInPage5 signIn=new SignInPage5(driver);
        signIn.clickOnSignIn().click();
        signIn.enterLogInId().sendKeys("7709096079");
        signIn.clickOnContinue().click();
        signIn.enterPassword().sendKeys("akshay4796");
        signIn.clickOnSubmit().click();

        PaymentOptionPage6 payOptions=new PaymentOptionPage6(driver);
        payOptions.clickOnAccount().click();
        payOptions.clickOnPaymentOption().click();
        System.out.println(payOptions.textVerifying().getText().equalsIgnoreCase("Your Payment options"));

        AddressPage7 address=new AddressPage7(driver);
        address.clickOnAccount().click();
        address.clickOnAddress().click();
        address.clickOnAddAddress().click();
        address.enterFullName().sendKeys("Akshay J");
        address.enterMobileNumber().sendKeys("7709096079");
        address.enterPinCode().sendKeys("411036");
        address.enterFlatHouseNo().sendKeys("10,TulsiVilla");
        address.enterAreaName().sendKeys("Lonkar, Colony, Mundhwa");
        address.enterLandmark().sendKeys("Opposite To Police Station");
      //  address.enterCity().sendKeys("Pune");
     //   address.selectStateDropDown().click();
       // address.ScrollDownPage();
        //address.clickONMaharashtra().click();
        address.clickONAddressType().click();
        address.clickOnHomeType().click();
        
        address.ScrollDownPage();
        address.clickOnAddAddressButton().click();
        address.clickOnSaveAddAddressButton().click();
        System.out.println(address.verifyAddress().getText());
    }
}
