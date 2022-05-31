package tests;

import org.openqa.selenium.By;
import org.springframework.core.annotation.Order;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static tests.UsefulFunctions.*;

public class SettingsTestCases extends Base_Class{

    //create a soft-assertion object
    SoftAssert softAssert = new SoftAssert();

    //random password generator function for correct password
    public String getRandomPassword() {

        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
                .useDigits(true)
                .useLower(true)
                .useUpper(true)
                .usePunctuation(true)
                .build();
        String password = passwordGenerator.generate(16); // output ex.: lrU12fmM 75iwI90o
        return password;

    }


    public String login_button_on_mainscreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]";
    public String phone_no_on_mainscreen_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
    public String password_on_mainscreen_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";

    public String dont_allow_biometric_button_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]";

    public String settings_at_top_right = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView";

    public String three_lines_home_button_at_homescreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";

    public String settings_button_at_sidebar = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]";

    public String back_button_at_settings_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";

    public String whatsapp_button_at_settings_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]";

    public String logout_button_at_settings_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView";

    public String change_password_button_at_settings_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]";

    public String enter_old_password_field_change_password_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    public String enter_new_password_field_change_password_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";

    public String confirm_new_password_field_change_password_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";

    public String submit_button_at_change_password_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]";

    public String view_password_button_at_change_password_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView";

    public String eye_button_to_view_password_login_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]";

    public String notifications_button_at_sidebar = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]";

    public String ok_button_notifications_flow_by_id = "android:id/button1";

    public String setup_pin_login_button_settings_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup";

    public String enter_new_pin_first_slot_settings_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    public String confirm_your_pin_first_slot_settings_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    public String submit_button_set_ur_pin_settings_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]";

    public String pop_up_at_screen_top_after_changing_pin = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]";


    //entering a PIN function
    public String enterPIN(String digit){

        String entering_pin_when_logging_in_1 = "//android.inputmethodservice.Keyboard.Key[@content-desc=\""+digit+"\"]/android.view.ViewGroup";

        return entering_pin_when_logging_in_1;
    }



    //check if settings is accessible through settings button at top right
    @Test
    @Order(1)
    public void settingsCase1() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        //Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);

        //close driver
        driver.resetApp();

    }


    //check if settings is accessible through settings button at sidebar
    @Test
    @Order(2)
    public void settingsCase2() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        //Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(three_lines_home_button_at_homescreen)).click();
        driver.findElement(By.xpath(settings_button_at_sidebar)).click();
        Thread.sleep(4000);

        //close driver
        driver.resetApp();

    }


    //Check back button functionality on Settings page
    @Test
    @Order(3)
    public void settingsCase3() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        //Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(back_button_at_settings_page)).click();
        Thread.sleep(4000);

        //close driver
        driver.resetApp();

    }

    //Check Whatsapp customer support functionality on Settings page
    @Test
    @Order(4)
    public void settingsCase4() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        //Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(whatsapp_button_at_settings_page)).click();
        Thread.sleep(7000);

        //close Whatsapp in background
        driver.runAppInBackground(Duration.ofSeconds(-1));

        //close driver
        driver.resetApp();

    }


    //Check Logout button on Settings page
    @Test
    @Order(5)
    public void settingsCase5() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        //Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(logout_button_at_settings_page)).click();
        Thread.sleep(4000);


        //close driver
        driver.resetApp();

    }


    //Change Password positive case. Password changed successfully
    @Test
    @Order(6)
    public void settingsCase6() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(change_password_button_at_settings_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(enter_old_password_field_change_password_flow)).sendKeys("Password123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(enter_new_password_field_change_password_flow)).sendKeys("Vista123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirm_new_password_field_change_password_flow)).sendKeys("Vista123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(logout_button_at_settings_page)).click();
        Thread.sleep(1000);


        //login with new password and change password back to "Password123!"
        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Vista123!");
        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);

        //change password steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(change_password_button_at_settings_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(enter_old_password_field_change_password_flow)).sendKeys("Vista123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(enter_new_password_field_change_password_flow)).sendKeys("Password123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirm_new_password_field_change_password_flow)).sendKeys("Password123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(8000);


        //close driver
        driver.resetApp();

    }


    //Change Password but all fields are empty
    @Test
    @Order(7)
    public void settingsCase7() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(change_password_button_at_settings_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(enter_old_password_field_change_password_flow)).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.xpath(enter_new_password_field_change_password_flow)).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirm_new_password_field_change_password_flow)).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(5000);

        //click submit password 3 times
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);


        //close driver
        driver.resetApp();

    }


    //Change Password but password and confirm password field empty
    @Test
    @Order(8)
    public void settingsCase8() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(change_password_button_at_settings_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(enter_old_password_field_change_password_flow)).sendKeys("Password123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(enter_new_password_field_change_password_flow)).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirm_new_password_field_change_password_flow)).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(5000);

        //click submit password 3 times
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);


        //close driver
        driver.resetApp();

    }


    //Change Password but old password field is empty
    @Test
    @Order(9)
    public void settingsCase9() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(change_password_button_at_settings_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(enter_old_password_field_change_password_flow)).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.xpath(enter_new_password_field_change_password_flow)).sendKeys("Vista123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirm_new_password_field_change_password_flow)).sendKeys("Vista123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(5000);

        //click submit password 3 times
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);


        //close driver
        driver.resetApp();

    }


    //Change Password but old password is incorrect
    @Test
    @Order(10)
    public void settingsCasr10() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(change_password_button_at_settings_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(enter_old_password_field_change_password_flow)).sendKeys(getRandomPassword());
        Thread.sleep(1000);
        driver.findElement(By.xpath(enter_new_password_field_change_password_flow)).sendKeys("Vista123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirm_new_password_field_change_password_flow)).sendKeys("Vista123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(5000);

        //click submit password 3 times
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);


        //close driver
        driver.resetApp();

    }


    //Change Password but password does not have an Uppercase letter
    @Test
    @Order(11)
    public void settingsCasr11() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);

        //password for this test
        //String password_this_test = getRandomPasswordWithoutUppercase();

        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(change_password_button_at_settings_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(enter_old_password_field_change_password_flow)).sendKeys("Password123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(enter_new_password_field_change_password_flow)).sendKeys("vista123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirm_new_password_field_change_password_flow)).sendKeys("vista123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(5000);

        //click submit password 3 times
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);


        //close driver
        driver.resetApp();

    }


    //Change Password but password does not have a Lowercase letter
    @Test
    @Order(12)
    public void settingsCasr12() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);

        //password for this test
        //String password_this_test = getRandomPasswordWithoutUppercase();

        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(change_password_button_at_settings_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(enter_old_password_field_change_password_flow)).sendKeys("Password123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(enter_new_password_field_change_password_flow)).sendKeys("VISTA123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirm_new_password_field_change_password_flow)).sendKeys("VISTA123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(5000);

        //click submit password 3 times
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);


        //close driver
        driver.resetApp();

    }


    //Change Password but password does not have a number
    @Test
    @Order(13)
    public void settingsCasr13() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);

        //password for this test
        //String password_this_test = getRandomPasswordWithoutUppercase();

        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(change_password_button_at_settings_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(enter_old_password_field_change_password_flow)).sendKeys("Password123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(enter_new_password_field_change_password_flow)).sendKeys("Vista!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirm_new_password_field_change_password_flow)).sendKeys("Vista!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(5000);

        //click submit password 3 times
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);


        //close driver
        driver.resetApp();

    }



    //Change Password but password does not have a special character
    @Test
    @Order(14)
    public void settingsCasr14() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);

        //password for this test
        //String password_this_test = getRandomPasswordWithoutUppercase();

        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(change_password_button_at_settings_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(enter_old_password_field_change_password_flow)).sendKeys("Password123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(enter_new_password_field_change_password_flow)).sendKeys("Vista123");
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirm_new_password_field_change_password_flow)).sendKeys("Vista123");
        Thread.sleep(1000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(5000);

        //click submit password 3 times
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);


        //close driver
        driver.resetApp();

    }



    //Change Password but password has spaces
    @Test
    @Order(15)
    public void settingsCasr15() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);

        //password for this test
        //String password_this_test = getRandomPasswordWithoutUppercase();

        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(change_password_button_at_settings_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(enter_old_password_field_change_password_flow)).sendKeys("Password123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(enter_new_password_field_change_password_flow)).sendKeys("Vista 123 !");
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirm_new_password_field_change_password_flow)).sendKeys("Vista 123 !");
        Thread.sleep(1000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(5000);

        //click submit password 3 times
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);


        //close driver
        driver.resetApp();

    }


    //Change Password but passwords do not match
    @Test
    @Order(16)
    public void settingsCasr16() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);

        //password for this test
        //String password_this_test = getRandomPasswordWithoutUppercase();

        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(change_password_button_at_settings_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(enter_old_password_field_change_password_flow)).sendKeys("Password123!");
        Thread.sleep(1000);
        driver.findElement(By.xpath(enter_new_password_field_change_password_flow)).sendKeys(getRandomPassword());
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirm_new_password_field_change_password_flow)).sendKeys(getRandomPassword()+"c");
        Thread.sleep(1000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(view_password_button_at_change_password_page)).click();
        Thread.sleep(5000);

        //click submit password 3 times
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_at_change_password_page)).click();
        Thread.sleep(3000);


        //close driver
        driver.resetApp();

    }


    //Check Notifications and Alerts
    @Test
    @Order(17)
    public void settingsCasr17() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);

        //password for this test
        //String password_this_test = getRandomPasswordWithoutUppercase();

        //settings steps
        driver.findElement(By.xpath(three_lines_home_button_at_homescreen)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(notifications_button_at_sidebar)).click();
        Thread.sleep(1000);
        driver.findElementById(ok_button_notifications_flow_by_id).click();
        Thread.sleep(3000);


        //close driver
        driver.resetApp();

    }



    //setup correct pin and login with correct pin
    @Test
    @Order(18)
    public void settingsCasr18() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        //Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);

        //setting up pin steps
        driver.findElement(By.xpath(setup_pin_login_button_settings_flow)).click();
        Thread.sleep(1000);
        //generating a 4 digit pin
        String digit_one = getRandomDigit();
        String digit_two = getRandomDigit();
        String digit_three = getRandomDigit();
        String digit_four = getRandomDigit();
        driver.findElement(By.xpath(enter_new_pin_first_slot_settings_flow)).sendKeys(digit_one+digit_two+digit_three+digit_four);
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirm_your_pin_first_slot_settings_flow)).sendKeys(digit_one+digit_two+digit_three+digit_four);
        Thread.sleep(1000);
        driver.findElement(By.xpath(submit_button_set_ur_pin_settings_flow)).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(logout_button_at_settings_page)).click();
        Thread.sleep(2000);

        //login with new pin steps
        driver.findElement(By.xpath(enterPIN(digit_one))).click();
        driver.findElement(By.xpath(enterPIN(digit_two))).click();
        driver.findElement(By.xpath(enterPIN(digit_three))).click();
        driver.findElement(By.xpath(enterPIN(digit_four))).click();

        Thread.sleep(4000);


        //close driver
        driver.resetApp();

    }


    //pin login flow but pin field is empty
    @Test
    @Order(19)
    public void settingsCasr19() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        //Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);

        //setting up pin steps
        driver.findElement(By.xpath(setup_pin_login_button_settings_flow)).click();
        Thread.sleep(1000);

        //click submit 3 times
        driver.findElement(By.xpath(submit_button_set_ur_pin_settings_flow)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_set_ur_pin_settings_flow)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_set_ur_pin_settings_flow)).click();
        Thread.sleep(3000);


        //close driver
        driver.resetApp();

    }


    //pin login flow but pin field is empty
    @Test
    @Order(20)
    public void settingsCasr20() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        //Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);

        //setting up pin steps
        driver.findElement(By.xpath(setup_pin_login_button_settings_flow)).click();
        Thread.sleep(1000);

        //pin for this step
        String pin = getRandomNumberLowerAndUpperBound(1,4);
        driver.findElement(By.xpath(enter_new_pin_first_slot_settings_flow)).sendKeys(pin);
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_pin_first_slot_settings_flow)).sendKeys(pin);

        //click submit
        driver.findElement(By.xpath(submit_button_set_ur_pin_settings_flow)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_set_ur_pin_settings_flow)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_set_ur_pin_settings_flow)).click();
        Thread.sleep(3000);

        //close driver
        driver.resetApp();

    }


    //pin login flow but pin has spaces
    @Test
    @Order(21)
    public void settingsCasr21() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        //Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);

        //setting up pin steps
        driver.findElement(By.xpath(setup_pin_login_button_settings_flow)).click();
        Thread.sleep(1000);

        //pin for this step
        String pin = getRandomDigit() + " " + getRandomDigit() +" ";
        driver.findElement(By.xpath(enter_new_pin_first_slot_settings_flow)).sendKeys(pin);
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_pin_first_slot_settings_flow)).sendKeys(pin);
        Thread.sleep(2000);

        //click submit
        driver.findElement(By.xpath(submit_button_set_ur_pin_settings_flow)).click();
        Thread.sleep(3000);

        //assertion
        String pop_up_text = driver.findElement(By.xpath(pop_up_at_screen_top_after_changing_pin)).getText();
        softAssert.assertEquals(pop_up_text, "Failed", "TestCase 21: Pin setup successfully when it should have failed");
        Thread.sleep(3000);

        //close driver
        driver.resetApp();

        softAssert.assertAll();

    }


    //pin login flow but pin has special characters
    @Test
    @Order(22)
    public void settingsCasr22() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        //Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);

        //setting up pin steps
        driver.findElement(By.xpath(setup_pin_login_button_settings_flow)).click();
        Thread.sleep(1000);

        //pin for this step
        String pin = "-" + "," +"." + getRandomDigit();
        driver.findElement(By.xpath(enter_new_pin_first_slot_settings_flow)).sendKeys(pin);
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_pin_first_slot_settings_flow)).sendKeys(pin);
        Thread.sleep(2000);

        //click submit
        driver.findElement(By.xpath(submit_button_set_ur_pin_settings_flow)).click();
        Thread.sleep(3000);

        //assertion
        String pop_up_text = driver.findElement(By.xpath(pop_up_at_screen_top_after_changing_pin)).getText();
        softAssert.assertEquals(pop_up_text, "Failed", "TestCase 22: Pin setup successfully when it should have failed");
        Thread.sleep(3000);

        //close driver
        driver.resetApp();

        softAssert.assertAll();

    }


    //pin login flow but pin and confirm pin are different
    @Test
    @Order(23)
    public void settingsCasr23() throws InterruptedException {

        //login steps

        Thread.sleep(2000);
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(phone_no_on_mainscreen_xpath)).sendKeys("123456789");
        //Thread.sleep(3000);
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
        //Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_on_mainscreen)).click();
        //Thread.sleep(3000);
        //dont allow biometric
        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
        Thread.sleep(4000);


        //settings steps
        driver.findElement(By.xpath(settings_at_top_right)).click();
        Thread.sleep(4000);

        //setting up pin steps
        driver.findElement(By.xpath(setup_pin_login_button_settings_flow)).click();
        Thread.sleep(1000);

        //pin for this step
        driver.findElement(By.xpath(enter_new_pin_first_slot_settings_flow)).sendKeys(getRandomNumberString());
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_pin_first_slot_settings_flow)).sendKeys(getRandomNumberString());
        Thread.sleep(2000);

        //click submit
        driver.findElement(By.xpath(submit_button_set_ur_pin_settings_flow)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_set_ur_pin_settings_flow)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submit_button_set_ur_pin_settings_flow)).click();
        Thread.sleep(3000);


        //close driver
        driver.resetApp();

    }


}
