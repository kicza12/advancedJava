package klasyAbstrakcyjne.zadanie2;

public class Student extends Person {
    private String typStudiow;
    private int rokStudiow;
    private int kosztStudiow;

    public Student(String name, String address, String typStudiow, int rokStudiow, int kosztStudiow) {
        super("", "");
        this.typStudiow = typStudiow;
        this.rokStudiow = rokStudiow;
        this.kosztStudiow = kosztStudiow;
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public void setTypStudiow(String typStudiow) {
        this.typStudiow = "zaoczne";
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public int getKosztStudiow() {
        return kosztStudiow;
    }

    public void setKosztStudiow(int kosztStudiow) {
        this.kosztStudiow = 15000;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = 1;
    }

    @Override
    public void showDetails() {
        System.out.println(getName());
        System.out.println(getAddress());
        System.out.println(getKosztStudiow());
        System.out.println(getRokStudiow());
        System.out.println(getTypStudiow());
    }
}
