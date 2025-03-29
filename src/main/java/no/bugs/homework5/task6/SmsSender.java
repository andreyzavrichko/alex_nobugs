package no.bugs.homework5.task6;

public class SmsSender implements NotificationSender{
    @Override
    public void send(String recipient, String message) {
        System.out.println("Отправляем смс пользователю: " + recipient);
    }
}
