import java.util.ArrayList;

public class Reader {
    String nameOfReader, faculty, dateOfBirth, bookName;
    int numberOfTheReaderTicket, tel;

    public Reader( String bookName, String nameOfReader){
        this.bookName = bookName;
        this.nameOfReader = nameOfReader;
    }

    public Reader( int numberOfTheReaderTicket, int tel, String faculty, String dateOfBirth){
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.numberOfTheReaderTicket = numberOfTheReaderTicket;
        this.tel = tel;
    }
    public static void takeBook(int countBook, String nameOfReader){
        System.out.print(nameOfReader + " взяв " + countBook + " книги: ");
    }
    public static void takeBook(String bookName){

        System.out.print(bookName + " ");
    }

    public static  void returnBook(int countBook, String nameOfReader){
        System.out.println();
        System.out.print(nameOfReader + " повернув " + countBook + " книги");
    }

}
