import java.util.List;
import java.util.ArrayList;

public class Library{
    
    private List<Member> members;
    private List<Title> titles;
    private List<Borrowable> borrowables;

    public Library() {
        members = new ArrayList<>();
        titles = new ArrayList<>();
        borrowables = new ArrayList<>();
    }

    public void addMember(int id, String name) {
        Member m = new Member(id, name);
        members.add(m);
    }

    public void addTitle(Title t) {
        titles.add(t);
    }

    public void addBorrowable(Borrowable b){
        borrowables.add(b);
    }

    public void displayAllMembers(){
        for (Member m : members) {
            System.out.println(m);
        } 
    }

    public void displayAllBorrowables(){
        for (Borrowable b : borrowables) {
            System.out.println(b);
        }
    }

    public void displayBorrowedItems(){
        for (Borrowable b : borrowables) {
            if(!b.isAvailable()){
                System.out.println(b);
            }
        }
    }
}