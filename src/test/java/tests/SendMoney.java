package tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.springframework.core.annotation.Order;
import org.testng.annotations.Test;

import java.time.Duration;

import static tests.UsefulFunctions.getRandomNumberLowerAndUpperBound;

public class SendMoney extends Base_Class{


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

    public String getRandomString(boolean Digits, boolean Lower, boolean Upper, boolean Punctuation, boolean Spaces, int length) {

        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
                .useDigits(Digits)
                .useLower(Lower)
                .useUpper(Upper)
                .usePunctuation(Punctuation)
                .useSpaces(Spaces)
                .build();
        String password = passwordGenerator.generate(length); // output ex.: lrU12fmM 75iwI90o
        return password;

    }


    public String login_button_on_mainscreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]";
    public String phone_no_on_mainscreen_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
    public String password_on_mainscreen_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";
    public String dont_allow_biometric_button_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]";

    public String send_money_button_payd_card = "//android.widget.TextView[@text='Send Money']";

    public String send_money_button_at_send_money_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]";

    public String cash_pickup_button_at_send_money = "//android.widget.TextView[@text='Cash Pickup']";

    public String cash_pickup_selector_at_send_money_allied_bank_or_1st_bank_of_country = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup";

    public String bank_account_button_at_send_money = "//android.widget.TextView[@text='Bank Account']";

    public String bank_account_selector_at_send_money_allied_bank_or_2nd_bank_of_country = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";

    public String confirm_button_at_bank_confirmation_screen = "//android.widget.TextView[@text='Confirm']";

    public String enter_sender_amount_field_at_send_money_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    public String next_button_at_send_money_screen_after_entering_amount = "//android.widget.TextView[@text='Next']";

    public String first_name_field_at_beneficiary_details_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    public String last_name_field_at_beneficiary_details_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";

    public String click_outside_field_at_beneficiary_page = "//android.widget.TextView[@text='Last name']";

    public String phone_number_field_at_beneficiary_details_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";

    public String account_title_field_at_beneficiary_details_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText";

    public String iban_account_field_no_at_beneficiary_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";

    public String click_outside_at_beneficiary_page_after_scrolling_down = "//android.widget.TextView[@text='IBAN / Account number']";

    public String nationality_selector_field_at_beneficiary_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup";

    public String search_field_at_nationality_page = "//android.widget.EditText[@text='Search']";

    public String nationality_selector_button_at_select_nationality_page = "//android.widget.TextView[@text='Pakistan']";

    public String remittance_purpose_at_beneficiary_details_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText";

    public String add_account_to_saved_list_checkbox = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup";

    public String beneficiary_name_field_at_beneficiary_details = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText";

    public String next_button_at_beneficiary_details_page = "//android.widget.TextView[@text='Next']";

    public String checkbox_button_at_confirmation_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]";

    public String send_money_button_at_confirmation_page = "//android.widget.TextView[@text='Send Money']";

    public String otp_1st_field_after_confirming_payment = "//android.widget.EditText[@text='0']";

    public String verify_button_after_otp_screen = "//android.widget.TextView[@text='Verify']";

    public String first_beneficiary_in_all_beneficiaries_send_money_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup";

    public String click_outside_at_beneficiary_page_after_scrolling_down_cashpickup = "//android.widget.TextView[@text='Nationality']";

    public String enterNation(String country1){

        String nation_locator  = "//android.widget.TextView[@text='"+country1+"']";
        return nation_locator;

    };

    public String enterPopularCountry(String pop_country){

        String popular_country = "//android.widget.TextView[@text='"+pop_country+"']";
        return popular_country;
    }





    @Test(priority = 1) //Select PayD card and send remittance happy flow bank transfer
    @Order(1)
    public void SendMoneyCase1() throws InterruptedException {

        String country = "Pakistan";
        Thread.sleep(5000);
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

        //send money payd card steps
        scrollRight();
        Thread.sleep(3000);

        driver.findElement(By.xpath(send_money_button_payd_card)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(send_money_button_at_send_money_screen)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(enterPopularCountry(country))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(bank_account_button_at_send_money)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(bank_account_selector_at_send_money_allied_bank_or_2nd_bank_of_country)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(confirm_button_at_bank_confirmation_screen)).click();
        Thread.sleep(4000);

        //sender amount
        driver.findElement(By.xpath(enter_sender_amount_field_at_send_money_page)).sendKeys(getRandomNumberLowerAndUpperBound(2,5));
        Thread.sleep(5000);
        driver.findElement(By.xpath(next_button_at_send_money_screen_after_entering_amount)).click();
        Thread.sleep(4000);

        //enter beneficiary details steps
        driver.findElement(By.xpath(first_name_field_at_beneficiary_details_page)).sendKeys(getRandomString(false,false,true,false,false,1)+getRandomString(false,true,false,false,false,7));
        Thread.sleep(1000);
        driver.findElement(By.xpath(last_name_field_at_beneficiary_details_page)).sendKeys(getRandomString(false,false,true,false,false,1)+getRandomString(false,true,false,false,false,7));
        Thread.sleep(1000);
        driver.findElement(By.xpath(click_outside_field_at_beneficiary_page)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(phone_number_field_at_beneficiary_details_page)).sendKeys(getRandomNumberLowerAndUpperBound(11,12));
        driver.findElement(By.xpath(click_outside_field_at_beneficiary_page)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(account_title_field_at_beneficiary_details_page)).sendKeys(getRandomString(false,true,true,false,false,8));
        driver.findElement(By.xpath(click_outside_field_at_beneficiary_page)).click();

        scrollDown();
        Thread.sleep(2000);
        driver.findElement(By.xpath(iban_account_field_no_at_beneficiary_page)).sendKeys(getRandomString(false,false,true,false,false,2));
        driver.findElement(By.xpath(iban_account_field_no_at_beneficiary_page)).sendKeys(getRandomNumberLowerAndUpperBound(2,3));
        driver.findElement(By.xpath(iban_account_field_no_at_beneficiary_page)).sendKeys(getRandomString(false,false,true,false,false,4));
        driver.findElement(By.xpath(iban_account_field_no_at_beneficiary_page)).sendKeys(getRandomNumberLowerAndUpperBound(8,10));
        driver.findElement(By.xpath(click_outside_at_beneficiary_page_after_scrolling_down)).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath(click_outside_at_beneficiary_page_after_scrolling_down)).click();
        driver.findElement(By.xpath(nationality_selector_field_at_beneficiary_page)).click();
        Thread.sleep(5000);

        //send country and select country element function

        driver.findElement(By.xpath(search_field_at_nationality_page)).sendKeys(country);
        //select nationality function'
        driver.findElement(By.xpath(enterNation(country))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(remittance_purpose_at_beneficiary_details_page)).sendKeys(getRandomString(false,true,true,false, true,15));
        driver.findElement(By.xpath(click_outside_at_beneficiary_page_after_scrolling_down)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(add_account_to_saved_list_checkbox)).click();
        driver.findElement(By.xpath(click_outside_at_beneficiary_page_after_scrolling_down)).click();

        scrollDown();

        Thread.sleep(2000);
        driver.findElement(By.xpath(beneficiary_name_field_at_beneficiary_details)).sendKeys(getRandomString(false,true,true,false,true,10));
        Thread.sleep(2000);
        driver.findElement(By.xpath(next_button_at_beneficiary_details_page)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(checkbox_button_at_confirmation_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(send_money_button_at_confirmation_page)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(otp_1st_field_after_confirming_payment)).sendKeys("666666");
        driver.findElement(By.xpath(verify_button_after_otp_screen)).click();
        Thread.sleep(10000);

        //logged in
        //close driver
        driver.resetApp();

    }



    @Test(priority = 2) //Select PayD card and send remittance to a saved Beneficiary
    @Order(2)
    public void SendMoneyCase2() throws InterruptedException {

        Thread.sleep(5000);
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

        //send money payd card steps
        scrollRight();
        Thread.sleep(3000);

        driver.findElement(By.xpath(send_money_button_payd_card)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(first_beneficiary_in_all_beneficiaries_send_money_screen)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(enter_sender_amount_field_at_send_money_page)).sendKeys(getRandomNumberLowerAndUpperBound(2,5));
        Thread.sleep(5000);
        driver.findElement(By.xpath(next_button_at_send_money_screen_after_entering_amount)).click();
        Thread.sleep(4000);

        //confirmation of payment
        driver.findElement(By.xpath(checkbox_button_at_confirmation_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(send_money_button_at_confirmation_page)).click();
        Thread.sleep(10000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 3) //Select Centiv card and try to send money. Feature not available expected
    @Order(3)
    public void SendMoneyCase3() throws InterruptedException {

        Thread.sleep(5000);
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


        driver.findElement(By.xpath(send_money_button_payd_card)).click();
        Thread.sleep(7000);


        //logged in
        //close driver
        driver.resetApp();

    }



    @Test(priority = 4) //Select PayD card and send money through cash pickup
    @Order(4)
    public void SendMoneyCase4() throws InterruptedException {

        String country = "Pakistan";
        Thread.sleep(5000);
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

        //send money payd card steps
        scrollRight();
        Thread.sleep(3000);

        driver.findElement(By.xpath(send_money_button_payd_card)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(send_money_button_at_send_money_screen)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(enterPopularCountry(country))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(cash_pickup_button_at_send_money)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(cash_pickup_selector_at_send_money_allied_bank_or_1st_bank_of_country)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(confirm_button_at_bank_confirmation_screen)).click();
        Thread.sleep(4000);

        //sender amount
        driver.findElement(By.xpath(enter_sender_amount_field_at_send_money_page)).sendKeys(getRandomNumberLowerAndUpperBound(2,5));
        Thread.sleep(5000);
        driver.findElement(By.xpath(next_button_at_send_money_screen_after_entering_amount)).click();
        Thread.sleep(4000);

        //enter beneficiary details steps
        driver.findElement(By.xpath(first_name_field_at_beneficiary_details_page)).sendKeys(getRandomString(false,false,true,false,false,1)+getRandomString(false,true,false,false,false,7));
        Thread.sleep(1000);
        driver.findElement(By.xpath(last_name_field_at_beneficiary_details_page)).sendKeys(getRandomString(false,false,true,false,false,1)+getRandomString(false,true,false,false,false,7));
        Thread.sleep(1000);
        driver.findElement(By.xpath(click_outside_field_at_beneficiary_page)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(phone_number_field_at_beneficiary_details_page)).sendKeys(getRandomNumberLowerAndUpperBound(11,12));
        Thread.sleep(1000);
        driver.findElement(By.xpath(click_outside_field_at_beneficiary_page)).click();
        Thread.sleep(1000);

        scrollDown();
        Thread.sleep(2000);
        driver.findElement(By.xpath(nationality_selector_field_at_beneficiary_page)).click();
        Thread.sleep(5000);

        //send country and select country element function

        driver.findElement(By.xpath(search_field_at_nationality_page)).sendKeys(country);
        //select nationality function'
        driver.findElement(By.xpath(enterNation(country))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(remittance_purpose_at_beneficiary_details_page)).sendKeys(getRandomString(false,true,true,false, true,15));
        driver.findElement(By.xpath(click_outside_at_beneficiary_page_after_scrolling_down_cashpickup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(add_account_to_saved_list_checkbox)).click();
        driver.findElement(By.xpath(click_outside_at_beneficiary_page_after_scrolling_down_cashpickup)).click();

        scrollDown();

        Thread.sleep(2000);
        driver.findElement(By.xpath(beneficiary_name_field_at_beneficiary_details)).sendKeys(getRandomString(false,true,true,false,true,10));
        Thread.sleep(2000);
        driver.findElement(By.xpath(next_button_at_beneficiary_details_page)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(checkbox_button_at_confirmation_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(send_money_button_at_confirmation_page)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(otp_1st_field_after_confirming_payment)).sendKeys("666666");
        driver.findElement(By.xpath(verify_button_after_otp_screen)).click();
        Thread.sleep(10000);

        //logged in
        //close driver
        driver.resetApp();

    }


}
