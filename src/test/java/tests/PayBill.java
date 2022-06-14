package tests;

import org.openqa.selenium.By;
import org.springframework.core.annotation.Order;
import org.testng.annotations.Test;

import static tests.UsefulFunctions.getRandomNumberLowerAndUpperBound;
import static tests.UsefulFunctions.getRandomString;


public class PayBill extends Base_Class{


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

    public String pay_bill_button_mainscreen = "//android.widget.TextView[@text='Pay Bill']";

    public String pay_new_bill_button_paybill_screen = "//android.widget.TextView[@text='Pay New Bill']";

    public String search_country_field_at_pay_new_bill_screen = "//android.widget.EditText[@index='1']";

    public String select_country_india = "//android.widget.TextView[@text='India']";

    public String select_country_philippines = "//android.widget.TextView[@text='Philippines']";

    public String select_country_pakistan = "//android.widget.TextView[@text='Pakistan']";

    public String select_bill_type_utility = "//android.widget.TextView[@text='Utility']";

    public String select_bill_type_mobile_prepaid = "//android.widget.TextView[@text='Mobile Prepaid']";

    public String search_utility_field = "//android.widget.EditText[@index='1']";

    public String select_KSEB_at_utility = "//android.widget.TextView[@text='KSEB (Kerala State Electricity Board Ltd)']";

    public String select_avantikagas_at_utility = "//android.widget.TextView[@text='Aavantika Gas Ltd']";

    public String select_adanigas_at_utility = "//android.widget.TextView[@text='Adani Gas Ltd']";

    public String select_gujaratgas_at_utility = "//android.widget.TextView[@text='Gujarat Gas Ltd']";

    public String enter_mobile_number_at_utility_bill_payment = "//android.widget.EditText[@text='Enter mobile number.']";

    public String enter_subscriber_name = "//android.widget.EditText[@text='Enter subscriber name.']";
    public String enter_consumer_number_at_utility_bill_payment = "//android.widget.EditText[@text='Enter consumer number.']";

    public String enter_customer_number_at_utility_bill_payment = "//android.widget.EditText[@text='Enter customer no.']";

    public String enter_customer_id_at_utility_bill_payment = "//android.widget.EditText[@text='Enter customer id.']";

    public String enter_account_number_field_at_utility_bill_payment = "//android.widget.EditText[@text='Enter account number.']";
    public String next_button_after_entering_bill_details = "//android.widget.TextView[@text='Next']";

    public String next_button_at_utility_screen = "//android.widget.TextView[@text='Next']";

    public String select_tatapowermumbai_on_utility = "//android.widget.TextView[@text='Tata Power (Mumbai)']";

    public String select_cignaltv_on_utility = "//android.widget.TextView[@text='Cignal TV']";

    public String select_pampanga_on_utility = "//android.widget.TextView[@text='Pampanga I Electric Cooperative Inc.']";

    public String select_PLDT_on_utility = "//android.widget.TextView[@text='PLDT (Cruztelco, Maratel, Subictel, Clarktel, Philcom)']";

    public String enter_amount_field = "//android.widget.EditText[@text='Enter amount']";

    public String pay_button_after_entering_amount = "//android.widget.TextView[@text='Pay']";

    public String telephone_number_field_at_utility = "//android.widget.EditText[@text='Enter telephone number (including area code).']";

    public String select_lesco_at_utility = "//android.widget.TextView[@text='LESCO (Lahore Electricity Corporate)']";

    public String select_hesco_at_utility = "//android.widget.TextView[@text='HESCO (Hyderabad Electric Supply Corporation)']";

    public String select_ptcllandline_at_utility = "//android.widget.TextView[@text='PTCL Landline (Pakistan Telecommunication Company)']";

    public String select_ssgc_at_utility = "//android.widget.TextView[@text='SSGC (Sui Southern Gas Company)']";

    public String select_kwsb_at_utility = "//android.widget.TextView[@text='KWSB (Karachi Water & Sewerage Board)']";
    public String select_kelectric_at_utility = "//android.widget.TextView[@text='K-ELECTRIC (Karachi Electric)']";

    public String select_sngpl_at_utility = "//android.widget.TextView[@text='SNGPL (Sui Northern Gas Company)']";

    public String enter_reference_number_field = "//android.widget.EditText[@text='Enter reference number.']";

    public String enter_account_id_at_utility = "//android.widget.EditText[@text='Enter account id.']";

    public String zong_prepaid_button = "//android.widget.TextView[@text='Zong Prepaid']";

    public String zong_package = "//android.widget.TextView[@text='Zong USD $15 (PKR 1,785)']";

    public String mobile_number_field = "//android.widget.EditText[@text='Enter mobile number.']";

    public String add_account_to_saved_list_checkbox = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup";

    public String beneficiary_name_field = "//android.widget.EditText[@text='Beneficiary name']";

    public String click_outside_on_beneficiary_details_page = "//android.widget.TextView[@text='Account Number']";




    @Test(priority = 1) //Pay Bill with KSEB(India) positive case
    @Order(1)
    public void PayBillCase1() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KSEB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_KSEB_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys("9012345678");
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys("1234567890123");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(8000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 2) //Pay Bill with Tata Power(Mumbai) positive case
    @Order(2)
    public void PayBillCase2() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("Tata Power");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_tatapowermumbai_on_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys("9012345678");
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys("112233445566");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(8000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 3) //Pay Bill with Cignal TV positive case
    @Order(3)
    public void PayBillCase3() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("Philippines");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_philippines)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("Cignal TV");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_cignaltv_on_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_subscriber_name)).sendKeys("JOHN DOE");
        driver.findElement(By.xpath(enter_account_number_field_at_utility_bill_payment)).sendKeys("9001758799");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(enter_amount_field)).sendKeys(getRandomNumberLowerAndUpperBound(2,4));
        driver.findElement(By.xpath(pay_button_after_entering_amount)).click();
        Thread.sleep(8000);



        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 4) //Pay Bill with Pampanga I Electric Corp positive case
    @Order(4)
    public void PayBillCase4() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("Philippines");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_philippines)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("Pampanga");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_pampanga_on_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_subscriber_name)).sendKeys("JOHN DOE");
        driver.findElement(By.xpath(enter_account_number_field_at_utility_bill_payment)).sendKeys("06066679");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(enter_amount_field)).sendKeys(getRandomNumberLowerAndUpperBound(2,4));
        driver.findElement(By.xpath(pay_button_after_entering_amount)).click();
        Thread.sleep(8000);



        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 5) //Pay Bill with Avantika Gas(India) positive case
    @Order(5)
    public void PayBillCase5() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("Aavantika");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_avantikagas_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys("9012345678");
        driver.findElement(By.xpath(enter_customer_number_at_utility_bill_payment)).sendKeys("2233445566");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(8000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 6) //Pay Bill with Adani Gas(India) positive case
    @Order(6)
    public void PayBillCase6() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("Adani");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_adanigas_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_customer_id_at_utility_bill_payment)).sendKeys("1000083625");
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys("9012345678");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(8000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 7) //Pay Bill with Gujarat Gas(India) positive case
    @Order(7)
    public void PayBillCase7() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("Gujarat");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_gujaratgas_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_customer_id_at_utility_bill_payment)).sendKeys("500000937265");
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys("9841025363");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(pay_button_after_entering_amount)).click();
        Thread.sleep(7000);


        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 8) //Pay Bill with PLDT(Philippines) Corp positive case
    @Order(8)
    public void PayBillCase8() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("Philippines");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_philippines)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("PLDT");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_PLDT_on_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_account_number_field_at_utility_bill_payment)).sendKeys("7788990011");
        driver.findElement(By.xpath(telephone_number_field_at_utility)).sendKeys("832826648");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(enter_amount_field)).sendKeys(getRandomNumberLowerAndUpperBound(2,4));
        driver.findElement(By.xpath(pay_button_after_entering_amount)).click();
        Thread.sleep(8000);



        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 9) //Pay Bill with LESCO positive case
    @Order(9)
    public void PayBillCase9() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("Pakistan");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_pakistan)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("LESCO");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_lesco_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_reference_number_field)).sendKeys("04116738439200");
        driver.findElement(By.xpath(next_button_at_utility_screen)).click();
        Thread.sleep(8000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 10) //Pay Bill with PTCL Landline but biller is unavailable
    @Order(10)
    public void PayBillCase10() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("Pakistan");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_pakistan)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("PTCL");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_ptcllandline_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_account_id_at_utility)).sendKeys("2937763091");
        driver.findElement(By.xpath(next_button_at_utility_screen)).click();
        Thread.sleep(8000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 11) //Pay Bill with SSGC Pakistan but request timeout
    @Order(11)
    public void PayBillCase11() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("Pakistan");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_pakistan)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("SSGC");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_ssgc_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys("6372229438");
        driver.findElement(By.xpath(next_button_at_utility_screen)).click();
        Thread.sleep(8000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 12) //Pay Bill with KWSB
    @Order(12)
    public void PayBillCase12() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("Pakistan");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_pakistan)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KWSB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_kwsb_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_account_number_field_at_utility_bill_payment)).sendKeys("76740217800040");
        driver.findElement(By.xpath(next_button_at_utility_screen)).click();
        Thread.sleep(8000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 13) //Pay Bill with K-Electric
    @Order(13)
    public void PayBillCase13() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("Pakistan");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_pakistan)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("K-Electric");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_kelectric_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_account_number_field_at_utility_bill_payment)).sendKeys("0509320091734");
        driver.findElement(By.xpath(next_button_at_utility_screen)).click();
        Thread.sleep(8000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 14) //Pay Bill with SNGPL Error Processing Transaction
    @Order(14)
    public void PayBillCase14() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("Pakistan");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_pakistan)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("SNGPL");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_sngpl_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys("45849090047");
        driver.findElement(By.xpath(next_button_at_utility_screen)).click();
        Thread.sleep(8000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 15) //Pay Bill with Zong Mobile Prepaid
    @Order(15)
    public void PayBillCase15() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("Pakistan");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_pakistan)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_mobile_prepaid)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(zong_prepaid_button)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(zong_package)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(mobile_number_field)).sendKeys("923938010321");
        driver.findElement(By.xpath(next_button_at_utility_screen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_button_after_entering_amount)).click();
        Thread.sleep(8000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 16) //Pay Bill with HESCO account status invalid
    @Order(16)
    public void PayBillCase16() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("Pakistan");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_pakistan)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("HESCO");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_hesco_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_reference_number_field)).sendKeys("18739209142040");
        driver.findElement(By.xpath(next_button_at_utility_screen)).click();
        Thread.sleep(8000);

        //logged in
        //close driver
        driver.resetApp();

    }



    @Test(priority = 17) //Pay Bill with Pampanga I Electric Corp positive case
    @Order(17)
    public void PayBillCase17() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("Philippines");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_philippines)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("Pampanga");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_pampanga_on_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_subscriber_name)).sendKeys("JOHN DOE");
        driver.findElement(By.xpath(enter_account_number_field_at_utility_bill_payment)).sendKeys("06066679");
        Thread.sleep(1000);
        driver.findElement(By.xpath(add_account_to_saved_list_checkbox)).click();
        driver.findElement(By.xpath(beneficiary_name_field)).sendKeys(getRandomString(false, true,true,false,true,9));
        Thread.sleep(1000);
        driver.findElement(By.xpath(click_outside_on_beneficiary_details_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(enter_amount_field)).sendKeys(getRandomNumberLowerAndUpperBound(2,4));
        driver.findElement(By.xpath(pay_button_after_entering_amount)).click();
        Thread.sleep(8000);

        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 18) //Pay Bill with KSEB(India) but mobile number is empty
    @Order(18)
    public void PayBillCase18() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KSEB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_KSEB_at_utility)).click();
        Thread.sleep(4000);
        //driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys("9012345678");
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys("1234567890123");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);


        //logged in
        //close driver
        driver.resetApp();

    }



    @Test(priority = 19) //Pay Bill with KSEB(India) but mobile number less than 10 digits
    @Order(19)
    public void PayBillCase19() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KSEB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_KSEB_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys(getRandomNumberLowerAndUpperBound(1,9));
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys("1234567890123");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);


        //logged in
        //close driver
        driver.resetApp();

    }



    @Test(priority = 20) //Pay Bill with KSEB(India) but mobile number more than 10 digits
    @Order(20)
    public void PayBillCase20() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KSEB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_KSEB_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys(getRandomNumberLowerAndUpperBound(11,13));
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys("1234567890123");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);


        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 21) //Pay Bill with KSEB(India) but enter random 10 digit mobile number
    @Order(21)
    public void PayBillCase21() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KSEB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_KSEB_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys(getRandomNumberLowerAndUpperBound(10,11));
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys("1234567890123");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(8000);


        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 22) //Pay Bill with KSEB(India) but consumer number is empty
    @Order(22)
    public void PayBillCase22() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KSEB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_KSEB_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys("9012345678");
        //driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys("1234567890123");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(8000);


        //logged in
        //close driver
        driver.resetApp();

    }



    @Test(priority = 23) //Pay Bill with KSEB(India) but consumer number less than 13 digits
    @Order(23)
    public void PayBillCase23() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KSEB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_KSEB_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys("9012345678");
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys(getRandomNumberLowerAndUpperBound(1,13));
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(8000);


        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 24) //Pay Bill with KSEB(India) but consumer number more than 13 digits
    @Order(24)
    public void PayBillCase24() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KSEB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_KSEB_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys("9012345678");
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys(getRandomNumberLowerAndUpperBound(14,15));
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(8000);


        //logged in
        //close driver
        driver.resetApp();

    }



    @Test(priority = 25) //Pay Bill with KSEB(India) but consumer number is a random 13 digit number
    @Order(25)
    public void PayBillCase25() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KSEB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_KSEB_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys("9012345678");
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys(getRandomNumberLowerAndUpperBound(13,14));
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(8000);


        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 26) //Pay Bill with KSEB(India) but consumer number has spaces
    @Order(26)
    public void PayBillCase26() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KSEB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_KSEB_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys("9012345678");
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys(getRandomString(true,false,false,false,true,13));
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(8000);


        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 27) //Pay Bill with KSEB(India) but consumer number has special characters
    @Order(27)
    public void PayBillCase27() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KSEB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_KSEB_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys("9012345678");
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys(getRandomString(true,false,false,true,false,13));
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(8000);


        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 28) //Pay Bill with KSEB(India) but mobile number has spaces
    @Order(28)
    public void PayBillCase28() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KSEB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_KSEB_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys(getRandomString(true,false,false,false,true,9));
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys("1234567890123");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(8000);


        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 29) //Pay Bill with KSEB(India) but mobile number has special characters
    @Order(29)
    public void PayBillCase29() throws InterruptedException {


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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_india)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("KSEB");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_KSEB_at_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_mobile_number_at_utility_bill_payment)).sendKeys(getRandomString(true,false,false,true,false,9));
        driver.findElement(By.xpath(enter_consumer_number_at_utility_bill_payment)).sendKeys("1234567890123");
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(8000);


        //logged in
        //close driver
        driver.resetApp();

    }


    @Test(priority = 30) //Pay Bill with Pampanga I Electric Corp but leave beneficiary name empty
    @Order(30)
    public void PayBillCase30() throws InterruptedException {

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

        //Pay Bill steps
        driver.findElement(By.xpath(pay_bill_button_mainscreen)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pay_new_bill_button_paybill_screen)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(search_country_field_at_pay_new_bill_screen)).sendKeys("Philippines");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_country_philippines)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(select_bill_type_utility)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(search_utility_field)).sendKeys("Pampanga");
        Thread.sleep(1000);
        driver.findElement(By.xpath(select_pampanga_on_utility)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(enter_subscriber_name)).sendKeys("JOHN DOE");
        driver.findElement(By.xpath(enter_account_number_field_at_utility_bill_payment)).sendKeys("06066679");
        Thread.sleep(1000);
        driver.findElement(By.xpath(add_account_to_saved_list_checkbox)).click();
        //driver.findElement(By.xpath(beneficiary_name_field)).sendKeys(getRandomString(false, true,true,false,true,9));
        Thread.sleep(1000);
        driver.findElement(By.xpath(click_outside_on_beneficiary_details_page)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(next_button_after_entering_bill_details)).click();
        Thread.sleep(3000);

        //logged in
        //close driver
        driver.resetApp();

    }


}
