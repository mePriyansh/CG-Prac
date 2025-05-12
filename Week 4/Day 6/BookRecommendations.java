import java.util.*;
import java.util.stream.*;

class Book {
    String title;
    String author;
    String genre;
    double rating;

    public String getGenre() { return genre; }
    public double getRating() { return rating; }
    public String getTitle() { return title; }
}

class BookRecommendation {
    String title;
    double rating;

    public BookRecommendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public double getRating() { return rating; }
}

class BookRecommendations {
    public List<BookRecommendation> recommendBooks(List<Book> books) {
        return books.stream()
                .filter(b -> b.getGenre().equals("Science Fiction") && b.getRating() > 4.0)
                .map(b -> new BookRecommendation(b.getTitle(), b.getRating()))
                .sorted(Comparator.comparingDouble(BookRecommendation::getRating).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }
}
