package SOLID;

public class DIP_02 {

   public interface Notification {
        void doNotify();
    }


    public static class EmailNotification implements Notification {
        @Override
        public void doNotify() {
            System.out.println("Sending notification via email!");
        }
    }

    public static class SMSNotification implements Notification {
        @Override
        public void doNotify() {
            System.out.println("Sending notification via SMS!");
        }
    }


    public static class Employee {
        private Notification notification;

        public Employee(Notification notification) {
            this.notification = notification;
        }

        public void notifyEmployee() {
            notification.doNotify();
        }
    }

    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Employee employee1 = new Employee(email);
        employee1.notifyEmployee(); 

        Notification sms = new SMSNotification();
        Employee employee2 = new Employee(sms);
        employee2.notifyEmployee(); 
    }
}