import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class EmailSender {

    public static void main(String[] args) {
        String excelFilePath = "C:\\Users\\MANOJ SHARMA\\OneDrive\\Desktop\\test.xlsx"; // Update with your file path
        String emailTemplate = "Hi %s,\n" +
                "This is Manoj Sharma from the Reliaable Dollars Colony Phase 2 (RDC2) Management Committee. We’re reaching out to remind you that there’s a pending maintenance due of ₹ %s for your *Plot %s.We understand that sometimes payments can get delayed due to various reasons. However, clearing this balance will ensure you continue to benefit from the following essential services:\n" +
                "\n" +
                "Regular maintenance payments ensure access to essential services like:\n" +
                "\n" +
                "\uD83D\uDD10 24/7 Security Services\n" +
                "\uD83D\uDDD1️  Garbage Collection\n" +
                "\uD83D\uDCA7 Water Supply from the Layout’s Borewell\n" +
                "\uD83C\uDF33 Timely plot cleaning and upkeep\n" +
                "\uD83D\uDC68\u200D\uD83D\uDD27 Society Manager Assistance (for plumbing, electricity, and general upkeep)\n" +
                "\uD83C\uDFE1 Access to Common Facilities like the Clubhouse and Other Amenities\n" +
                "\n" +
                "Why Regular Maintenance is Essential – A Quick Example:\n" +
                "\n" +
                "These improvements were possible due to regular contributions from owners. Timely maintenance ensures we keep our layout clean, secure, and well-managed for everyone.\n" +
                "\n" +
                "Please note that access to amenities, including the clubhouse and other common areas, is available only to residents who are up to date with their maintenance payments. These facilities are maintained by contributions collected through monthly maintenance.\n" +
                "Additionally, an NOC from the association is mandatory for any plot resale or property transactions. The new owner can only be onboarded to MyGate and gain access to layout services after clearing the pending dues.\n" +
                "\n" +
                "For Investors:\n" +
                "If you are holding the plot as an investment, maintaining a clean, well-managed layout with essential services will increase the value of your property. Buyers are more likely to pay a better price for plots in a gated community that is well-maintained and secure.\n" +
                "\n" +
                "We kindly request your support in clearing the balance to keep our layout well-maintained, secure, and thriving for everyone. \uD83D\uDE4F\n" +
                "Feel free to reach out if you need any assistance with the payment process.\n" +
                "\n" +
                "Thank you,\n" +
                "Manoj Sharma\n" +
                "RDC2 MC Team\n" +
                "\uD83D\uDCE7 association.rdcphase2@gmail.com\n" +
                "\uD83D\uDCDE +91 7013212814";
        String senderEmail = "manojsharma4594@gmail.com";
        String senderPassword = "lkrt yhrf frsr wneb";

        try {
            FileInputStream fileInputStream = new FileInputStream(excelFilePath);
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Skip header row

                Cell nameCell = row.getCell(2);
                Cell amountCell = row.getCell(22);
                Cell plotnoCell = row.getCell(0);
                Cell emailCell = row.getCell(8);

                if (nameCell != null && emailCell != null) {
                    String name = nameCell.getStringCellValue();
                    String recipientEmail = emailCell.getStringCellValue();

                    String personalizedMessage = String.format(emailTemplate, amountCell, plotnoCell);
                    sendEmail(senderEmail, senderPassword, recipientEmail, "Personalized Email", personalizedMessage);
                }
            }

            workbook.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sendEmail(String senderEmail, String senderPassword, String recipientEmail, String subject, String messageText) {
        String host = "smtp.gmail.com";
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            message.setSubject(subject);
            message.setText(messageText);

            Transport.send(message);
            System.out.println("Email sent successfully to: " + recipientEmail);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
