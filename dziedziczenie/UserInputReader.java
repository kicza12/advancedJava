package dziedziczenie;

import java.util.Scanner;

public interface UserInputReader {
    public String readUserInput();

    public default String readUserStringInput() {
        return new Scanner(System.in).nextLine();
    }
}

