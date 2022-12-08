package interfejsy;

import java.util.Scanner;

public interface UserInput {
    public default String getUserInput(){
        Scanner s = new Scanner(System.in);
        return s.next();
    }
}
