

import java.util.ArrayList;
import java.util.List;

/**
 *  This class manages the assembly section
 */


public class Assembly {
    private final List<Member> members;
    private List<Session> sessions;
    private List<Bill> bills;

    
    
 /**
 * it gives Assembly
 */

    public Assembly() {
        this.members = new ArrayList<>();
        this.sessions = new ArrayList<>();
        this.bills = new ArrayList<>();
    }

     /**
 * itadd members
 */

    public void addMember(Member member) {
        members.add(member);
    }
    

     /**
 * it add sestions
 */

    public void addSession(Session session) {
        sessions.add(session);
    }


     /**
 * it adds bill
 */

    public void addBill(Bill bill) {
        bills.add(bill);
    }

     /**
 * it display members
 */

    public void displayMembers() {
        for (Member member : members) {
            member.displayInfo();
        }
    }

     /**
 * it displays Sessions
 */

    public void displaySessions() {
        for (Session session : sessions) {
            session.displayInfo();
        }
    }

     /**
 * it Displays bills
 */

    public void displayBills() {
        for (Bill bill : bills) {
            bill.displayInfo();
        }
    }
}