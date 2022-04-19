package Driver;

import org.openqa.selenium.chrome.ChromeDriver;


public class driverName {

       public static ChromeDriver setDriver() {
           ChromeDriver newdriver = new ChromeDriver();
           return newdriver;
       }

       public static ChromeDriver driver = setDriver();
}