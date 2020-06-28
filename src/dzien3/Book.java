package dzien3;

public class Book {
    String author;
    public String title;
    private String isbn;
    protected String pageNumber;

    public void read() {
        System.out.println(title);
    }

    public Book() {
        title = "Lśnienie";
        isbn = "iosoadjoa1";
        pageNumber = "123";
    }

    public Book(String author, String title, String isbn, String pageNumber) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.pageNumber = pageNumber;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.isbn = "";
        this.pageNumber = "";
    }

    @Override
    public String toString() {
        String returnValue = "";
        if (checkIfNotEmpty(author)) {
            returnValue += "author='" + author + '\'' + ", ";
        }
        if (checkIfNotEmpty(title)) {
            returnValue += "title='" + title + '\'' + ", ";
        }
        if (checkIfNotEmpty(isbn)) {
            returnValue += "isbn='" + isbn + '\'' + ", ";
        }
        if (checkIfNotEmpty(pageNumber)) {
            returnValue += "pageNumber='" + pageNumber + '\'' + ", ";
        }
        return returnValue;
    }

    /*
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pageNumber='" + pageNumber + '\'' +
                '}';
     */

    private boolean checkIfNotEmpty(String field) {
        return field != null && !field.isEmpty();
    }
}
