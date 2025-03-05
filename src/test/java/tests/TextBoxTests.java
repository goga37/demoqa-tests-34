package tests;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Igor");
        $("#userEmail").setValue("csdc@bk.ru");
        $("#currentAddress").setValue("strit 12");
        $("#permanentAddress").setValue("home 47");
        $("#submit").click();

        $("#output #name").shouldHave(text("Igor"));
        $("#output #email").shouldHave(text("csdc@bk.ru"));
        $("#output #currentAddress").shouldHave(text("strit 12"));
        $("#output #permanentAddress").shouldHave(text("home 47"));

    }
}
