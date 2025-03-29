package no.bugs.homework5.task6;

public class NotificationService {
    private final NotificationSender emailSender;
    private final NotificationSender smsSender;

    public NotificationService(NotificationSender emailSender, NotificationSender smsSender) {
        this.emailSender = emailSender;
        this.smsSender = smsSender;
    }

    public void sendEmail(String email, String message) {
        emailSender.send(email, message);
    }

    public void sendSms(String phone, String message) {
        smsSender.send(phone, message);
    }

    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        NotificationSender smsSender = new SmsSender();

        NotificationService ns = new NotificationService(emailSender, smsSender);
        ns.sendEmail("test@test.com", "Hello");
        ns.sendSms("77798778998789789778", "Hello");

    }
}

