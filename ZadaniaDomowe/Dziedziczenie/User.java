package ZadaniaDomowe.Dziedziczenie;

public class User {
    private int id;
    private  String firstName;
    private String lastName;
    private Book[] books = new Book[0];

//2. Posiadać konstruktor przyjmujący id, imię, nazwisko.
//3. Dodaj metodę `addBook(Book book)`, która doda nową książkę do tablicy książek danego użytkownika.
//4. Zaimplementuj możliwość dynamicznej zmiany rozmiaru tablicy.

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addBook (Book book){
        books [books.length + 1] = book;
    }
}
