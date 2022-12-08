package interfejsy.zadanie1;
//class pojo
public class Movie {
    private String title;
    private int yearOfRelease;

    public Movie(String title, int yearOfRelease) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

}
