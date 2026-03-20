public class Journal {
    private String editor;
    
    public Journal(String editor){
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
        return "Journal [editor= " + editor +"]";
    }
}
