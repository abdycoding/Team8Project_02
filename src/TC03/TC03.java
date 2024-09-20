package TC03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC03 extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);

        WebElement login = driver.findElement(By.xpath("//*[@class='ico-login']"));
        login.click();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("technostudyteam8@gmail.com");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Ronaldo7");
        MyFunc.Bekle(2);

        WebElement login2 = driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
        login2.click();
        MyFunc.Bekle(2);

        WebElement userIsTrue = driver.findElement(By.xpath("//div[@class='header-links']/ul[1]/li[1]/a"));
        Assert.assertTrue("Kullanıcı oturumu başarılı şekilde açıldı", userIsTrue.isDisplayed());

        WebElement logout = driver.findElement(By.xpath("//*[@class='ico-logout']"));
        logout.click();

        WebElement logoutSuccesfuly = driver.findElement(By.xpath("//*[@class='ico-login']"));
        Assert.assertTrue("Kullanıcı oturumundan güvenli şekilde çıkış yapıldı", logoutSuccesfuly.isDisplayed());
        BekleKapat();
    }
}
