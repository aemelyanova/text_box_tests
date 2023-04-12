package com.amelyanova333.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests extends TestBase {
    @Test
    void successfulFillFormTest() {
        open("/text-box");

        $("#userName").setValue("Mr Smith");
        $("#userEmail").setValue("Smith@gmail.com");
        $("#currentAddress").setValue("Some street 1");
        $("#permanentAddress").setValue("Another street 2");
        $("#submit").click();

        $("#output").shouldHave(text("Mr Smith"), text("Smith@gmail.com"),
                text("Some street 1"), text("Another street 2"));

        $("#output #name").shouldHave(text("Mr Smith"));
    }
}
