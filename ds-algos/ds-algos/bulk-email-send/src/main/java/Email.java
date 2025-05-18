import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Properties;
import jakarta.mail.*;
import jakarta.mail.internet.*;
import jakarta.activation.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Email {

    public static void main(String[] args) {
        String excelFilePath = "C:\\Users\\MANOJ SHARMA\\OneDrive\\Desktop\\test.xlsx"; // Update with your file path
        String emailTemplate = "Hi %s,\n" +
                "This is Manoj Sharma from the Reliaable Dollars Colony Phase 2 (RDC2) Management Committee. We’re reaching out to remind you that there’s a pending maintenance due of ₹ %s for your Plot %s.We understand that sometimes payments can get delayed due to various reasons. However, clearing this balance will ensure you continue to benefit from the following essential services:\n" +
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
                Cell amountCell = row.getCell(20);
                Cell plotnoCell = row.getCell(0);
                Cell emailCell = row.getCell(6);

                if (nameCell != null && emailCell != null) {
                    String name = nameCell.getStringCellValue();
                    double amount1 = amountCell.getNumericCellValue();
                    DecimalFormat df = new DecimalFormat("#.##"); // Up to 2 decimal places
                    String amount = df.format(amount1);
                    double plot1 = plotnoCell.getNumericCellValue();
                    String plot = df.format(plot1);
                    String recipientEmail = emailCell.getStringCellValue();

                    String personalizedMessage = String.format(emailTemplate, name, amount, plot);
                    String subject = String.format("Clear Pending Maintenance Dues for Plot no. %s", plot);

                    String attachmentPath1 = "C:\\Users\\MANOJ SHARMA\\OneDrive\\Desktop\\BeforeFeb2024(Before Maintenance).jpg";
                    String attachmentPath2 = "C:\\Users\\MANOJ SHARMA\\OneDrive\\Desktop\\AfterFeb2024(After Maintenance Started).jpg";

                    sendEmailWithAttachments(senderEmail, senderPassword, recipientEmail, "manojsharma.sharma2@gmail.com", subject, personalizedMessage, attachmentPath1, attachmentPath2);

                    //  sendEmailWithAttachment(senderEmail, senderPassword, recipientEmail, subject, personalizedMessage);
                }
            }

            workbook.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sendEmailWithAttachments(String senderEmail, String appPassword, String recipientEmail, String ccEmail, String subject, String messageText, String attachmentPath1, String attachmentPath2) {
        // Set up mail server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        // Authenticate the session
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, appPassword);
            }
        });

        try {
            // Create the email message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            if (ccEmail != null && !ccEmail.isEmpty()) {
                message.setRecipient(Message.RecipientType.CC, new InternetAddress(ccEmail));
            }
            message.setSubject(subject);

            // Create the message body part
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(messageText);

            // Create the first attachment part
            MimeBodyPart attachmentPart1 = new MimeBodyPart();
            attachmentPart1.attachFile(new File(attachmentPath1));

            // Create the second attachment part
            MimeBodyPart attachmentPart2 = new MimeBodyPart();
            attachmentPart2.attachFile(new File(attachmentPath2));

            // Combine the message and attachments into a single multipart message
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentPart1);
            multipart.addBodyPart(attachmentPart2);

            // Set the content of the email
            message.setContent(multipart);

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully to " + recipientEmail + (ccEmail != null ? " with CC to " + ccEmail : ""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

