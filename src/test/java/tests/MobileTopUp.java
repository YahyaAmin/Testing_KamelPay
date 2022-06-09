package tests;

import io.cucumber.java8.Th;
import org.openqa.selenium.By;
import org.springframework.core.annotation.Order;
import org.testng.annotations.Test;

import static tests.UsefulFunctions.getRandomNumberLowerAndUpperBound;


public class MobileTopUp extends Base_Class {

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

    public String mobile_topup_button_mainscreen = "//android.widget.TextView[@text='Mobile Top Up']";

    public String new_topup_button = "//android.widget.TextView[@text='New Topup']";

    public String country_selector_at_phone_number = "//android.widget.ImageView[@index='0']";

    public String search_country_field = "//android.widget.EditText[@text='Search']";

    public String getCountryOfPhoneNumber(String countrie) {
        return "//android.widget.TextView[@text='" + countrie + "']";
    }

    public String enter_phone_number_mobiletopup = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    public String add_account_to_saved_list_checkbox = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";

    public String next_button_at_topup_screen = "//android.widget.TextView[@text='Next']";

    public String beneficiary_name_at_topup_screen = "//android.widget.EditText[@text='Beneficiary Name']";

    public String select_du_prepaid = "//android.widget.TextView[@text='Du Prepaid']";

    public String recharge_button_select_AED = "//android.widget.TextView[@text='110 AED Data Recharge']";

    public String pay_button_at_top_up_screen = "//android.widget.TextView[@text='Pay']";

    public String first_beneficiary_selector_at_top_up = "//android.view.ViewGroup[@index='0']";

    public String first_recharge_option_mobile_topup = "//android.view.ViewGroup[@index='7']";

    public String search_bar_at_mobile_topup_screen = "//android.widget.EditText[@index='1']";

    public String search_field_at_service_provider_screen = "//android.widget.EditText[@index='1']";



    @Test(priority = 1) //Pay Bill positive case
    @Order(1)
    public void mobileTopup1() throws InterruptedException {

        //String country = "United Arab Emir";

        //login steps
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

        //Mobile Top up steps
        driver.findElement(By.xpath(mobile_topup_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(new_topup_button)).click();
        Thread.sleep(5000);

        //country selector steps
        //driver.findElement(By.xpath(country_selector_at_phone_number)).click();
        //Thread.sleep(4000);
        //driver.findElement(By.xpath(search_country_field)).sendKeys(country);
        //Thread.sleep(1000);
        //driver.findElement(By.xpath(getCountryOfPhoneNumber(country))).click();
        //Thread.sleep(2000);

        driver.findElement(By.xpath(enter_phone_number_mobiletopup)).sendKeys(getRandomNumberLowerAndUpperBound(11, 13));
        Thread.sleep(3000);
        driver.findElement(By.xpath(add_account_to_saved_list_checkbox)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(beneficiary_name_at_topup_screen)).sendKeys(getRandomString(false, true, true, false, true, 10));
        Thread.sleep(2000);
        driver.findElement(By.xpath(next_button_at_topup_screen)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_du_prepaid)).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath(recharge_button_select_AED)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(pay_button_at_top_up_screen)).click();
        Thread.sleep(10000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 2) //Pay Bill but enter invalid phone number
    @Order(2)
    public void mobileTopup2() throws InterruptedException {

        //login steps
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

        //Mobile Top up steps
        driver.findElement(By.xpath(mobile_topup_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(new_topup_button)).click();
        Thread.sleep(5000);

        //country selector steps
        //driver.findElement(By.xpath(country_selector_at_phone_number)).click();
        //Thread.sleep(4000);
        //driver.findElement(By.xpath(search_country_field)).sendKeys(country);
        //Thread.sleep(1000);
        //driver.findElement(By.xpath(getCountryOfPhoneNumber(country))).click();
        //Thread.sleep(2000);

        driver.findElement(By.xpath(enter_phone_number_mobiletopup)).sendKeys(getRandomNumberLowerAndUpperBound(3, 6));
        Thread.sleep(3000);
        driver.findElement(By.xpath(add_account_to_saved_list_checkbox)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(beneficiary_name_at_topup_screen)).sendKeys(getRandomString(false, true, true, false, true, 10));
        Thread.sleep(2000);
        driver.findElement(By.xpath(next_button_at_topup_screen)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(next_button_at_topup_screen)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(next_button_at_topup_screen)).click();
        Thread.sleep(5000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 3) //Pay Bill but leave beneficiary empty
    @Order(3)
    public void mobileTopup3() throws InterruptedException {

        //login steps
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

        //Mobile Top up steps
        driver.findElement(By.xpath(mobile_topup_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(new_topup_button)).click();
        Thread.sleep(5000);

        //country selector steps
        //driver.findElement(By.xpath(country_selector_at_phone_number)).click();
        //Thread.sleep(4000);
        //driver.findElement(By.xpath(search_country_field)).sendKeys(country);
        //Thread.sleep(1000);
        //driver.findElement(By.xpath(getCountryOfPhoneNumber(country))).click();
        //Thread.sleep(2000);

        driver.findElement(By.xpath(enter_phone_number_mobiletopup)).sendKeys(getRandomNumberLowerAndUpperBound(10, 11));
        Thread.sleep(3000);
        driver.findElement(By.xpath(add_account_to_saved_list_checkbox)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(beneficiary_name_at_topup_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(next_button_at_topup_screen)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(next_button_at_topup_screen)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(next_button_at_topup_screen)).click();
        Thread.sleep(5000);


        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 4) //Pay Bill check whether user can change countries
    @Order(4)
    public void mobileTopup4() throws InterruptedException {

        //login steps
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

        //Mobile Top up steps
        driver.findElement(By.xpath(mobile_topup_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(new_topup_button)).click();
        Thread.sleep(5000);

        //check whether user can access these countries
        String[] countries = {"Pakistan", "India", "Bangladesh", "Sri Lanka"};


        //country selector steps
        for (int i = 0; i < countries.length; i++) {
            driver.findElement(By.xpath(country_selector_at_phone_number)).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath(search_country_field)).sendKeys(countries[i]);
            Thread.sleep(1000);
            driver.findElement(By.xpath(getCountryOfPhoneNumber(countries[i]))).click();
            Thread.sleep(4000);
        }

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 5) //Pay Bill check whether user can pay to an existing beneficiary
    @Order(5)
    public void mobileTopup5() throws InterruptedException {

        //login steps
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

        //Mobile Top up steps
        driver.findElement(By.xpath(mobile_topup_button_mainscreen)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(first_beneficiary_selector_at_top_up)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(first_recharge_option_mobile_topup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(pay_button_at_top_up_screen)).click();
        Thread.sleep(10000);


        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 6) //Pay Bill check whether user can search for beneficiaries
    @Order(6)
    public void mobileTopup6() throws InterruptedException {

        //login steps
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

        //Mobile Top up steps
        driver.findElement(By.xpath(mobile_topup_button_mainscreen)).click();
        Thread.sleep(3000);

        String[] beneficiaries = {"yahya", "wasif", "khizer"};

        //beneficiaries search steps
        for (int i = 0; i < beneficiaries.length; i++) {
            driver.findElement(By.xpath(search_bar_at_mobile_topup_screen)).sendKeys(beneficiaries[i]);
            Thread.sleep(3000);
            driver.findElement(By.xpath(search_bar_at_mobile_topup_screen)).clear();
            Thread.sleep(3000);
        }

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 7) //Pay Bill positive check if user can search for service providers
    public void mobileTopup7() throws InterruptedException {


        //login steps
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

        //Mobile Top up steps
        driver.findElement(By.xpath(mobile_topup_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(new_topup_button)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(enter_phone_number_mobiletopup)).sendKeys(getRandomNumberLowerAndUpperBound(11, 13));
        Thread.sleep(3000);
        driver.findElement(By.xpath(next_button_at_topup_screen)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(search_field_at_service_provider_screen)).sendKeys("Eti");
        Thread.sleep(3000);
        driver.findElement(By.xpath(search_field_at_service_provider_screen)).clear();
        driver.findElement(By.xpath(search_field_at_service_provider_screen)).sendKeys("Du");
        Thread.sleep(3000);


        //logged in
        //close driver
        driver.resetApp();
    }

    @Test(priority = 8) //Pay Bill but phone number is empty
    @Order(8)
    public void mobileTopup8() throws InterruptedException {

        //login steps
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

        //Mobile Top up steps
        driver.findElement(By.xpath(mobile_topup_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(new_topup_button)).click();
        Thread.sleep(5000);

        //country selector steps
        //driver.findElement(By.xpath(country_selector_at_phone_number)).click();
        //Thread.sleep(4000);
        //driver.findElement(By.xpath(search_country_field)).sendKeys(country);
        //Thread.sleep(1000);
        //driver.findElement(By.xpath(getCountryOfPhoneNumber(country))).click();
        //Thread.sleep(2000);

        //driver.findElement(By.xpath(enter_phone_number_mobiletopup)).sendKeys(getRandomNumberLowerAndUpperBound(3, 6));
        //Thread.sleep(3000);
        driver.findElement(By.xpath(add_account_to_saved_list_checkbox)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(beneficiary_name_at_topup_screen)).sendKeys(getRandomString(false, true, true, false, true, 10));
        Thread.sleep(2000);
        driver.findElement(By.xpath(next_button_at_topup_screen)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(next_button_at_topup_screen)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(next_button_at_topup_screen)).click();
        Thread.sleep(5000);


        //logged in
        //close driver
        driver.resetApp();

    }



}