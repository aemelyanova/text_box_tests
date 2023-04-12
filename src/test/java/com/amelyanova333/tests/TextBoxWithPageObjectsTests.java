package com.amelyanova333.tests;

import org.junit.jupiter.api.Test;

public class TextBoxWithPageObjectsTests extends TestBase {
    @Test
    void successfulFillFormTest() {

        textBoxPage.openPage()
                .setUserName("Mr Smith")
                .setUserEmail("Smith@gmail.com")
                .setCurrentAddress("Some street 1")
                .setPermanentAddress("Another street 2")
                .setSubmit();
        textBoxPage.verifyResult("Name:", "Mr Smith")
                .verifyResult("Email:", "Smith@gmail.com")
                .verifyResult("Current Address :", "Some street 1")
                .verifyResult("Permananet Address :", "Another street 2");
    }
}

