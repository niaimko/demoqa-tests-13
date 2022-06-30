package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class UploadPictureComponent {

    public void uploadPicture(String value) {
        $("#uploadPicture").uploadFromClasspath(value);
    }
}
