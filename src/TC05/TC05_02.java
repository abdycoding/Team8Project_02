package TC05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC05_02 extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//a[@href='/login']"));
        login.click();
        MyFunc.Bekle(2);
        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("technostudyteam8@gmail.com");
        //we should leave the password placeholder empty in this code
//        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
//        password.sendKeys("Ronaldo7");

        WebElement login2 = driver.findElement(By.xpath("//input[@value='Log in']"));
        login2.click();
        MyFunc.Bekle(2);
        WebElement message = driver.findElement(By.cssSelector(".validation-summary-errors > span:nth-child(1)"));

        Assert.assertTrue("Error", message.getText().contains("unsuccessful"));

        BekleKapat();
    }
}
