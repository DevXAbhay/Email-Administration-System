package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        // Create a new email account
        Email em1 = new Email("Abhay", "Arora");

        // Show information
        System.out.println(em1.showInfo());
    }
}
