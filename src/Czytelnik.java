public class Czytelnik {

    private String imie;
    private String nazwisko;
    private String numerKarty;
    private int liczbaWyporzyczen;

    public Czytelnik(String imie,String nazwisko,String numerKarty){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWyporzyczen = 0;
    }
    public void wypiszDane(){
        System.out.println(imie +""+ nazwisko+",wyporzyczenia:"+liczbaWyporzyczen);
    }
    public void zwiekszLiczbeWyporzyczen(){
        liczbaWyporzyczen++;
    }
    public void zmniejszLiczbeWyporzyczen(){
        if (liczbaWyporzyczen >0){
            liczbaWyporzyczen --;
        }
    }
}
