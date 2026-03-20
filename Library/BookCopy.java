public class BookCopy {
    private int id;
    private boolean available;

    public BookCopy(int id, boolean available){
        setId(id);
        setAvailable(available);
    }

    public BookCopy() {}

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    public boolean getAvailable(){
        return available;
    }

    @Override
    public String toString(){
        return "BookCopy [id=" + id +", available=" + available +"]";
    }
}
