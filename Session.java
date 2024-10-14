import java.util.ArrayList;
import java.util.List;

/**
 * Session class implementation, Manage sessions 
 */

public class Session {
    private String sessionId;
    private String date;
    private List<Bill> bills;

    public Session(String sessionId, String date) {
        this.sessionId = sessionId;
        this.date = date;
        this.bills = new ArrayList<>();
    }

    /**
 * Adds bills
 */

    public void addBill(Bill bill) {
        bills.add(bill);
    }

      /**
 * it display the informnation
 */

    public void displayInfo() {
        System.out.println("Session ID: " + sessionId);
        System.out.println("Date: " + date);
        for (Bill bill : bills) {
            bill.displayInfo();
        }
    }

      /**
 * it gives session id
 */

    public String getSessionId() {
        return sessionId;
    }
}
