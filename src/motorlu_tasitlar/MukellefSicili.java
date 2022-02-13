package motorlu_tasitlar;

import java.util.ArrayList;
import java.util.List;

public class MukellefSicili {

    public List<Vergilendirilebilir> getMallar() {
        return mallar;
    }

    private final List<Vergilendirilebilir> mallar;

    public MukellefSicili(List<Vergilendirilebilir> mallar) {
        this.mallar = mallar;
    }

    public void aracKaydet(MotorluTasit tasit) {
        mallar.add(tasit);
    }

    public List<MotorluTasit> getAraclar() {
        List<MotorluTasit> tasitlar = new ArrayList<>();
        for (Vergilendirilebilir vergilendirilebilir : mallar) {
            if (vergilendirilebilir instanceof MotorluTasit) {
                tasitlar.add((MotorluTasit) vergilendirilebilir);
            }
        }

        return tasitlar;
    }

    @Override
    public String toString() {
        int motosikletSayisi = 0;

        for (int i = 0; i < mallar.size(); i++) {
            Vergilendirilebilir motorluTasit = mallar.get(i);

            // duck typing
            // motorluTasit.getTekerSayisi();

            boolean motosikletMi = motorluTasit instanceof Motosiklet;
            if (motosikletMi) {

                // strongly typed
                // downcasting
                Motosiklet motosiklet = (Motosiklet) motorluTasit;


                motosikletSayisi++;
            }
        }

        return motosikletSayisi + " motosikleti olan bir mukellef";
    }
}
