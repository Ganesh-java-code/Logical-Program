package in.ganesh.test.factory;

public class NotificationFactory {
    public static Notification getNotificationFactory(String channel){
        switch (channel){
            case "SMS":
                 return new SMSNotification();
            case "Email":
                return new EmailNotification();
            default:
                throw new IllegalStateException("Invalid Notification type: " + channel);
        }
    }
}
