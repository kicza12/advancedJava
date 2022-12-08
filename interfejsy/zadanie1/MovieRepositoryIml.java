package interfejsy.zadanie1;

public class MovieRepositoryIml implements MovieRepositoryApi {
    private int capacity;
    private int numberOfMovies = 0;
    private Movie[] movies;

    public MovieRepositoryIml(int capacity) {
        this.capacity = capacity;
        this.movies = new Movie[capacity];
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public int findIndexByTitle(String title) {
        for (int i = 0; i < numberOfMovies; i++) {
            if (movies[i].getTitle().equals(title)) return i;
        }
        return -1;
    }

    @Override
    public void add(String title, int yearOfRelease) {
        if (numberOfMovies < capacity) {
            movies[numberOfMovies++] = new Movie(title, yearOfRelease);
        } else {
            System.out.println("There is no more space in the repository!");
        }
    }


    @Override
    public void delete(String title) {
        int position = findIndexByTitle(title);
        if (position >= 0) {
            for (int i = position; i < numberOfMovies - 1; i++) {
                movies[i] = movies[i + 1];
            }
            movies[numberOfMovies--] = null;
        } else System.out.println("There is no movie with such title.");
    }

    @Override
    public Movie[] findAll() {
        return movies;
    }

    @Override
    public Movie findByTitle(String title) {
        for (int i = 0; i < numberOfMovies; i++) {
            if (movies[i].getTitle().equals(title)) return movies[i];
        }
        return null;
    }
}

