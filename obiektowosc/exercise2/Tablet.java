package obiektowosc.exercise2;

public class Tablet extends MobileDevice {
    private String pencilSupport;

    public Tablet(float rozmiarWyswietlacza, int pamiecRam, String cpu, String systemOperacyjny, String typUrzadzenia, String pencilSupport) {
        super(rozmiarWyswietlacza, pamiecRam, cpu, systemOperacyjny, typUrzadzenia);
        this.pencilSupport = pencilSupport;
    }

    public void showDeviceInfo() {
        super.showDeviceInfo();
        System.out.println("Pencil support: " + this.pencilSupport);
    }
}
