package TC01;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class TC01 extends BaseDriver {
    @Test
    public void PositiveUserRegister(){
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement register = driver.findElement(By.xpath("//a[.='Register']"));
        register.click();

        WebElement femaleRadioButton = driver.findElement(By.cssSelector("#gender-female"));
        femaleRadioButton.click();

//        WebElement maleRadioButton = driver.findElement(By.cssSelector("#gender-male"));
//        maleRadioButton.click();

        WebElement firstNameBox = driver.findElement(By.cssSelector("#FirstName"));
        firstNameBox.sendKeys("Team");

        WebElement lastNameBox = driver.findElement(By.cssSelector("#LastName"));
        lastNameBox.sendKeys("Proje");

        WebElement emailBox = driver.findElement(By.cssSelector("#Email"));
        emailBox.sendKeys("technostudyteam8@gmail.com");

        WebElement passwordBox = driver.findElement(By.cssSelector("#Password"));
        passwordBox.sendKeys("Ronaldo7");

        WebElement passwordConfirmBox = driver.findElement(By.cssSelector("#ConfirmPassword"));
        passwordConfirmBox.sendKeys("Ronaldo7");

        WebElement registerButton = driver.findElement(By.cssSelector("#register-button"));
        registerButton.click();

        WebElement registrationConfirm = driver.findElement(By.xpath("//div[contains(text(),'registration completed')]"));
        String actualConfirmText = registrationConfirm.getText().trim();
        String expectedConfirmText = "Your registration completed";
        Assert.assertEquals(actualConfirmText,expectedConfirmText);

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        BekleKapat();
    }


}
