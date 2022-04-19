package Summary;

import javax.mail.MessagingException;
import java.util.List;

public class bugSummaryTable {
    public static String htmlMsg1 = "";
    public static void formTableBS(List countList,List urlList) throws MessagingException {
        String arr[]= {"High","Medium","Low","Grand Total"};
        htmlMsg1 = htmlMsg1.concat("<span style=\"font-weight:bold\"><U>Bug Summary</span></U><br>");
        htmlMsg1 = htmlMsg1.concat("Grouped by Priorities and Status.<br>");
        htmlMsg1 = htmlMsg1.concat("<table style=\"width:50%\" >\n" +
                "  <tr bgcolor=\"#deeaf6\">\n" +
                "    <th>Priority</th> \n" +
                "    <th>Open Bugs</th> \n" +
                "    <th>Resolved Bugs</th> \n" +
                "    <th>Overall Bugs</th>\n" +
                "    </tr>\n");
        for(int m=0;m<arr.length;m++) {
        int n=m*3;
            htmlMsg1 = htmlMsg1.concat(
                    "    <tr>\n" +
                            "    <td align=\"center\">" + arr[m] + "</td>\n" +
                            "    <td align=\"center\"> <a href="+urlList.get(n)+">" + countList.get(n)+ "</a></td>\n" +
                            "    <td align=\"center\"> <a href="+urlList.get(n+1)+">" + countList.get(n+1)+ "</a></td>\n" +
                            "    <td align=\"center\"> <a href="+urlList.get(n+2)+">" + countList.get(n+2) + "</a></td>\n" +
                            "    </tr>\n");
        }
        htmlMsg1 = htmlMsg1.concat("</table>\n");
        System.out.println(htmlMsg1);
    }
}
