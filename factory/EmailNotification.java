package in.ganesh.test.factory;

public class EmailNotification implements Notification{

    @Override
    public void sendMessage() {
        System.out.println("Sending Email Notification..");
    }
}
