package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static Driver.driverName.driver;
import static Driver.driverWait.dWait;

public class getData {
    public static int count=0;
    public static void getCount() {
        dWait(5000);
        List<WebElement> list= driver.findElements(By.xpath("(//td[@data-column-key='alias'])"));
        count=list.size();
        System.out.println(count);

    }
}
