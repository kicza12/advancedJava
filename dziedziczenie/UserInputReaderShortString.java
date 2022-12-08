package dziedziczenie;

import java.util.Scanner;

public class UserInputReaderShortString implements UserInputReader {
    @Override
    public String readUserInput() {
//        Scanner scan = new Scanner(System.in);
//        String shortInput = scan.nextLine();
//
//        if (shortInput.length() > 16)shortInput = shortInput.substring(0, 16);
//        return shortInput; TO SAMO:
        return new Scanner(System.in).nextLine().substring(0,16);
    }

    public UserInputReaderShortString() {
    }
}
