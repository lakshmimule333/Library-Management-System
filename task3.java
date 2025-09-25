import java.util.*;

class Book {
    int id;
    String title, author;
    boolean available = true;

    Book(int id, String title, String author) {
        this.id = id; this.title = title; this.author = author;
    }

    public String toString() {
        return id + " - " + title + " by " + author + (available ? " (Available)" : " (Issued)");
    }
}

class User {
    int id;
    String name;
    List<Book> issued = new ArrayList<>();

    User(int id, String name) {
        this.id = id; this.name = name;
    }
}

class Library {
    Map<Integer, Book> books = new HashMap<>();
    Map<Integer, User> users = new HashMap<>();

    void addBook(Book b) { books.put(b.id, b); }
    void addUser(User u) { users.put(u.id, u); }
    void showBooks() { books.values().forEach(System.out::println); }

    void issue(int bid, int uid) {
        Book b = books.get(bid); User u = users.get(uid);
        if (b != null && u != null && b.available) {
            b.available = false; u.issued.add(b);
            System.out.println("Book issued");
        } else System.out.println("Issue failed");
    }

    void ret(int bid, int uid) {
        Book b = books.get(bid); User u = users.get(uid);
        if (b != null && u != null && !b.available && u.issued.remove(b)) {
            b.available = true;
            System.out.println("Book returned");
        } else System.out.println("Return failed");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        lib.addBook(new Book(1, "Java Basics", "James Gosling"));
        lib.addBook(new Book(2, "Python Crash Course", "Eric Matthes"));
        lib.addBook(new Book(3, "Clean Code", "Robert C. Martin"));
        lib.addUser(new User(1, "Alice"));
        lib.addUser(new User(2, "Bob"));

        int ch;
        do {
            System.out.println("\n1.Show Books  2.Issue  3.Return  4.Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> lib.showBooks();
                case 2 -> { System.out.print("Book ID: "); int b=sc.nextInt(); System.out.print("User ID: "); int u=sc.nextInt(); lib.issue(b,u); }
                case 3 -> { System.out.print("Book ID: "); int b=sc.nextInt(); System.out.print("User ID: "); int u=sc.nextInt(); lib.ret(b,u); }
                case 4 -> System.out.println("Exit");
                default -> System.out.println("Invalid");
            }
        } while (ch != 4);
        sc.close();
    }
}
