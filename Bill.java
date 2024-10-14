/**
 * bill class implementation
 */


public class Bill {
    private String billId;
    private String title;
    private String description;
    private String status;

    public Bill(String billId, String title, String description, String status) {
        this.billId = billId;
        this.title = title;
        this.description = description;
        this.status = status;
    }

      /**
 * Displays informations
 */

    public void displayInfo() {
        System.out.println("Bill ID: " + billId);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
    }

      /**
 * Returns Bill id
 */

    public String getBillId() {
        return billId;
    }
}