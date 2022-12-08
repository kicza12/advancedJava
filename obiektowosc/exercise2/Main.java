package obiektowosc.exercise2;

//Stwórz klasę MobileDevice, która będzie klasą bazową z polami:
//        - rozmiar wyświetlacza
//        - pamięć ram
//        - cpu
//        - system operacyjny
//        - typ urządzenia
//        Stwórz dodatkowo dwie klasy dziedziczące po klasie MobileDevice:
//        - MobilePhone z polami: LTE support
//        - Tablet -> pencil support
//
//        Stwórz metodę w klasie bazowej:
//        - showDeviceInfo, która wyświetli szczegóły urzadzenia
//        - metoda powinna zostać nadpisana w klasach pochodnych (wyświetlenie dodatkowych szczegółów)
public class Main {
    public static void main(String[] args) {
//        INSTANCJA KLASY = obiekt
        MobileDevice laptop = new MobileDevice(24.1f, 12, "Ryzen 5", "Windows", "Laptop");
        MobilePhone telefon = new MobilePhone(1f, 1, "", "", "telefon", true);
        Tablet tablet = new Tablet(1f, 1, "", "", "", "Apple");
//        w ten sposób też można stworzyć obiekt
//        MobileDevice device = (MobileDevice) phone;

        telefon.showDeviceInfo();
        tablet.showDeviceInfo();

    }
}
