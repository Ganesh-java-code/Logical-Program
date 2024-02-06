package in.ganesh.test.factory;

public class NotificationMain {
    public static void main(String[] args) {
        Notification sms = NotificationFactory.getNotificationFactory("SMS");
        sms.sendMessage();
    }
}
