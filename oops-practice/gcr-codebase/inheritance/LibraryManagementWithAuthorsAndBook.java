//Library Management with Books And Authors
class Book // super class
{
    protected String title;
    protected int publicationYear;

    Book(String title,int publicationYear)
    {
        this.title=title;
        this.publicationYear=publicationYear;
    }
}
//subclass
class Author extends Book {
    public String name;
    public String bio;
    Author(String title, int publicationYear,String name, String bio)
    {
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;
    }

    void displayInfo() {
        System.out.println("Title of the book:" + title);
        System.out.println("PublicationYear of the book:" + publicationYear);
        System.out.println("Author of the book:" + name);
        System.out.println("Biography of the book:" + bio);

    }
}
    public class LibraryManagementWithAuthorsAndBook{

    public static void main(String[] args) {
        Author a = new Author("The Secret",2000,"Rhone Bonde","A book full of manifestation");
        a.displayInfo();
    }
}