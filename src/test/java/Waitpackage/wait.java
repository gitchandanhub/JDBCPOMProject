package Waitpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseDriver.AppDriver;

public class wait extends AppDriver
{
       public static int sleep = 5000;
       public static int Implicitwait = 5;
       public static int pageloadtimeouts = 5;
       
       public static void Sleepwait(int x) throws InterruptedException
       {
    	   Thread.sleep(x);
       }
       public static void Implicitywait(int x)
       {
    	   driver.manage().timeouts().implicitlyWait(x, TimeUnit.SECONDS);
       }
       public static void Explicitwaitclickable(int x, WebElement web)
       {
    	   WebDriverWait wt = new WebDriverWait(driver, x);
    	   wt.until(ExpectedConditions.elementToBeClickable(web));
       }
}
