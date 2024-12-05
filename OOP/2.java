import java.util.ArrayList;
import java.util.Date;

class Transaction {
    String transactionName;
    String transactionDate;
    int transactionAmount;

    public Transaction(String name, String date, int amount) {
        this.transactionName = name;
        this.transactionDate = date;
        this.transactionAmount = amount;
    }
}

class OneCardSystem {
    ArrayList<Transaction> transactionHistory = new ArrayList<>();

    public void makePayment(String gateway, int amount, int pin) {
        // Implementation of payment processing
        // Add transaction to the history
        transactionHistory.add(new Transaction(gateway, new Date().toString(), amount));
        System.out.println("Payment successful!");
    }

    public void viewTransactionHistory() {
        // Display transaction history
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println("Name: " + transaction.transactionName +
                    ", Date: " + transaction.transactionDate +
                    ", Amount: " + transaction.transactionAmount);
        }
    }

    public void accessNewsPortal(String userType, String email, String password, String studentID) {
        if (userType.equals("student")) {
            // Implementation for student access
            System.out.println("Student News Portal accessed!");
        } else if (userType.equals("guardian")) {
            // Implementation for guardian access
            System.out.println("Guardian News Portal accessed!");
        } else {
            System.out.println("Invalid user type!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OneCardSystem oneCardSystem = new OneCardSystem();

        // Student
        String studentEmail = "student@example.com";
        String studentPassword = "password";
        oneCardSystem.makePayment("Bkash", 100, 1234);
        oneCardSystem.viewTransactionHistory();
        oneCardSystem.accessNewsPortal("student", studentEmail, studentPassword, "");

        // Guardian
        String guardianID = "GU123456";
        oneCardSystem.accessNewsPortal("guardian", "", "", guardianID);
    }
}
