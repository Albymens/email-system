package EmailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("John", "Smith");
        System.out.println(" ");
        email1.setMailboxCapacity(200);
        System.out.println(email1.displayDetails());
    }
}