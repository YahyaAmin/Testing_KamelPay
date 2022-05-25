package tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class UsefulFunctions {


    public static String getRandomNumberString() {
        // It will generate 9 digit random Number.
        // from 0 to 999999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999999);


        // this will convert any number sequence into 6 character.
        return String.format("%09d", number);
    }

    public static String getRandomNumberStringWith6Digits() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }


    public static String getRandomNumberStringWithRandomDigits() {
        // It will generate a random no. with random number of digits
        // from 0 to 99999999
        Random rnd = new Random();
        int number = rnd.nextInt(99999999);

        //for a random number of digits which is passed to string format
        //generates a random number between 1 and 8 for 1-8 digit
        Random rand = new Random();
        int lowerbound = 1;
        int upperbound = 8;
        int random_integer = rand.nextInt(upperbound - lowerbound) + lowerbound;
        // this will convert any number sequence into 1-8 digit character.
        return String.format("%" + random_integer + "d", number);
        //return String.format(String.valueOf(number));
    }


    // Random password generator code
    //    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
    //    String pwd = RandomStringUtils.random( 15, characters );
    //    System.out.println( pwd );


    //Username generator function that has 3-15 characters
    public static String getRandomCorrectUserName() {

        //random no of characters
        Random rand = new Random();
        int lowerbound = 3;
        int upperbound = 15;
        int random_integer = rand.nextInt(upperbound - lowerbound) + lowerbound;


        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String pwd = RandomStringUtils.random(random_integer, characters);
        return pwd;
    }


    //username has a special character
    public static String getRandomUserNameWithSpecialCharacter() {

        //random no of characters
        Random rand = new Random();
        int lowerbound = 5;
        int upperbound = 15;
        int random_integer = rand.nextInt(upperbound - lowerbound) + lowerbound;


        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}|;:'\\\",<.>/?~`!@#$%^&*()-_=+[{]}|;:'\\\",<.>/?~`!@#$%^&*()-_=+[{]}|;:'\\\",<.>/?~`!@#$%^&*()-_=+[{]}|;:'\\\",<.>/?";
        String pwd = RandomStringUtils.random(random_integer, characters);

        //create a string with only special characters
        //String s_characters = "~`!@#$%^&*()-_=+[{]}|;:'\",<.>/?";
        //String pwd1 = RandomStringUtils.random( 3, s_characters );
        //add both strings
        //String com_pwd = pwd + pwd1;

        return pwd;
    }

    //Username generator function that has 5-15 characters
    public static String getRandomUserNameWithWhitespaces() {

        //random no of characters
        Random rand = new Random();
        int lowerbound = 5;
        int upperbound = 15;
        int random_integer = rand.nextInt(upperbound - lowerbound) + lowerbound;


        String characters = " A B C D E F G H I J K L M N O P Q R S T U V W X Y Z a b c d e f g h i j k l m n o p q r s t u v w x y z 0 1 2 3 4 5 6 7 8 9 ";
        String pwd = RandomStringUtils.random(random_integer, characters);
        return pwd;
    }

//    public String getRandomPassword() {
//
//        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
//                .useDigits(true)
//                .useLower(true)
//                .useUpper(true)
//                .usePunctuation(true)
//                .build();
//        String password = passwordGenerator.generate(8); // output ex.: lrU12fmM 75iwI90o
//        return password;
//
//    }



    //password less than 6 characters
    public static String getRandomPasswordWithLessThan6Characters() {

        //random no of characters
        Random rand = new Random();
        int lowerbound = 1;
        int upperbound = 6;
        int random_integer = rand.nextInt(upperbound - lowerbound) + lowerbound;


        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}|;:'\",<.>/?";
        String pwd = RandomStringUtils.random(random_integer, characters);
        return pwd;
    }


    public static String otp_less_than_6_digits() {

        //random no of characters
        Random rand = new Random();
        int lowerbound = 1;
        int upperbound = 6;
        int random_integer = rand.nextInt(upperbound - lowerbound) + lowerbound;


        String characters = "0123456789";
        String pwd = RandomStringUtils.random(random_integer, characters);
        return pwd;
    }

    public static String random_phone_number_with_9_digits() {

        //random no of characters d
        Random rand = new Random();
        int lowerbound = 10;
        int upperbound = 10;
        int random_integer = rand.nextInt(upperbound - lowerbound) + lowerbound;


        String characters = "0123456789";
        String pwd = RandomStringUtils.random(random_integer, characters);
        return pwd;
    }
}