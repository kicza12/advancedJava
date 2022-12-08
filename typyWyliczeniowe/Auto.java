package typyWyliczeniowe;

public enum Auto {
    ELEKTRYCZNE("Tesla"), SPALINOWE("BMW"), LATAJACE("Samolot"), PLYWAJACE("Statek");
    private String marka;

    Auto(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return this.marka;
    }
}
