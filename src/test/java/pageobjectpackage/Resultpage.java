package pageobjectpackage;

import commonpackage.Driverfactory;
import org.openqa.selenium.By;

public class Resultpage extends Driverfactory {
    public void year5(){
        driver.findElement(By.xpath("//*[@id=\"page_downloads_table\"]/tbody/tr[4]/td[1]")).click();
    }
}
