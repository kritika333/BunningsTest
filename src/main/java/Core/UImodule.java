package Core;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;


public class UImodule {

    //need to write the integration with chrome driver
    public WebDriver driverThread;

    //private static String chromeDriverPath = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe";
    public void DriverConfiguration() {
        // DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        /******
         * INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
         *     Starting ChromeDriver 80.0.3987.106 (f68069574609230cf9b635cd784cfb1bf81bb53a-refs/branch-heads/3987@{#882}) on port 31460
         * appears on cosnole when using desired capabilties
         *
         * The use of the DesiredCapabilities class is supported by Python, Ruby, etc. While it is also available in Java, its usage in Java is deprecated.
         *
         * Instead, we can use the ChromeOptions class. This is supported by Java, Python, etc.
         *
         *  https://chromedriver.chromium.org/capabilities
         *
         */
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        // capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KritiKapil\\Desktop\\chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        //driverThread = new ChromeDriver(capabilities);
        driverThread = new ChromeDriver(options);
        driverThread.manage().window().maximize();
    }

    public void QuitDriver(WebDriver driverThread) {
        driverThread.quit();
    }

}