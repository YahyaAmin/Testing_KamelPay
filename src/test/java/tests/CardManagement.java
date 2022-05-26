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
import static tests.UsefulFunctions.*;

public class CardManagement extends Base_Class {

    //scroll down function

    public void scrollDown() {

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

    public void scrollRight() {

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

    public void scrollLeft() {

        //The viewing size of the device
        Dimension size = driver.manage().window().getSize();

        //x position set to mid-screen horizontally
        int height = size.height / 2;

        //Starting y location set to 80% of the height (near bottom)
        int startPoint = (int) (size.getWidth() * 0.20);

        //Ending y location set to 20% of the height (near top)
        int endPoint = (int) (size.getWidth() * 0.80);

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

    public String change_pin_button_at_card_management = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]";

    public String enter_new_pin_1st_place_at_change_pin_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    public String confirm_your_new_pin_at_change_pin_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    public String next_button_at_change_pin_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]";

    public String otp_verification_1st_digit_card_management_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    public String next_button_at_otp_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]";

    public String activate_deactivate_card_button = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]";

    public String block_card_and_activate_card_button = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]";

    public String request_new_card_button = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]";

    public String ok_button_after_request_new_card = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button";

    public String transaction_history_button_on_card_management = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]";

    public String back_button_at_transaction_history_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";



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

    @Test  //User can access card management through side bar
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

        //reset app
        driver.resetApp();

    }


    @Test //Successfully change pin through card management screen
    @Order(7)
    public void CardManagementCase7() throws InterruptedException {

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
        Thread.sleep(2000);
        driver.findElement(By.xpath(change_pin_button_at_card_management)).click();
        Thread.sleep(2000);

        //OTP steps
        driver.findElement(By.xpath(otp_verification_1st_digit_card_management_flow)).sendKeys("666666");
        Thread.sleep(500);
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);

        //Change Pin steps
        String pin_code_for_this_test = getRandomNumberString();
        driver.findElement(By.xpath(enter_new_pin_1st_place_at_change_pin_screen)).sendKeys(pin_code_for_this_test);
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_new_pin_at_change_pin_screen)).sendKeys(pin_code_for_this_test);
        Thread.sleep(2000);
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(10000);


        //reset the app
        driver.resetApp();

    }

    @Test //Change Pin but leave OTP field empty
    @Order(8)
    public void CardManagementCase8() throws InterruptedException {

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
        Thread.sleep(2000);
        driver.findElement(By.xpath(change_pin_button_at_card_management)).click();
        Thread.sleep(2000);

        //OTP steps
        driver.findElement(By.xpath(otp_verification_1st_digit_card_management_flow)).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(otp_verification_1st_digit_card_management_flow)).click();
        Thread.sleep(500);

        //click next button 3 times
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);

        //reset the app
        driver.resetApp();

    }

    @Test //Change Pin but OTP is less than 6 digits
    @Order(9)
    public void CardManagementCase9() throws InterruptedException {

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
        Thread.sleep(2000);
        driver.findElement(By.xpath(change_pin_button_at_card_management)).click();
        Thread.sleep(2000);

        //OTP steps
        driver.findElement(By.xpath(otp_verification_1st_digit_card_management_flow)).sendKeys(getOTPLessThan6Digits());
        Thread.sleep(500);
        driver.findElement(By.xpath(otp_verification_1st_digit_card_management_flow)).click();
        Thread.sleep(500);

        //click next button 3 times
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);

        //reset the app
        driver.resetApp();

    }

    @Test //Change Pin but OTP is an invalid 6 digit OTP
    @Order(10)
    public void CardManagementCasr10() throws InterruptedException {

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
        Thread.sleep(2000);
        driver.findElement(By.xpath(change_pin_button_at_card_management)).click();
        Thread.sleep(2000);

        //OTP steps
        driver.findElement(By.xpath(otp_verification_1st_digit_card_management_flow)).sendKeys(getRandomNumberString());
        Thread.sleep(500);
        driver.findElement(By.xpath(otp_verification_1st_digit_card_management_flow)).click();
        Thread.sleep(500);

        //click next button
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);

        //reset the app
        driver.resetApp();

    }

    @Test //Change pin but leave PIN field and confirm PIN field empty
    @Order(11)
    public void CardManagementCasr11() throws InterruptedException {

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
        Thread.sleep(2000);
        driver.findElement(By.xpath(change_pin_button_at_card_management)).click();
        Thread.sleep(2000);

        //OTP steps
        driver.findElement(By.xpath(otp_verification_1st_digit_card_management_flow)).sendKeys("666666");
        Thread.sleep(500);
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);

        //Change Pin steps
        String pin_code_for_this_test = getRandomNumberString();
        driver.findElement(By.xpath(enter_new_pin_1st_place_at_change_pin_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_new_pin_at_change_pin_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_new_pin_at_change_pin_screen)).click();
        Thread.sleep(2000);

        //next button on change pin
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);

        //reset the app
        driver.resetApp();
    }


    @Test //Change pin but leave confirm PIN field empty
    @Order(12)
    public void CardManagementCasr12() throws InterruptedException {

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
        Thread.sleep(2000);
        driver.findElement(By.xpath(change_pin_button_at_card_management)).click();
        Thread.sleep(2000);

        //OTP steps
        driver.findElement(By.xpath(otp_verification_1st_digit_card_management_flow)).sendKeys("666666");
        Thread.sleep(500);
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);

        //Change Pin steps
        String pin_code_for_this_test = getRandomNumberString();
        driver.findElement(By.xpath(enter_new_pin_1st_place_at_change_pin_screen)).sendKeys(pin_code_for_this_test);
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_new_pin_at_change_pin_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_new_pin_at_change_pin_screen)).click();
        Thread.sleep(2000);

        //next button on change pin
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);

        //reset the app
        driver.resetApp();

    }


    @Test //Change pin but leave Enter PIN field empty
    @Order(13)
    public void CardManagementCasr13() throws InterruptedException {

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
        Thread.sleep(2000);
        driver.findElement(By.xpath(change_pin_button_at_card_management)).click();
        Thread.sleep(2000);

        //OTP steps
        driver.findElement(By.xpath(otp_verification_1st_digit_card_management_flow)).sendKeys("666666");
        Thread.sleep(500);
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);

        //Change Pin steps
        String pin_code_for_this_test = getRandomNumberString();
        driver.findElement(By.xpath(enter_new_pin_1st_place_at_change_pin_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_new_pin_at_change_pin_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_new_pin_at_change_pin_screen)).sendKeys(pin_code_for_this_test);
        Thread.sleep(2000);

        //next button on change pin
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);

        //reset the app
        driver.resetApp();

    }


    @Test //Enter PIN less than 4 digits
    @Order(14)
    public void CardManagementCasr14() throws InterruptedException {

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
        Thread.sleep(2000);
        driver.findElement(By.xpath(change_pin_button_at_card_management)).click();
        Thread.sleep(2000);

        //OTP steps
        driver.findElement(By.xpath(otp_verification_1st_digit_card_management_flow)).sendKeys("666666");
        Thread.sleep(500);
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);

        //Change Pin steps
        String pin_code_for_this_test = getRandomNumberLowerAndUpperBound(1, 4);
        driver.findElement(By.xpath(enter_new_pin_1st_place_at_change_pin_screen)).sendKeys(pin_code_for_this_test);
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_new_pin_at_change_pin_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_new_pin_at_change_pin_screen)).sendKeys(pin_code_for_this_test);
        Thread.sleep(2000);

        //next button on change pin
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);

        //reset the app
        driver.resetApp();

    }


    @Test //Change pin but PIN and confirm PIN are different
    @Order(15)
    public void CardManagementCasr15() throws InterruptedException {

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
        Thread.sleep(2000);
        driver.findElement(By.xpath(change_pin_button_at_card_management)).click();
        Thread.sleep(2000);

        //OTP steps
        driver.findElement(By.xpath(otp_verification_1st_digit_card_management_flow)).sendKeys("666666");
        Thread.sleep(500);
        driver.findElement(By.xpath(next_button_at_otp_screen)).click();
        Thread.sleep(4000);

        //Change Pin steps
        driver.findElement(By.xpath(enter_new_pin_1st_place_at_change_pin_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(enter_new_pin_1st_place_at_change_pin_screen)).sendKeys(getRandomNumberString());
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_new_pin_at_change_pin_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_new_pin_at_change_pin_screen)).sendKeys(getRandomNumberString());
        Thread.sleep(2000);

        //next button on change pin
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_at_change_pin_screen)).click();
        Thread.sleep(4000);

        //reset the app
        driver.resetApp();

    }


    //SOME TEST CASES LEFT


    @Test //Check if user can block both cards on card management
    @Order(18)
    public void CardManagementCasr18() throws InterruptedException {

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
        //block centiv card
        driver.findElement(By.xpath(card_management_centiv_card)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(activate_deactivate_card_button)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(block_card_and_activate_card_button)).click();
        Thread.sleep(9000);

        //block payd card steps
        //go back 2 times
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(2000);

        //scroll right function which scrolls to PayD card
        scrollRight();
        //end scroll function

        driver.findElement(By.xpath(card_management_payd_card)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(activate_deactivate_card_button)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(block_card_and_activate_card_button)).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(2000);

        scrollLeft();

        //unblock centiv card
        driver.findElement(By.xpath(card_management_centiv_card)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(activate_deactivate_card_button)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(block_card_and_activate_card_button)).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(2000);

        //unblock payd
        //scroll right function which scrolls to PayD card
        scrollRight();
        //end scroll function

        driver.findElement(By.xpath(card_management_payd_card)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(activate_deactivate_card_button)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(block_card_and_activate_card_button)).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(2000);

        scrollLeft();
        Thread.sleep(2000);

        //close driver
        driver.resetApp();
    }


    @Test //Check if user can request a new card
    @Order(19)
    public void CardManagementCasr19() throws InterruptedException {

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
        //centiv card
        driver.findElement(By.xpath(card_management_centiv_card)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(request_new_card_button)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(ok_button_after_request_new_card)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(2000);

        //payd card
        scrollRight();
        driver.findElement(By.xpath(card_management_payd_card)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(request_new_card_button)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(ok_button_after_request_new_card)).click();
        Thread.sleep(5000);


        driver.resetApp();

    }


    @Test //Check if user can view their transaction history
    @Order(20)
    public void CardManagementCasr20() throws InterruptedException {

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
        //centiv card
        driver.findElement(By.xpath(card_management_centiv_card)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(transaction_history_button_on_card_management)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(back_button_at_transaction_history_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(back_button_at_card_management)).click();
        Thread.sleep(2000);

        //payd card
        scrollRight();
        driver.findElement(By.xpath(card_management_payd_card)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(transaction_history_button_on_card_management)).click();
        Thread.sleep(6000);


        driver.resetApp();

    }


}