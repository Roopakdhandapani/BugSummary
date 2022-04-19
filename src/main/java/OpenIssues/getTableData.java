package OpenIssues;

import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;
import static Driver.driverName.driver;

public class getTableData {
    public static String id,title,priority;
    public static List<String> issueID=new ArrayList<String>();
    public static List <String> issueTitle=new ArrayList<String>();
    public static List <String> issuePriority=new ArrayList<String>();
    public static void getContents(int count) {
        for (int i=1;i<=count;i++) {
            id = driver.findElement(By.xpath("(//td[@data-column-key='alias'])["+i+"]")).getText(); //SIM_ID
            issueID.add(id);
            title = driver.findElement(By.xpath("(//td[@data-column-key='title'])["+i+"]")).getText(); //SIM_TITLE
            issueTitle.add(title);
            priority = driver.findElement(By.xpath("(//td[@data-column-key='priority'])["+i+"]")).getText(); //SIM_PRIORITY
            issuePriority.add(priority);

        }
    }
}
