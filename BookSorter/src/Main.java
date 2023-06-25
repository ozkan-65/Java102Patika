import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> book = new TreeSet<>();
        book.add(new Book("İstanbul Hatırası ", 590, "Ahmet Ümit ",
                "2010"));
        book.add(new Book("Bab-ı Esrar", 440, "Ahmet Ümit",
                "2008"));
        book.add(new Book("Suç ve Ceza", 704, "Fyodor Dostoyevski",
                "1866"));
        book.add(new Book("Sefiller", 1724, "Victor Hugo",
                "1862"));
        book.add(new Book("Savaş ve Barış", 1823, "Lev Tolstoy",
                "1869"));

        for(Book b : book) {
            System.out.println(b.getName() + ", " + b.getTotalPage());
        }
    }
}