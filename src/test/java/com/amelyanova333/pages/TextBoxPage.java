package com.amelyanova333.pages;

import com.amelyanova333.pages.components.ResultOutput;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {

    ResultOutput resultOutput = new ResultOutput();

    SelenideElement userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitInput = $("#submit");

    public TextBoxPage openPage() {
        open("/text-box");

        return this;
    }

    public TextBoxPage setUserName(String value) {
        userNameInput.setValue(value);

        return this;
    }

    public TextBoxPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPage setSubmit() {
        submitInput.click();

        return this;
    }

    public TextBoxPage verifyResult(String key, String value) {
        resultOutput.verifyResult(key, value);
        return this;

    }
}
