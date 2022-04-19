package org.example;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;


import static Common.sendMail.sendMail;
import static OpenIssues.openIssuesFlow.openIssuesDataForm;
import static OpenIssues.openIssuesTable.htmlMsg;
import static Summary.bugSummaryFlow.bugSummaryDataForm;
import static Summary.bugSummaryTable.htmlMsg1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MessagingException, javax.mail.MessagingException {
        openIssuesDataForm();
        bugSummaryDataForm();
        sendMail(htmlMsg,htmlMsg1);
    }
}
