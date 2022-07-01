package tests;

import com.github.javafaker.Faker;

import static utils.RandomUtils.*;

public class TestData {
    static Faker faker = new Faker();

    static String firstName = faker.address().firstName();
    static String lastName = faker.address().lastName();
    static String email = faker.internet().emailAddress();
    static String gender = getRandomGender();
    // userNumber
    static String userNumber = String.valueOf(faker.number().randomNumber(10, true));
    // dateOfBirth
    static String dayOfBirth = String.valueOf(getRandomInt(10, 28));
    static String monthOfBirth = getRandomMonth();
    static String yearOfBirth = String.valueOf(faker.number().numberBetween(1900, 2100));
    static String subject = getRandomSubject();
    static String hobbie = getRandomHobbie();
    static String picture = "image-form.png";
    static String currentAddress = faker.address().streetAddress();
    static String state = "NCR";
    static String city = "Delhi";
    static String modalName = "Thanks for submitting the form";

}
