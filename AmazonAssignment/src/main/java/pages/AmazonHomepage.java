package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonHomepage
{
    By todaysDeal= By.xpath("//a[@class='nav-a  '][3]");
    By thirdDeal= By.xpath("//div[@class='DealGridItem-module__dealItem_2X_WLYkJ3-dM0LtXI9THcu DealGridItem-module__withBorders_2jNNLI6U1oDls7Ten3Dttl DealGridItem-module__withoutActionButton_2OI8DAanWNRCagYDL2iIqN'][3]");
    By searchbox=By.id("//input[@id='twotabsearchtextbox']");
    By search=By.id("nav-search-submit-button");
}
