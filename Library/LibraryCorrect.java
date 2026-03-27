public class LibraryCorrect {
    public static void main(String[] args) {
        
        //Create a Title object
        Title t1 = new Title(1, "Test Title");
        System.out.println("Title object: ");
        System.out.println(t1.toString());

        //Modify Title
        t1.setTitle("Updated Title");
        System.out.println("After update: " + t1.toString());

        //Create a book object
        Book b1 = new Book(2, "IDK", "Arthur");
        Book b2 = new Book(3, "Ikk", "James");
        System.out.println("Book object: ");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println("Author: "+ b1.getAuthor());
        System.out.println("Title (inherited): "+ b1.getTitle());

        //Create a Journal object
        Journal j1 = new Journal(3, "Nature Joournal", "Brad");
        System.out.println("Journal object: ");
        System.out.println(j1);
        System.out.println("Editor: "+ j1.getEditor());
        System.out.println("Title (inherited): "+ j1.getTitle());
        System.out.println();

        //Polymorphism examlpe
        Title[] titles = new Title[3];
        titles[0]=t1;
        titles[1]=b2;
        titles[2]=j1;

        System.out.println("Polymorphism test: ");
        for(Title t : titles){
            System.out.println(t.toString());
        }
    }
}
