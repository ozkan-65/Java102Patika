import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("İki Şehrin Hikayesi", 464, "Charles Dickens", "1859"));
        books.add(new Book("Yüzüklerin Efendisi", 1026, "J. R. R. Tolkien", "1954–1955"));
        books.add(new Book("Küçük Prens", 	96, "Antoine de Saint-Exupéry", "1943"));
        books.add(new Book("Satranç", 	88, "Stefan Zweig", "1942"));
        books.add(new Book("Simyacı", 184, "Paulo Coelho", "1988"));
        books.add(new Book("Heidi", 136, "Johanna Spyri", "1880"));
        books.add(new Book("Siyah İnci", 104, "Anna Sewell", "1877"));
        books.add(new Book("Savaş Sanatı", 80, "Sun Tzu", "M.Ö. 400"));
        books.add(new Book("Palto", 56, "Nikolay Gogol ", "1842"));
        books.add(new Book("Rüzgarın Gölgesi", 528, "Carlos Ruiz Zafón", "2001"));


        Map<String, String> booksMap = new TreeMap<>();
        books.stream().forEach(book -> booksMap.put(book.getBookName(), book.getAuthorName()));

        ArrayList<Book> books100 = new ArrayList<>();

        books.stream().filter(book -> book.getPageNumber() > 100).forEach(book -> books100.add(book));
        books100.stream().forEach(book -> System.out.println(book.getBookName()));
    }
}