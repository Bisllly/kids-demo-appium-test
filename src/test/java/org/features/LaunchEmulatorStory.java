package org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LaunchEmulatorStory {
    @Managed(driver = "appium")
    WebDriver driver;
    @Test
    public void launchEmulator() {
        driver.get("http://www.google.com");
    }
}
