package TC08;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC08 extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://demowebshop.tricentis.com/");

        WebElement computers= driver.findElement(By.xpath("//*[@class='top-menu']//*[@href='/computers']"));
        computers.click();

        WebElement notebooks= driver.findElement(By.xpath("//*[@alt='Picture for category Notebooks']"));
        wait.until(ExpectedConditions.elementToBeClickable(notebooks));
        notebooks.click();

        WebElement addtocard = driver.findElement(By.xpath("//*[@value='Add to cart']"));
        addtocard.click();

        WebElement shoppingcart = driver.findElement(By.xpath("//*[@class='ico-cart']//*[@class='cart-label']"));
        shoppingcart.click();

        WebElement applycoupon = driver.findElement(By.xpath("//*[@value='Apply coupon']"));
        applycoupon.click();

        WebElement message1 = driver.findElement(By.xpath("//*[@class='message']"));
        message1.getText();

        Assert.assertTrue("Bir hata oluştu", message1.isDisplayed());

        WebElement addgiftcard = driver.findElement(By.xpath("//*[@value='Add gift card']"));
        addgiftcard.click();

        WebElement message2 = driver.findElement(By.xpath("//*[@class='message']"));
        message2.getText();

        Assert.assertTrue("Bir hata oluştu", message2.isDisplayed());

        WebElement agreeterms = driver.findElement(By.xpath("//*[@class='totals']//*[@id='termsofservice']"));
        agreeterms.click();

        WebElement checkout = driver.findElement(By.xpath("//*[@id='checkout']"));
        checkout.click();


        BekleKapat();


    }

}
