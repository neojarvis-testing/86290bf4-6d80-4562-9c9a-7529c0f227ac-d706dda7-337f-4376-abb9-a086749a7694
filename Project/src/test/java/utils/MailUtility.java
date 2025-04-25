package utils;
 
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
 
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
 
public class MailUtility {
    public static void getEmail() {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("ltisharmilamindtree@gmail.com", "huui yqha foak nmvo");
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("ltisharmilamindtree@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ramavatharyadavkanneboina@gmail.com"));
            message.setSubject("Automated Test Report");
 
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Please find the attached test report.");
 
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
 
            messageBodyPart = new MimeBodyPart();
            String filename = System.getProperty("user.dir") + "/reports/Reliance_Report.html";
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    public static void sendEmail(String toEmail, String subject, String messageText, String attachmentPath) {
           final String fromEmail = "ltisharmilamindtree@gmail.com";
           final String password = "huui yqha foak nmvo";
           Properties props = new Properties();
           props.put("mail.smtp.auth", "true");
           props.put("mail.smtp.starttls.enable", "true");
           props.put("mail.smtp.host", "smtp.gmail.com");
           props.put("mail.smtp.port", "587");
           Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
               protected PasswordAuthentication getPasswordAuthentication() {
                   return new PasswordAuthentication(fromEmail, password);
               }
           });
           try {
               Message message = new MimeMessage(session);
               message.setFrom(new InternetAddress(fromEmail));
               message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
               message.setSubject(subject);
               MimeBodyPart messageBodyPart = new MimeBodyPart();
               messageBodyPart.setText(messageText);
               MimeBodyPart attachmentPart = new MimeBodyPart();
               attachmentPart.attachFile(new File(attachmentPath));              
               Multipart multipart = new MimeMultipart();
               multipart.addBodyPart(messageBodyPart);
               multipart.addBodyPart(attachmentPart);
               message.setContent(multipart);
               Transport.send(message);
               System.out.println("Email sent with attachment.");
           } catch (Exception e) {
               e.printStackTrace();
           }
       }public MailUtility() {
    }
}
