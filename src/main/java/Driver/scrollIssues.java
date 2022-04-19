package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Driver.driverName.driver;

public class scrollIssues {
    public static void scroll() {
        for (int n = 1; n <= 5; n++) {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
            WebElement alertNoIssues = driver.findElement(By.xpath("//div[@data-link=\"visible{:state.pageState == 'initialized' && !state.noResults}\"]"));
            if(alertNoIssues.isDisplayed()) {
                break;
            }
        }
    }
}
