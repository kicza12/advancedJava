package banki;

public abstract class Agent {
    public void zalogujSieDoBanku(String login, String haslo) {
        String link = this.getLinkDoBanku() + "login: " + login + "haslo: " + haslo;
        System.out.println(link);
    }

    public abstract String getLinkDoBanku();
}
