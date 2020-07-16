package pageobjectpackage;

import commonpackage.Driverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Homepage extends Driverfactory {
    public void baseurl(){
        driver.getCurrentUrl();
    }
    public void yeargroup(){
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul/li[3]/a"))).build().perform();
        act.moveToElement(driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul/li[3]/ul/div[2]/li[3]/a/span"))).click().build().perform();
    }
}
