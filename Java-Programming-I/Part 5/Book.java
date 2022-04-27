
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared){
        if (this.getClass() != compared.getClass()){
            return false;
        }
        Book book = (Book) compared;
        if (this.name.equals(book.name) && this.publicationYear == book.publicationYear){
            return true;
        }
        return false;
    }
}
