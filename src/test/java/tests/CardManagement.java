package tests;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.springframework.core.annotation.Order;
import org.testng.annotations.Test;

import java.time.Duration;

import static tests.Base_Class.driver;

public class CardManagement extends Base_Class {

    //scroll down function

    public void scrollDown()  {

        //The viewing size of the device
        Dimension size = driver.manage().window().getSize();

        //x position set to mid-screen horizontally
        int width = size.width / 2;

        //Starting y location set to 80% of the height (near bottom)
        int startPoint = (int) (size.getHeight() * 0.80);

        //Ending y location set to 20% of the height (near top)
        int endPoint = (int) (size.getHeight() * 0.20);

        new TouchAction(driver).press(PointOption.point(width, startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(width, endPoint)).release().perform();

    }

    public void scrollRight()  {

        //The viewing size of the device
        Dimension size = driver.manage().window().getSize();

        //x position set to mid-screen horizontally
        int height = size.height / 2;

        //Starting y location set to 80% of the height (near bottom)
        int startPoint = (int) (size.getWidth() * 0.80);

        //Ending y location set to 20% of the height (near top)
        int endPoint = (int) (size.getWidth() * 0.20);

        new TouchAction(driver).press(PointOption.point(startPoint, height)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(endPoint, height)).release().perform();

    }


    public String card_management_centiv_card = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView";

    public String back_button_at_card_management = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";

    public String login_button_on_mainscreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]";
    public String phone_no_on_mainscreen_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
    public String password_on_mainscreen_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";

    public String dont_allow_biometric_button_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]";

    public String whatsapp_customer_support_button_at_card_management = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView";

    public String settings_at_customer_support = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView";

    public String logout_button_at_card_management = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView";

    public String card_management_payd_card = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView";

    public String card_management_through_sidebar = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]";

    public String three_lines_home_button_at_homescreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";






    @Test //Check whether back button is working on Card Management
    @Order(1)
    public void CardManagementCase1() throws InterruptedException {

        //login steps
        Thread.sleep(4000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(3000);

        //card management steps
        driver.findElement(By.xpath(card_management_centiv_card)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(4000);

        //close driver
        driver.resetApp();
    }

    @Test //Check whether Whatsapp button is working on Card Management
    @Order(2)
    public void CardManagementCase2() throws InterruptedException {

        //login steps
        Thread.sleep(4000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(3000);

        //card management steps
        driver.findElement(By.xpath(card_management_centiv_card)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(whatsapp_customer_support_button_at_card_management)).click();
        Thread.sleep(4000);

        //close Whatsapp in background
        driver.runAppInBackground(Duration.ofSeconds(-1));

        //close driver
        driver.resetApp();
    }

    @Test //Check whether Settings button is working on Card Management
    @Order(3)
    public void CardManagementCase3() throws InterruptedException {

        //login steps
        Thread.sleep(4000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(3000);

        //card management steps
        driver.findElement(By.xpath(card_management_centiv_card)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(settings_at_customer_support)).click();
        Thread.sleep(5000);

        //close driver
        driver.resetApp();
    }

    @Test //Check whether Logout button is working on Card Management
    @Order(4)
    public void CardManagementCase4() throws InterruptedException {

        //login steps
        Thread.sleep(4000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(3000);

        //card management steps
        driver.findElement(By.xpath(card_management_centiv_card)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(logout_button_at_card_management)).click();
        Thread.sleep(5000);

        //close driver
        driver.resetApp();
    }

    @Test //Check if user can access Card management by tapping card at main page
    @Order(5)
    public void CardManagementCase5() throws InterruptedException {

        //login steps
        Thread.sleep(4000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(3000);

        //card management steps
        driver.findElement(By.xpath(card_management_centiv_card)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(4000);

        //scroll right function which scrolls to PayD card
        scrollRight();
        //end scroll function

        driver.findElement(By.xpath(card_management_payd_card)).click();
        Thread.sleep(4000);


        //close driver
        driver.resetApp();
    }

    @Test
    @Order(6)
    public void CardManagementCase6() throws InterruptedException {

        //login steps
        Thread.sleep(4000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(3000);

        //card management steps
        driver.findElement(By.xpath(three_lines_home_button_at_homescreen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(card_management_through_sidebar)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(3000);

        //scroll right to other card
        scrollRight();

        //card management other card
        driver.findElement(By.xpath(three_lines_home_button_at_homescreen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(card_management_through_sidebar)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(3000);

    }

}
