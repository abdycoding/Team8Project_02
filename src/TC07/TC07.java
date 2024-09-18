package TC07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;

public class TC07 extends BaseDriver {
        @Test
        public void Test(){
            driver.get("https://demowebshop.tricentis.com/");

            WebElement login= driver.findElement(By.xpath("//*[@class='ico-login']"));
            login.click();
            MyFunc.Bekle(2);

            WebElement email= driver.findElement(By.xpath("//*[@class='email']"));
            email.sendKeys("technostudyteam8@gmail.com");
            MyFunc.Bekle(2);

            WebElement password= driver.findElement(By.xpath("//*[@class='password']"));
            password.sendKeys("Ronaldo7");
            MyFunc.Bekle(2);

            WebElement loginclk= driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
            loginclk.click();
            MyFunc.Bekle(2);

            WebElement anket=driver.findElement(By.xpath("//*[@id='pollanswers-1']"));
            anket.click();
            MyFunc.Bekle(2);

            WebElement vote=driver.findElement(By.xpath("//*[@class='button-2 vote-poll-button']"));
            vote.click();
            MyFunc.Bekle(2);
            BekleKapat();
        }

    }
