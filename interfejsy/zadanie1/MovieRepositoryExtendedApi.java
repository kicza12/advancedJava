package interfejsy.zadanie1;

import interfejsy.Kalkulator;

public interface MovieRepositoryExtendedApi extends MovieRepositoryApi, Kalkulator {
    void add(Movie movie);
    void deleteAll();


}
