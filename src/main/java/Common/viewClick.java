package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Driver.driverName.driver;
import static Driver.driverWait.dWait;

public class viewClick {
    public static void changeView() {
        dWait(5000);
        WebElement viewClick = driver.findElement(By.xpath("//button[@id='create-issue']"));
        String getView = viewClick.getAttribute("data-trigger-split");
        if(getView.equalsIgnoreCase("false")) {
            viewClick.click();
        }
    }
}
