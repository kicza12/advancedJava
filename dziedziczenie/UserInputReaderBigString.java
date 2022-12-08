package dziedziczenie;

import java.util.Scanner;

public class UserInputReaderBigString implements UserInputReader{
    @Override
    public String readUserInput() {
//        Scanner scan = new Scanner(System.in);
//        String bigInput = scan.nextLine(); TO SAMO:
        return new Scanner(System.in).nextLine();
    }
}
