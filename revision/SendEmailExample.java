import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

public class SendEmailExample {
    public static void main(String[] args) {
        final String email = "@gmail.com";
        final String password = "password";
        
        String toEmail = "receiver@gmail.com";
        Properties emailProperties = new Properties();
        emailProperties.put("mail.smtp.auth", "true");
        emailProperties.put("mail.smtp.starttls.enable", "true");
        emailProperties.put("mail.smtp.host", "smtp.gmail.com");
        emailProperties.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(emailProperties, new Authenticator(){
            protected PasswordAuthentication getpaPasswordAuthentication(){
                return new PasswordAuthentication(email, password);
            }
        });
        
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("This is sample email from java");
            message.setText("This is sample text of email");
            
            Transport.send(message);
            
            System.out.println("Email Send Successfully");
        }catch(Exception err){
            System.err.println("Error is "+err);
        }
    }
}
