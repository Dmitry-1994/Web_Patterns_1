package ru.netology.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import ru.netology.data.DataGenerator;

import static com.codeborne.selenide.Selenide.*;

class DeliveryTest {
    @BeforeEach
    void startSetup() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void happyCase() {
        $("[data-test-id=city] input").setValue(DataGenerator.generateCity("ru"));
        $("[data-test-id=date] input").sendKeys(Keys.chord(Keys.LEFT_CONTROL, "a"), Keys.DELETE);
        $("[data-test-id=date] input").setValue(DataGenerator.generateDate(1));
    }
}
