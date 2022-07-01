package tests;

import org.junit.jupiter.api.Test;

public class RegistrationFormWithFakerTests extends TestBase {

    @Test
    void succesfulTest() {

        registrationFormPage.openPage()
                .setFirstName(TestData.firstName)
                .setLastName(TestData.lastName)
                .setEmail(TestData.email)
                .setGender(TestData.gender)
                .setUserNumber(TestData.userNumber)
                .setDateOfBirth(TestData.dayOfBirth, TestData.monthOfBirth, TestData.yearOfBirth)
                .setSubjects(TestData.subject)
                .setHobbies(TestData.hobbie)
                .setPicture(TestData.picture)
                .setCurrentAddress(TestData.currentAddress)
                .setState(TestData.state)
                .setCity(TestData.city)
                .pressSubmit()
                .checkModalName(TestData.modalName)
                .checkResult("Student Name", TestData.firstName + " " + TestData.lastName)
                .checkResult("Student Email", TestData.email)
                .checkResult("Gender", TestData.gender)
                .checkResult("Mobile", TestData.userNumber)
                .checkResult("Date of Birth", TestData.dayOfBirth + " " + TestData.monthOfBirth + "," + TestData.yearOfBirth)
                .checkResult("Subjects", TestData.subject)
                .checkResult("Hobbies", TestData.hobbie)
                .checkResult("Picture", TestData.picture)
                .checkResult("Address", TestData.currentAddress)
                .checkResult("State and City", TestData.state + " " + TestData.city);
    }
}
