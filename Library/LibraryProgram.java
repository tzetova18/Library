public class LibraryProgram {
    public static void main(String[] args) {
        Title library[] = new Title[3];
        
        library[0]= new Title(1, "Nurse");
        library[1]= new Book(2, "The Notebook" ,"Arthur James");
        library[2]= new Journal(3, "Jumanji", "Nolan Brasc");

        for(int i=0; i<=library.length; i++){
            System.out.println(library[i].toString());
        }

    }
}
