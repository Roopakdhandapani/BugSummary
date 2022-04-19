package OpenIssues;

import javax.mail.MessagingException;
import java.util.List;

public class openIssuesTable {
  public static String htmlMsg = "";
    public static void formTableOI(int count, List issueID, List issueTitle, List issuePriority,String url) throws MessagingException {
        String simURL = "https://issues.amazon.com/issues/";
        htmlMsg = htmlMsg.concat("<br><u><b> Bug List \n" +
                "                <br>Open issues grouped by owners\n" +
                "                <br><u><i>Assigned to SDEs -<a href=\""+url+"\">(Filter)</a>");
        htmlMsg = htmlMsg.concat("<table style=\"width:100%\" >\n" +
                "  <tr bgcolor=\"#25BCF0\">\n" +
                "    <th>S.No</th> \n" +
                "    <th>Bug ID</th> \n" +
                "    <th>Title</th> \n" +
                "    <th>Priority</th>\n" +
                "    <th>QA Comments</th>\n" +
                "    </tr>\n");
        for(int m=0;m<count;m++) {

            htmlMsg = htmlMsg.concat(
                    "    <tr>\n" +
                            "    <td align=\"center\">" +(m+1)+ "</td>\n" +
                            "    <td align=\"center\"> <a href="+simURL+issueID.get(m)+">" + issueID.get(m) + "</td>\n" +
                            "    <td align=\"center\">" + issueTitle.get(m) + "</td>\n" +
                            "    <td align=\"center\">" + issuePriority.get(m) + "</td>\n" +
                            "    <td align=\"center\"></td>\n" +
                            "    </tr>\n");
        }
        htmlMsg = htmlMsg.concat("</table>\n");
        System.out.println(htmlMsg);
    }

    }
