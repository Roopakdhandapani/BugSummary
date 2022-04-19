package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class initializeDriver {

    public static void driverCall() {
        WebDriverManager.chromedriver().setup();
    }
}
