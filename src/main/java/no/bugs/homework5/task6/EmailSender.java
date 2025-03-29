package no.bugs.homework5.task6;

public class EmailSender implements NotificationSender{
    @Override
    public void send(String recipient, String message) {
        System.out.println("Отправляем email пользователю: " + recipient);
    }
}
