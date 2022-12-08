package interfejsy.zadanie1;

import interfejsy.UserInput;

public interface MovieRepositoryApi  extends UserInput {
    void add(String title, int yearOfRelease);
    void delete(String title);
    Movie[] findAll();
    Movie findByTitle(String title);



}
