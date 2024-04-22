import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Druzyna> druzyny = new ArrayList<>();

        druzyny.add(new Druzyna("Śląsk"));
        druzyny.add(new Druzyna("Lech"));
        druzyny.add(new Druzyna("Legia"));

        Mecz slaskLech = new Mecz(druzyny.get(0), druzyny.get(1));
        slaskLech.setWynik("1-1", null);
        druzyny.get(0).dodajMecz(slaskLech);
        druzyny.get(1).dodajMecz(slaskLech);

        Mecz slaskLegia = new Mecz(druzyny.get(0), druzyny.get(2));
        slaskLegia.setWynik("5-0", druzyny.get(0));
        druzyny.get(0).dodajMecz(slaskLegia);
        druzyny.get(2).dodajMecz(slaskLegia);

        Mecz lechLegia = new Mecz(druzyny.get(1), druzyny.get(2));
        lechLegia.setWynik("0-0", null);
        druzyny.get(1).dodajMecz(lechLegia);
        druzyny.get(2).dodajMecz(lechLegia);

        druzyny.sort(new Comparator<Druzyna>() {
            @Override
            public int compare(Druzyna o1, Druzyna o2) {
                return o1.getPunkty() - o2.getPunkty();
            }
        });

        System.out.println(druzyny);

    }
}