package klasyAbstrakcyjne.zadanie2;

public abstract class Person {
    private String name;
    private String address;

    public Person() {
    this.name = "";
    this.address = "";
    }

    public Person(String name, String address) {
    this.name = name;
    this.address = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Julia";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = "Katowice";
    }
    public abstract void showDetails();
}
