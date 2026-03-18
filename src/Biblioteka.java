public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }
    public void dodajKsiazke(Ksiazka k) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = k;
            liczbaKsiazek++;
        }
    }
    public void wypiszDostepneKsiazki() {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i] != null) {
                ksiazki[i].wypiszInfo();
            }
        }
    }
    public Ksiazka znajdzKsiazke(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }
    public void wypozyczKsiazke(String tytul, Czytelnik c) {
        Ksiazka k = znajdzKsiazke(tytul);
        if (k != null) {
            k.wypozycz();
            c.zwiekszLiczbeWyporzyczen();
        } else {
            System.out.println("Nie znaleziono ksiazki");
        }
    }
    public void zwrocKsiazke(String tytul, Czytelnik c) {
        Ksiazka k = znajdzKsiazke(tytul);
        if (k != null) {
            k.zwroc();
            c.zmniejszLiczbeWyporzyczen();
        }
    }
}