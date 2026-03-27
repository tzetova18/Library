public class Member {
    
    private int id;
    private String name;

    private static final int MAX_ON_LOAN = 6;

    public Member(int id, String name){
        setId(id);
        setName(name);
    }

    public Member() {}

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getMaxOnLoan(){
        return MAX_ON_LOAN;
    }

    @Override
    public String toString(){
        return "Member [id=" + id +", name=" + name + "]";
    }
}
