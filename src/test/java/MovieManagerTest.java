import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.netology.Movie;
import ru.netology.MovieManager;

class MovieManagerTest {

    MovieManager manager = new MovieManager();

    Movie first = new Movie(1, "Гонка со временем", "Драмм");
    Movie second = new Movie(2, "Гениальное ограбление", "Боевик");
    Movie third = new Movie(3, "Тихая ночь", "Ужасы");
    Movie fourth = new Movie(4, "Курорт", "Ужасы");
    Movie fifth = new Movie(5, "Соври мне правду", "Эротика");
    Movie sixth = new Movie(6, "Месть земли", "Боевик");
    Movie seventh = new Movie(7, "Исчезнувщий", "Романтическая комедия");
    Movie eighth = new Movie(8, "Красное уведомление", "Боевик");
    Movie ninth = new Movie(9, "Пылающее море", "Драма");
    Movie tenth = new Movie(10, "Тихий омут", "Драма");
    Movie eleventh = new Movie(11, "Вечные", "Боевик");
    Movie twelve = new Movie(12, "Разлука", "Ужасы");

    @Test
    void shouldShowTenMovies() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        Movie[] expected = new Movie[]{
                twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, manager.showMovies());
    }

    @Test
    void shouldShowAllMovies() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Movie[] expected = new Movie[]{
                tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, manager.showMovies());
    }

    @Test
    void shouldShowMoviesUnderTen() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        Movie[] expected = new Movie[]{
                sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, manager.showMovies());
    }

    @Test
    void shouldShowMoviesBelowTenCurrentMoviesLenght() {

        MovieManager manager = new MovieManager(6);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Movie[] expected = new Movie[]{
                tenth, ninth, eighth, seventh, sixth, fifth};

        assertArrayEquals(expected, manager.showMovies());
    }
}

