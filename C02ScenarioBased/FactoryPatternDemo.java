interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}

class PushNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Push Notification");
    }
}

class NotificationFactory {
    public static Notification getNotification(String type) {
        switch (type.toLowerCase()) {
            case "sms": return new SMSNotification();
            case "email": return new EmailNotification();
            case "push": return new PushNotification();
            default: return null;
        }
    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Notification n = NotificationFactory.getNotification("email");
        n.notifyUser();
    }
}