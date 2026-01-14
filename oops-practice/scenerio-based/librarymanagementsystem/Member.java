package librarymanagementsystem;

public class Member extends User {

    private String memberType; // "Student" or "Staff"

    public Member(String id, String name, String memberType) {
        super(id, name);
        this.memberType = memberType;
    }
    

    public String getMemberType() {
        return memberType;
    }
}
