package Summary;

import javax.mail.MessagingException;
import static Summary.bugSummaryTable.formTableBS;
import static Summary.getTableDataBS.countList;
import static Summary.urlSetter.urlList;
import static Summary.urlSetter.urlSet;

public class bugSummaryFlow {
    public static void bugSummaryDataForm() throws MessagingException {
        urlSet();
        formTableBS(countList,urlList);
    }
}
