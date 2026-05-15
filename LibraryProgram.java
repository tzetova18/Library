public class LibraryProgram{
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book(1, "Peter Pan", "Tea Zetova");
        Book b2 = new Book(2, "Lord of the Rings", "Elena Petro");

        BookCopy c1 = new BookCopy(101, b1);
        BookCopy c2 = new BookCopy(102, b1);
        BookCopy c3 = new BookCopy(103, b2);

        lib.addBorrowable(c1);
        lib.addBorrowable(c2);
        lib.addBorrowable(c3);

        lib.addMember(10, "Phill");
        lib.addMember(11, "Joanna");

        Member alice = new Member(12, "Alice");

        alice.borrow(c1);
        alice.borrow(c3);
        
        System.out.println("Members: ");
        lib.displayAllMembers();

        System.out.println("Borrowed items: ");
        lib.displayBorrowedItems();
    }
}
