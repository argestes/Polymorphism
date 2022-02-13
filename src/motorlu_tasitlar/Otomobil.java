package motorlu_tasitlar;

public class Otomobil extends KaraTasiti {
    public static final int MAX_KAPI_SAYISI = 8;
    private int kapiSayisi;
    private int yas;

    public Otomobil(int kapiSayisi,
                    Motor motor,
                    int tasitDegeri,
                    int yas) {
        super(motor, tasitDegeri, yas);
        this.kapiSayisi = kapiSayisi;
        this.yas = yas;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    @Override
    public int yillikVergiHesapla() {
        int hacim = motor.hacim;
        int deger = tasitDegeri;

        if (hacim < 1300) {
            if (deger < 40_000) {
                return 518;
            } else if (deger > 40_000 && deger < 70_000) {
                return 570;
            } else if (deger > 70_000) {
                return 622;
            }
        }

        return 3326;
    }
}
