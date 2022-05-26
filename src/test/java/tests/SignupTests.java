package tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.springframework.core.annotation.Order;
import org.testng.annotations.Test;

import java.util.Random;

import static tests.UsefulFunctions.*;
import static tests.PasswordGenerator.*;

public class SignupTests extends Base_Class {

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

    //Incorrect password without uppercase
    public String getRandomPasswordWithoutUppercase() {

        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
                .useDigits(true)
                .useLower(true)
                .usePunctuation(true)
                .build();
        String password = passwordGenerator.generate(16); // output ex.: lrU12fmM 75iwI90o
        return password;

    }

    //Incorrect password without a number
    public String getRandomPasswordWithoutNumber() {

        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
                .useLower(true)
                .useUpper(true)
                .usePunctuation(true)
                .build();
        String password = passwordGenerator.generate(16); // output ex.: lrU12fmM 75iwI90o
        return password;

    }

    //password without a lowercase character
    public String getRandomPasswordWithoutLowerCase() {

        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
                .useDigits(true)
                .useUpper(true)
                .usePunctuation(true)
                .build();
        String password = passwordGenerator.generate(16); // output ex.: lrU12fmM 75iwI90o
        return password;

    }

    //password without special character
    public String getRandomPasswordWithoutSpecialCharacter() {

        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
                .useDigits(true)
                .useLower(true)
                .useUpper(true)
                .build();
        String password = passwordGenerator.generate(16); // output ex.: lrU12fmM 75iwI90o
        return password;

    }


    public String dont_have_an_account_signup_button = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]";

    public String view_password_button_at_signup_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]";
    public String payd_card_select_button_at_signup = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]";

    public String i_am_ready_button_at_signup = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]";

    public String phone_number_field_at_register_yourself_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    public String username_field_at_register_yourself_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";

    public String enter_your_password_at_register_yourself_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";

    public String confirm_your_password_at_register_yourself_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText";

    public String sign_up_button_at_register_yourself_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]";

    public String enter_otp_1st_slot_sign_up = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    public String next_button_at_otp_screen_sign_up_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]";

    public String click_outside_on_regiter_yourself_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[4]";

    public String dont_allow_biometric_button_after_sign_up = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]";

    public String centiv_card_select_button_at_sign_up = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]";

    public String verify_button_after_sign_up = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]";

    public String card_number_last_4_digits_1st_digit = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    public String click_outside_on_card_activation_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]";

    public String proceed_button_on_card_activation_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]";


    @Test //Signup with PayD positive case
    @Order(1)
    public void SignupCase1() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys("Password123!");

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys("Password123!");
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);

        //Entering OTP
        driver.findElement(By.xpath(enter_otp_1st_slot_sign_up)).sendKeys("666666");
        driver.findElement(By.xpath(next_button_at_otp_screen_sign_up_flow)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(dont_allow_biometric_button_after_sign_up)).click();
        Thread.sleep(5000);


        //logged in
        //close driver
        driver.resetApp();

    }

    @Test //Signup with Centiv ID positive case
    @Order(2)
    public void SignupCase2() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(centiv_card_select_button_at_sign_up)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys("Password123!");

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys("Password123!");
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);

        //Entering OTP
        driver.findElement(By.xpath(enter_otp_1st_slot_sign_up)).sendKeys("666666");
        driver.findElement(By.xpath(next_button_at_otp_screen_sign_up_flow)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(dont_allow_biometric_button_after_sign_up)).click();
        Thread.sleep(5000);


        //logged in
        //close driver
        driver.resetApp();
    }

    @Test //Signup with PayD and dont enter any phone number
    @Order(3)
    public void SignupCase3() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys("Password123!");

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys("Password123!");
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);


        //logged in
        //close driver
        driver.resetApp();

    }

    @Test //Signup with PayD but username is empty
    @Order(4)
    public void SignupCase4() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys("Password123!");

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys("Password123!");
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);

        //logged in
        //close driver
        driver.resetApp();

    }

    @Test //Signup with PayD but password is empty
    @Order(5)
    public void SignupCase5() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys("Password123!");
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);

        //logged in
        //close driver
        driver.resetApp();

    }

    @Test //Signup with PayD but confirm password field is empty
    @Order(6)
    public void SignupCase6() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys("Password123!");

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);

        //logged in
        //close driver
        driver.resetApp();

    }

    @Test //Signup with PayD and enter phone number with less than 9 digits
    @Order(7)
    public void SignupCase7() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberStringWithRandomDigits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys("Password123!");

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys("Password123!");
        Thread.sleep(2000);

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(4000);

        //logged in
        //close driver
        driver.resetApp();

    }

    @Test //Signup but username has special characters
    @Order(8)
    public void SignupCase8() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomUserNameWithSpecialCharacter());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys("Password123!");

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys("Password123!");
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);

        //logged in
        //close driver
        driver.resetApp();

    }

    @Test //Signup but username has whitespaces
    @Order(9)
    public void SignupCase9() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomUserNameWithWhitespaces());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys("Password123!");

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys("Password123!");
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);

        //logged in
        //close driver
        driver.resetApp();

    }

    @Test //Signup but enter password and confirm password are different
    @Order(10)
    public void SignupCasr10() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(centiv_card_select_button_at_sign_up)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys(getRandomPassword());

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys(getRandomPassword());
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(view_password_button_at_signup_flow)).click();
        Thread.sleep(3000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);

        //logged in
        //close driver
        driver.resetApp();
    }

    @Test //Signup but password does not have an uppercase letter
    @Order(11)
    public void SignupCasr11() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();

        //Saving a random password in String
        String password_without_uppercase = getRandomPasswordWithoutUppercase();

        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys(password_without_uppercase);

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys(password_without_uppercase);
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(view_password_button_at_signup_flow)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);


        //logged in
        //close driver
        driver.resetApp();

    }

    @Test //Signup but password does not have a number
    @Order(12)
    public void SignupCasr12() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();

        //Saving a random password in String
        String password_without_number = getRandomPasswordWithoutNumber();

        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys(password_without_number);

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys(password_without_number);
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(view_password_button_at_signup_flow)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);


        //logged in
        //close driver
        driver.resetApp();

    }


    @Test //Signup but password does not have a lowercase letter
    @Order(13)
    public void SignupCasr13() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();

        //Saving a random password in String
        String password_without_number = getRandomPasswordWithoutLowerCase();

        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys(password_without_number);

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys(password_without_number);
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(view_password_button_at_signup_flow)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);


        //logged in
        //close driver
        driver.resetApp();

    }

    @Test //Signup but password does not have a special character
    @Order(14)
    public void SignupCasr14() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();

        //Saving a random password in String
        String password_without_number = getRandomPasswordWithoutSpecialCharacter();

        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys(password_without_number);

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys(password_without_number);
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(view_password_button_at_signup_flow)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);


        //logged in
        //close driver
        driver.resetApp();

    }


    @Test //Signup but password is too short
    @Order(15)
    public void SignupCasr15() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();

        //Saving a random password in String
        String password_without_number = getRandomPasswordWithLessThan6Characters();

        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys(password_without_number);

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys(password_without_number);
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(view_password_button_at_signup_flow)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);


        //logged in
        //close driver
        driver.resetApp();

    }

    @Test //Signup and enter credentials and enter wrong OTP
    @Order(16)
    public void SignupCasr16() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys("Password123!");

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys("Password123!");
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);

        //Entering OTP
        driver.findElement(By.xpath(enter_otp_1st_slot_sign_up)).sendKeys(getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(next_button_at_otp_screen_sign_up_flow)).click();
        Thread.sleep(2000);


        //logged in
        //close driver
        driver.resetApp();
    }

    @Test //Signup and enter credentials and enter OTP less than 6 digits
    @Order(17)
    public void SignupCasr17() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys("Password123!");

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys("Password123!");
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);

        //Entering OTP
        driver.findElement(By.xpath(enter_otp_1st_slot_sign_up)).sendKeys(getOTPLessThan6Digits());
        driver.findElement(By.xpath(next_button_at_otp_screen_sign_up_flow)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(next_button_at_otp_screen_sign_up_flow)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(next_button_at_otp_screen_sign_up_flow)).click();
        Thread.sleep(2000);


        //logged in
        //close driver
        driver.resetApp();
    }

    @Test //Signup and enter credentials and leave OTP empty
    @Order(18)
    public void SignupCasr18() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys("Password123!");

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys("Password123!");
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);


        driver.findElement(By.xpath(next_button_at_otp_screen_sign_up_flow)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(next_button_at_otp_screen_sign_up_flow)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(next_button_at_otp_screen_sign_up_flow)).click();
        Thread.sleep(2000);


        //logged in
        //close driver
        driver.resetApp();
    }

    @Test //Signup with PayD positive case and verify card
    @Order(19)
    public void SignupCasr19() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(dont_have_an_account_signup_button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(payd_card_select_button_at_signup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(i_am_ready_button_at_signup)).click();
        Thread.sleep(1000);

        //entering details of user who is signing in
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(phone_number_field_at_register_yourself_page)).sendKeys(getRandomNumberString()+getRandomNumberStringWith6Digits());
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).click();
        driver.findElement(By.xpath(username_field_at_register_yourself_page)).sendKeys(getRandomCorrectUserName());
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(enter_your_password_at_register_yourself_page)).sendKeys("Password123!");

        //click outside the field
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).click();
        driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page)).sendKeys("Password123!");
        Thread.sleep(2000);

        //click outside all fields
        driver.findElement(By.xpath(click_outside_on_regiter_yourself_page)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(sign_up_button_at_register_yourself_page)).click();
        Thread.sleep(3000);

        //Entering OTP
        driver.findElement(By.xpath(enter_otp_1st_slot_sign_up)).sendKeys("666666");
        driver.findElement(By.xpath(next_button_at_otp_screen_sign_up_flow)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(dont_allow_biometric_button_after_sign_up)).click();
        Thread.sleep(5000);

        //verifying card of new user
        driver.findElement(By.xpath(verify_button_after_sign_up)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(card_number_last_4_digits_1st_digit)).sendKeys(getRandomNumberString());
        Thread.sleep(2000);
        driver.findElement(By.xpath(click_outside_on_card_activation_page)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(proceed_button_on_card_activation_page)).click();
        Thread.sleep(5000);


        //logged in
        //close driver
        driver.resetApp();

    }
}
