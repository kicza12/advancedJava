package obiektowosc.exercise2;

public class MobilePhone extends MobileDevice {
    private boolean lteSupport;

    public MobilePhone(float rozmiarWyswietlacza, int pamiecRam, String cpu, String systemOperacyjny, String typUrzadzenia, boolean lteSupport) {
        super(rozmiarWyswietlacza, pamiecRam, cpu, systemOperacyjny, typUrzadzenia);
        this.lteSupport = lteSupport;
    }
//      nadpisywanie klasy - overriding może być zastosowane w ten sposób: ( super....)
    public void showDeviceInfo() {
        super.showDeviceInfo();
        System.out.println("LTE support: " + this.lteSupport);
    }

}
