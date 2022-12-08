package streamy.zadanie1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Movie[] moviesArray = {
                new Movie("The Shining", "horror", 146, LocalDate.of(1980, 1, 1)),
                new Movie("Black Phone", "horror", 109, LocalDate.of(2022, 8, 1)),
                new Movie("Jaws", "thriller", 124, LocalDate.of(1975, 1, 1))
        };

//        List<Movie> movies = Arrays.asList(moviesArray);
//        List<Movie> filmy = movies.stream()
//                .filter(movie -> movie.getDuration() > 20)
//                .filter(movie -> movie.getReleaseDate().getYear() > 2018)
//                .filter(movie -> movie.getType().equals("horror")
//                        .collect(Collectors.toList()));
//        filmy.forEach(System.out::println);


    }
}
