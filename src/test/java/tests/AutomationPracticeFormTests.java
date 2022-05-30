package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeFormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void succesfulTest() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("[id=firstName]").setValue("Ivan");
        $("[id=lastName]").setValue("Ivanov");
        $("[id=userEmail]").setValue("ivan@ivanov.com");
        $("[for=gender-radio-3]").click();
        $("[id=userNumber]").setValue("0123456789");
        $("[id=dateOfBirthInput]").click();
        $("[id=dateOfBirthInput]").sendKeys(Keys.CONTROL + "A");
        $("[id=dateOfBirthInput]").sendKeys("01 Jun 2022");
        $("[id=dateOfBirthInput]").pressEscape();
        $("[id=subjectsInput]").sendKeys("English");
        $("[id=subjectsInput]").pressEnter();
        $("[id=subjectsInput]").sendKeys("Computer Science");
        $("[id=subjectsInput]").pressEnter();
        $("[for=hobbies-checkbox-1]").click();
        $("[for=hobbies-checkbox-3]").click();
        $("[id=uploadPicture]").uploadFile(new File("src/test/resources/image-form.png"));
        $("[id=currentAddress]").setValue("LA");
        $("[id=state]").scrollTo().click();
        $("[id=state]").$(byText("Uttar Pradesh")).click();
        $("[id=city]").scrollTo().click();
        $("[id=city]").$(byText("Lucknow")).click();
        $("[id=submit]").click();

        $("[class=modal-content]").shouldHave(text("Thanks for submitting the form"), text("Ivan Ivanov"),
                text("ivan@ivanov.com"), text("Other"), text("0123456789"), text("01 June,2022"),
                text("English, Computer Science"), text("Sports, Music"), text("image-form.png"), text("LA"),
                text("Uttar Pradesh Lucknow"));
    }
}
