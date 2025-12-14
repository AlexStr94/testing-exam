package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileBaseTest {

    protected AppiumDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Параметры эмулятора
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.0"); 
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_7 (4)");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");

        // Приложение
        caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Alexander\\dev\\study\\testing-exam\\exam2\\app-alpha-universal-release.apk");
        caps.setCapability(MobileCapabilityType.NO_RESET, true);

        // Подключение к Appium Server
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
