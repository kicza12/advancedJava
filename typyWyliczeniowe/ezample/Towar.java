package typyWyliczeniowe.ezample;

public class Towar {
    private String name;
    private double price;

    public Towar(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        return (int) (this.name.hashCode() * this.price);
    }

    @Override
    public boolean equals(Object obj) {
        return ((Towar)obj).getName().equals(this.getName());
    }
}
