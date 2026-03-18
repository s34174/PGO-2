public class Main {
    public static void main(String[] args) {
        Ksiazka k1= new Ksiazka ("Ksiazka", "Autor",100, true);
        Ksiazka k2= new Ksiazka ("Ksiazka2", "Autor2",150, true);
        Ksiazka k3= new Ksiazka ("Ksiazka3", "Autor3",200, true);
        k1.wypiszInfo();
        k1.wypozycz();
        k1.wypiszInfo();
        k1.zwroc();
        k1.wypiszInfo();
        System.out.println();

        Czytelnik c1 = new Czytelnik("Imie1","Nazwisko1","001");
        Czytelnik c2 = new Czytelnik("Imie2","Nazwisko2","002");
        c1.wypiszDane();
        c1.zwiekszLiczbeWyporzyczen();
        c1.wypiszDane();
        c1.zmniejszLiczbeWyporzyczen();
        c1.wypiszDane();
    }

}
