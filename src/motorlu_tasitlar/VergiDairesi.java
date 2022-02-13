package motorlu_tasitlar;

import yazici.RenkliStream;

import java.util.ArrayList;
import java.util.List;

public class VergiDairesi {
    private final List<MukellefSicili> mukellefler = new ArrayList<>();

    public VergiDairesi(List<MukellefSicili> mukellefler) {
        this.mukellefler.addAll(mukellefler);
    }

    public int toplamVergiHesapla() {
        int total = 0;

        for (int i = 0; i < mukellefler.size(); i++) {
            MukellefSicili mukellefSicili = mukellefler.get(i);

            List<Vergilendirilebilir> mallar = mukellefSicili.getMallar();

            for (int j = 0; j < mallar.size(); j++) {
                Vergilendirilebilir motorluTasit = mallar.get(j);
                total += motorluTasit.vergilendir();
            }
        }

        return total;
    }

    RenkliStream stream = new RenkliStream();
    public void mukellefleriYazdir() {
        for (MukellefSicili mukellefSicili : mukellefler) {
            stream.println(mukellefSicili);
        }
    }
}
