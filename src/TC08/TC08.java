package TC08;

import Utility.BaseDriver;
import Utility.MyFunc;
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
        MyFunc.Bekle(2);

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

        WebElement guest = driver.findElement(By.xpath("//*[@value='Checkout as Guest']"));
        guest.click();

        WebElement firstname = driver.findElement(By.id("BillingNewAddress_FirstName"));
        firstname.sendKeys("Team");

        WebElement lastname = driver.findElement(By.id("BillingNewAddress_LastName"));
        lastname.sendKeys("TeamEight");

        WebElement email = driver.findElement(By.id("BillingNewAddress_Email"));
        email.sendKeys("teameight@gmail.com");

        WebElement country = driver.findElement(By.xpath("//div[@class='inputs']//*[@id='BillingNewAddress_CountryId']"));
        country.click();

        WebElement Turkey= driver.findElement(By.xpath("//*[@value='77']"));
        Turkey.click();

        WebElement city= driver.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("Istanbul");

        WebElement region = driver.findElement(By.id("BillingNewAddress_Address1"));
        region.sendKeys("Yesilköy");

        WebElement zipcode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zipcode.sendKeys("34149");

        WebElement phone = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phone.sendKeys("05324115879");

        WebElement Continue=driver.findElement(By.xpath("//div[@id='billing-buttons-container']//*[@value='Continue']"));
        Continue.click();

        WebElement Continue1= driver.findElement(By.xpath("//*[@onclick='Shipping.save()']"));
        Continue1.click();

        WebElement Continue2 = driver.findElement(By.xpath("//*[@onclick='ShippingMethod.save()']"));
        Continue2.click();

        WebElement paymentmethod = driver.findElement(By.xpath("//*[@value='Payments.PurchaseOrder']"));
        paymentmethod.click();

        WebElement Continue3 = driver.findElement(By.xpath("//*[@onclick='PaymentMethod.save()']"));
        Continue3.click();

        WebElement ponumber= driver.findElement(By.id("PurchaseOrderNumber"));
        ponumber.sendKeys("FB1907");

        WebElement Continue4 = driver.findElement(By.xpath("//*[@onclick='PaymentInfo.save()']"));
        Continue4.click();

        WebElement Continue5 = driver.findElement(By.xpath("//*[@onclick='ConfirmOrder.save()']"));
        Continue5.click();

        WebElement message= driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));
        message.getText();

        Assert.assertTrue("Eksik Bilgi görünmektedir.", message.isDisplayed());

        BekleKapat();

    }

}
