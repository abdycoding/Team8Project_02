package TC04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC04 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(1);

        WebElement loginElement = driver.findElement(By.xpath("//a[@href='/login']"));
        loginElement.click();
        MyFunc.Bekle(1);

        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("technostudyteam8@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Ronaldo7");

        WebElement submit = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        submit.click();
        MyFunc.Bekle(1);

        BekleKapat();
    }
}

