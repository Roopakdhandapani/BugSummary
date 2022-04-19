package Common;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

public class sendMail {
    static String start = "<html>\n" +
            "<head>\n" +
            "<style>\n" +
            "table, th, td {\n" +
            "  border: 1px solid black;\n" +
            "  border-collapse: collapse;\n" +
            "}\n" +
            "</style>\n" +
            "</head>\n" +
            "<body>\n" ;
    public static void sendMail(String msg, String msg1) throws AddressException, MessagingException {
        Properties props = new Properties();

        // this will set host of server- you can change based on your requirement
        props.put("mail.smtp.host", "smtp.amazon.com");


        Session session = Session.getDefaultInstance(props);
        try {
            Calendar calender = Calendar.getInstance();
            calender.add(Calendar.DATE, 0);
            DateFormat Years = new SimpleDateFormat("yyyy-MM-dd");
            String todayDate = Years.format(calender.getTime());
            System.out.println(todayDate);

            // Create object of MimeMessage class
            Message message = new MimeMessage(session);
            System.out.println(todayDate);

            // Set the from address
            message.setFrom(new InternetAddress("no-reply-report@amazon.com"));

            // Set the recipient address
            // message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(name+"@amazon.com"));
            //message.addRecipient(Message.RecipientType.CC, new InternetAddress("@amazon.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("droo@amazon.com"));

            // Add the subject link
            message.setSubject("Bug Report of "+todayDate);

            //Add last part to the msg
            msg = start + msg + msg1 +
                    "<br>Note: This is an automated email , please don't reply to this email.<br> " + "<br> Regards," + "<br> AIX Team" +
                    "</body>\n" +
                    "</html>";

            System.out.println(msg);


            // set the content
            message.setContent(msg, "text/html");

            // finally send the email
            Transport.send(message);

            System.out.println("=====Email Sent=====");

        } catch (javax.mail.MessagingException e) {

            throw new RuntimeException(e);

        }
    }
}
