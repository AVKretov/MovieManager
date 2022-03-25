package ru.netology;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int currentMoviesLenght = 10;

    public MovieManager() {
    }

    public MovieManager(int currentMoviesLenght) {
        this.currentMoviesLenght = currentMoviesLenght;
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastCell = tmp.length - 1;
        tmp[lastCell] = movie;
        movies = tmp;
    }

    public Movie[] showMovies() {
        int resultLenght = currentMoviesLenght;
        if (movies.length < resultLenght) {
            resultLenght = movies.length;
        }
        Movie[] result = new Movie[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            int cell = movies.length - i - 1;
            result[i] = movies[cell];
        }
        return result;
    }

}