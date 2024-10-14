
/**
 * Member class implementation manages members
 */
public class Member {
    private String name;
    private String constituency;
    private String party;
    private String role;


    public Member(String name, String constituency, String party, String role) {
        this.name = name;
        this.constituency = constituency;
        this.party = party;
        this.role = role;
    }

      /**
 * It displays information
 */

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Constituency: " + constituency);
        System.out.println("Party: " + party);
        System.out.println("Role: " + role);
    }

      /**
 * It returns name
 */

    public String getName() {
        return name;
    }
}