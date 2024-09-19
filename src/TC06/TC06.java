package TC06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class TC06 extends BaseDriver{
    @Test
    public void Test1() {
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        WebElement login = driver.findElement(By.linkText("Log in"));
        login.click();
        MyFunc.Bekle(2);

        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("technostudyteam8@gmail.com");
        MyFunc.Bekle(2);

        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Ronaldo7");
        MyFunc.Bekle(2);

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginButton.click();
        MyFunc.Bekle(2);

        WebElement product = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input"));
        product.click();
        MyFunc.Bekle(3);

        WebElement cart = driver.findElement(By.cssSelector(".ico-cart > span:nth-child(1)"));
        new Actions(driver)
                .moveToElement(cart)
                .build()
                .perform();
        MyFunc.Bekle(3);

        WebElement goToCart = driver.findElement(By.xpath("//input[@value='Go to cart']"));
        goToCart.click();
        MyFunc.Bekle(3);

        WebElement verify = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[3]/a"));
        Assert.assertTrue("Failed",verify.getText().equals("14.1-inch Laptop"));
        MyFunc.Bekle(3);

        WebElement country = driver.findElement(By.id("CountryId"));
        Select selectCountry = new Select(country);
        selectCountry.selectByVisibleText("United States");
        MyFunc.Bekle(2);

        WebElement state = driver.findElement(By.id("StateProvinceId"));
        Select selectState = new Select(state);
        selectState.selectByVisibleText("New Jersey");
        MyFunc.Bekle(2);

        WebElement termsfConditions = driver.findElement(By.id("termsofservice"));
        termsfConditions.click();
        MyFunc.Bekle(2);

        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();
        MyFunc.Bekle(2);

        WebElement company = driver.findElement(By.id("BillingNewAddress_Company"));
        company.sendKeys("Real Madrid");
        MyFunc.Bekle(2);

        WebElement country2 = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select selectCountry2 = new Select(country2);
        selectCountry2.selectByVisibleText("United States");
        MyFunc.Bekle(1);

        WebElement state2 = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
        Select selecState2 = new Select(state2);
        selecState2.selectByVisibleText("New Jersey");
        MyFunc.Bekle(1);

        WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("Madrid");
        MyFunc.Bekle(2);

        WebElement address1 = driver.findElement(By.id("BillingNewAddress_Address1"));
        address1.sendKeys("Av. de Concha Espina, 1, ChamartÃƒÂ­n, 28036 Madrid");
        MyFunc.Bekle(2);

        WebElement address2 = driver.findElement(By.id("BillingNewAddress_Address2"));
        address2.sendKeys("Sir Matt Busby Way, Old Trafford, Stretford, Manchester M16 0RA, BirleÃ…Å¸ik KrallÃ„Â±k");
        MyFunc.Bekle(2);

        WebElement zip = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zip.sendKeys("28001");
        MyFunc.Bekle(2);

        WebElement phoneNumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNumber.sendKeys("1 (424) 367-2100");
        MyFunc.Bekle(2);

        WebElement faxNumber = driver.findElement(By.id("BillingNewAddress_FaxNumber"));
        faxNumber.sendKeys("+34 91 3984382");
        MyFunc.Bekle(2);

        WebElement cont = driver.findElement(By.xpath("//*[@id='billing-buttons-container']/input"));
        cont.click();
        MyFunc.Bekle(2);

        WebElement inStore = driver.findElement(By.id("PickUpInStore"));
        inStore.click();
        MyFunc.Bekle(2);


        WebElement cont1 = driver.findElement(By.xpath("//*[@id='shipping-buttons-container']/input"));
        cont1.click();
        MyFunc.Bekle(2);

        WebElement credit = driver.findElement(By.id("paymentmethod_2"));
        credit.click();
        MyFunc.Bekle(2);


        WebElement cont2 = driver.findElement(By.xpath("//*[@id='payment-method-buttons-container']/input"));
        cont2.click();
        MyFunc.Bekle(2);

        WebElement checkCredit = driver.findElement(By.xpath("//*[@id='checkout-payment-info-load']/div/div/div[1]/table/tbody/tr[1]/td[1]/label"));
        Assert.assertTrue("Failed",checkCredit.getText().contains("Select credit card"));
        MyFunc.Bekle(2);

        WebElement cardName = driver.findElement(By.id("CardholderName"));
        cardName.sendKeys("Ronaldo");
        MyFunc.Bekle(1);

        WebElement cardNumber = driver.findElement(By.id("CardNumber"));
        cardNumber.sendKeys("4242 4242 4242 4242");
        MyFunc.Bekle(1);

        WebElement year = driver.findElement(By.id("ExpireYear"));
        Select selectYear = new Select(year);
        selectYear.selectByVisibleText("2032");
        MyFunc.Bekle(1);

        WebElement cardCode = driver.findElement(By.id("CardCode"));
        cardCode.sendKeys("123");
        MyFunc.Bekle(1);


        WebElement cont3 = driver.findElement(By.xpath("//*[@id='payment-info-buttons-container']/input"));
        cont3.click();
        MyFunc.Bekle(2);

        WebElement checkPrice = driver.findElement(By.xpath("//*[@id='checkout-confirm-order-load']/div/div[2]/div/form/table/tbody/tr/td[3]/span[2]"));
        WebElement subtotal = driver.findElement(By.xpath("//*[@id='checkout-confirm-order-load']/div/div[2]/div/form/div[2]/div[2]/div/table/tbody/tr[1]/td[2]/span/span"));
        Assert.assertTrue("Failed",checkPrice.getText().equals(subtotal.getText()));
        MyFunc.Bekle(2);

        WebElement confirm = driver.findElement(By.xpath("//*[@id='confirm-order-buttons-container']/input"));
        confirm.click();
        MyFunc.Bekle(2);

        WebElement finalCheck = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong"));
        Assert.assertTrue(finalCheck.getText().equals("Your order has been successfully processed!"));








    }
}


}