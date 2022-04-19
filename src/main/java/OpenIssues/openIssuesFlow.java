package OpenIssues;

import javax.mail.MessagingException;

import static Common.getData.count;
import static Common.getData.getCount;
import static Common.sendMail.sendMail;
import static Common.viewClick.changeView;
import static Driver.scrollIssues.scroll;
import static Driver.urlMapper.getUrl;
import static Driver.urlMapper.url;
import static OpenIssues.getTableData.*;
import static OpenIssues.openIssuesTable.formTableOI;
import static Driver.driverName.driver;
import static OpenIssues.openIssuesTable.htmlMsg;

public class openIssuesFlow {
    public static void openIssuesDataForm() throws MessagingException {
            getUrl();
            changeView();
            scroll();
            getCount();
            getContents(count);
            formTableOI(count, issueID, issueTitle, issuePriority, url);
    }
}
