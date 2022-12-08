package vehicle;

public class Main {
    public static void main(String[] args) {
        Car samochod1 = new Car("BMW", 300, 300000d);
        CarSpalinowy samochod2 = new CarSpalinowy("BMW", 300, 30000000d, 40L);
        CarElektryczny samochod3 = new CarElektryczny("Tesla",350,1000000d,10);
        samochod1.otworzDrzwi();
        samochod2.dolejPaliwa();
        samochod3.ladowanieBaterii();
        Car jakiesAuto = new CarSpalinowy("",0,0,0);
        jakiesAuto.otworzDrzwi();
        CarSpalinowy spalinowy = (CarSpalinowy) jakiesAuto;
        spalinowy.dolejPaliwa();
    }
}
