package org.features;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.jupiter.api.Test;

public class LaunchEmulatorStory {
    AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
    service.start();
    try {
        // do stuff with drivers
    } finally {
        service.stop();
    }
}