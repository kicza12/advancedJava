package streamy;

import java.util.Optional;

public class Main1 {
    public static void main(String[] args) {
        String tekst = "blabla";
//        ofNullable podaje obiekt który jest nullem
        Optional<String> optional = Optional.ofNullable(tekst);
//        pokaże się tekst jeśli obiekt nie będzie nullem
        optional.ifPresent(a -> {
            System.out.println(a);
        });
        optional.ifPresent(a -> System.out.println(a));
        optional.ifPresent(System.out::println);
//        jeżeli obiekt jest nullem to wyświetli się 'rezultat'
        String rezultat = optional.orElse("alternatywny tekst");

    }
}
