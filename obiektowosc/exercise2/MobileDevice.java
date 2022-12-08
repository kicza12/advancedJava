package obiektowosc.exercise2;

public class MobileDevice {
    private float rozmiarWyswietlacza;
    private int pamiecRam;
    private String cpu;
    private String systemOperacyjny;
    private String typUrzadzenia;

    public MobileDevice(float rozmiarWyswietlacza, int pamiecRam, String cpu, String systemOperacyjny, String typUrzadzenia) {
        this.rozmiarWyswietlacza = rozmiarWyswietlacza;
        this.pamiecRam = pamiecRam;
        this.cpu = cpu;
        this.systemOperacyjny = systemOperacyjny;
        this.typUrzadzenia = typUrzadzenia;
    }

    public void showDeviceInfo() {
        System.out.println("Rozmiar wyświetlacza: " + this.rozmiarWyswietlacza);
        System.out.println("Pamięć RAM: " + this.pamiecRam);
        System.out.println("CPU: " + this.cpu);
        System.out.println("System operacyjny: " + this.systemOperacyjny);
        System.out.println("Typ urządzenia: " + this.typUrzadzenia);
    }


}
