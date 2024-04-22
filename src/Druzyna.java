import java.util.ArrayList;
import java.util.Objects;

public class Druzyna {

    private String nazwa;
    private int punkty = 0;
    ArrayList<Mecz> mecze = new ArrayList<Mecz>();

    public Druzyna(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getPunkty() {
        return punkty;
    }

    public void dodajMecz(Mecz mecz) {
        mecze.add(mecz);
        if(mecz.getZwyciezca() == null){
            punkty += 1;
        }
        else if(mecz.getZwyciezca().equals(this)){
            punkty += 3;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Druzyna druzyna = (Druzyna) o;
        return Objects.equals(nazwa, druzyna.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nazwa);
    }

    @Override
    public String toString() {
        return nazwa;
    }
}