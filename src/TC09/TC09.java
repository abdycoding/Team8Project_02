package TC09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC09 extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//a[@href='/login']"));
        login.click();
        MyFunc.Bekle(2);
        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("technostudyteam8@gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Ronaldo7");

        WebElement login2 = driver.findElement(By.xpath("//input[@value='Log in']"));
        login2.click();
        MyFunc.Bekle(2);

        WebElement account= driver.findElement(By.xpath("//a[@href='/customer/info']"));
        account.click();
        MyFunc.Bekle(2);

        WebElement orders= driver.findElement(By.xpath("//a[@href='/customer/orders']"));
        orders.click();
        MyFunc.Bekle(2);

        WebElement details= driver.findElement(By.xpath("//input[@class='button-2 order-details-button']"));
        details.click();
        MyFunc.Bekle(2);

        WebElement download= driver.findElement(By.xpath("//a[@href='/orderdetails/pdf/1792551']"));
        download.click();




        BekleKapat();
    }}