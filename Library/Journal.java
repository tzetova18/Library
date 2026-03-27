public class Journal extends Title{
    private String editor;
    
    public Journal(int id, String title, String editor){
        super(id,title); //calls constructor of the super class
        setEditor(editor);
    }

    public Journal() {}

    public void setEditor(String editor){
        this.editor = editor;
    }

    public String getEditor(){
        return editor;
    }

    @Override
    public String toString(){
        return "Journal [editor= " + editor +", " + super.toString() +"]";
    }
}
