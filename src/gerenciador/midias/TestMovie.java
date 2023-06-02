package gerenciador.midias;

import java.util.ArrayList;
import java.util.List;

public class TestMovie {
    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();
        Action action = new Action("Ação");

        movies.add(new Movie("Pacific Rim", "Guillermo del Toro", "Amazon adsad", 123, 123,12, action));



        movies.forEach(movie ->{
            System.out.println("Filme: " + movie.toString());
        });

    }
}
