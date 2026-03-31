//Create a Book class to manage library books with the following features:
 class Book {
    //attributes
    String title;
    String author;
    //static variable
    static String libraryName="Central Library";
    //final variable
     final int ISBN;
     //parametrized constructor
    Book(String title,String author, int ISBN)
    {
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
    //static method
    static void displayLibraryName(String libraryName)
    {
        System.out.println("Library name:"+libraryName);
    }
    //instance method
    public void displayLibrarydetails()
    {
        if(this instanceof Book)
        {
            System.out.println("title:"+title);
            System.out.println("author:"+author);
            System.out.println("ISBN:"+ISBN);
        }
    }
}
public class LibraryManagementSystem
{
    public static void main(String[] args) {
        Book b=new Book("Effective Java","Joshua Bloch",123456789);
        Book.displayLibraryName("Egmore library");
        b.displayLibrarydetails();
       
    }
}