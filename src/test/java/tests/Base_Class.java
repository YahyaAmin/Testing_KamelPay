package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import org.apache.poi.util.SystemOutLogger;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base_Class {

    //AppiumDriver driver;
    public static AppiumDriver<AndroidElement> driver;

    @BeforeTest
    public void setup() {

        try {

        DesiredCapabilities caps = new DesiredCapabilities();

        File f = new File("apps");
        File fs = new File(f,"KamelPay.apk");

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
        caps.setCapability(MobileCapabilityType.UDID, "7664beac0820");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
        caps.setCapability(MobileCapabilityType.APP,"C:/Users/abc/Desktop/apk/KamelPay.apk");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver<AndroidElement>(url, caps);

    }
        catch(Exception exp){
                System.out.println("Cause is: " + exp.getCause());
                System.out.println("Message is: " + exp.getMessage());
                exp.printStackTrace();
        }
    }


//    @Test
//    public void SampleTest(){
//        System.out.println("Starting Tests");
//    }


    @AfterTest
    public void teardown(){


        driver.quit();
    }

}
