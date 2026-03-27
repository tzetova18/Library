public class Title{

    private int id;
    private String title;

    //Constructs an instance 
    public Title(int id, String title){
       setId(id);
       setTitle(title);
    }

    public Title() {}

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    @Override //Annotation
    public String toString(){
        return "Title [id=" + id +", title=" + title +"]";
    }
}