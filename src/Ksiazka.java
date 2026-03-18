public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;

    }
    public void wypiszInfo() {
        System.out.println(tytul + " - " + autor + ", stron: " + liczbaStron);
        if (dostepna) {
            System.out.println("Dostepna");
        } else {
            System.out.println("Niedostepna");
        }
    }
    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Wypozyczono");
        } else {
            System.out.println("Nie mozna wypozyczyc");
        }
    }

    public void zwroc() {

        dostepna = true;

        System.out.println("Zwrocono");

    }
    public String getTytul(){
        return tytul;
    }
}

