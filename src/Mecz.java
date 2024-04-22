public class Mecz {

    private Druzyna druzynaA;
    private Druzyna druzynaB;
    private Druzyna zwyciezca;
    private String wynik;

    public Mecz(Druzyna druzynaA, Druzyna druzynaB) {
        this.druzynaA = druzynaA;
        this.druzynaB = druzynaB;
    }

    public void setWynik(String wynik, Druzyna zwyciezca){
        this.wynik = wynik;
        this.zwyciezca = zwyciezca;
    }

    public String getWynik() {
        return wynik;
    }

    public Druzyna getZwyciezca() {
        return zwyciezca;
    }

    public Druzyna getDruzynaB() {
        return druzynaB;
    }

    public Druzyna getDruzynaA() {
        return druzynaA;
    }
}