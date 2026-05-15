public class Book extends Title{
    private String author;

    public Book(int id, String title, String author){
        super(id,title);
        setAuthor(author);
    }

    public Book() {}

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    } 

    @Override
    public String toString(){
        return "Book [author= " + author + ", " + super.toString() + "]";
    } 
}