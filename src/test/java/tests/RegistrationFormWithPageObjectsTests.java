package tests;

import org.junit.jupiter.api.Test;

public class RegistrationFormWithPageObjectsTests extends TestBase {

    @Test
    void succesfulTest() {
        String firstName = "Ivan";
        String lastName = "Ivanov";

        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail("ivan@ivanov.com")
                .setGender("Other")
                .setUserNumber("0123456789")
                .setDateOfBirth("30","July","2008")
                .setSubjects("English")
                .setSubjects("Chemistry")
                .setHobbies("Sports")
                .setHobbies("Reading")
                .setPicture("img/image-form.png")
                .setCurrentAddress("Some Street 1")
                .setState("NCR")
                .setCity("Delhi")
                .pressSubmit();

        registrationFormPage
                .checkModalName("Thanks for submitting the form")
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", "ivan@ivanov.com")
                .checkResult("Date of Birth", "30 July,2008")
                .checkResult("Subjects", "English, Chemistry")
                .checkResult("Hobbies", "Sports, Reading")
                .checkResult("Picture", "image-form.png")
                .checkResult("Address", "Some Street 1")
                .checkResult("State and City", "NCR Delhi");
    }
}
