package com.amelyanova333.pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultOutput {

    public void verifyResult(String key, String value) {
        $("#output").$(byText(key)).parent().shouldHave(text(value));
    }
}

