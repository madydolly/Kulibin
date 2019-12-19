import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Navigation {
    private WebDriver driver;


    public Navigation(WebDriver driver) {this.driver =driver;}
    private By menuLinkShurupoverty = By.xpath("//a[@href='/catalog/shurupoverty/']");
    private By menuLinkDreli = By.xpath("//a[@href='/catalog/dreli/']");
    private  By menuLinkBolgarki = By.xpath("//a[@href='/catalog/bolgarki/']");
    private  By menuLinkPerforatoty = By.xpath("//a[@href='/catalog/perforatory/']");
    private By nextPageButton = By.xpath("//div[@class='paging']//a[@class='next btn-blue']");
    public  By cardPrice = By.xpath("//div[@class='stick-list']//span//ancestor::li//span[@class='price']");



    public Navigation openSubMenu(String nameSubMenu)

    {
        By MainMenu = By.xpath("//div[@class='drop']//a[contains(.,'"+ nameSubMenu +"')]");
        Actions actions =new Actions(driver);

        actions.moveToElement(driver.findElement(MainMenu)).build().perform();

        return new Navigation(driver);
    }

    public Navigation openLinkShurupoverty ()
    {
        driver.findElement(menuLinkShurupoverty).click();
        return new Navigation(driver);

    }
    public Navigation openLinkPerforatory ()
    {
        driver.findElement(menuLinkPerforatoty).click();
        return new Navigation(driver);

    }
    public Navigation openLinkBolgarki ()
    {
        driver.findElement(menuLinkBolgarki).click();
        return new Navigation(driver);

    }
    public Navigation openLinkDreli ()
    {
        driver.findElement(menuLinkDreli).click();
        return new Navigation(driver);

    }

    public Navigation nextPageClick()
    {
        driver.findElement(nextPageButton).click();
        return new Navigation(driver);
    }
    public Navigation clickRandomCard()
    {
        int x = (int) (Math.random() * 15 + 1);
        driver.findElement(By.xpath("//ul[@class='catalog catalog-full js-catalog']/li["+ x +"]//h4/a")).click();
        return new Navigation(driver);
    }


}
