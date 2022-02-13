package motorlu_tasitlar;

import java.util.ArrayList;
import java.util.List;

public class VergiHesaplama {

    public static void main(String[] args) {

        Motosiklet motosiklet = new Motosiklet(2,
                false,
                new Motor(1300),
                20000,
                5
        );

        Otomobil otomobil = new Otomobil(5,
                new Motor(2500),
                250000,
                5
        );

        Konut konut = new Konut(120);

        int motorVergim = motosiklet.yillikVergiHesapla();
        int otoVergim = otomobil.yillikVergiHesapla();

        int totalVergim = motorVergim + otoVergim;

        System.out.printf("Devlete %d lira vergi verecegim %n", totalVergim );

        List<Vergilendirilebilir> list = new ArrayList<>();

        list.add(motosiklet);
        list.add(otomobil);
        list.add(konut);


        MukellefSicili mukellefSicili = new MukellefSicili(list);

        List<MukellefSicili> mukellefSicilleri = List.of(mukellefSicili);
        VergiDairesi vergiDairesi = new VergiDairesi(mukellefSicilleri);
        int i = vergiDairesi.toplamVergiHesapla();

        System.out.printf("Vergi dairesinin toplam geliri: %d %n", i);


        vergiDairesi.mukellefleriYazdir();
    }
}
