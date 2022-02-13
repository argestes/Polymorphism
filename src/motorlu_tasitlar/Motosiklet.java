package motorlu_tasitlar;

public class Motosiklet extends KaraTasiti {

    public static int MAX_TEKER = 3;
    public static int MIN_TEKER = 2;

    public int getTekerSayisi() {
        return tekerSayisi;
    }

    private final int tekerSayisi;
    private final boolean sepetli;

    public Motosiklet(int tekerSayisi,
                      boolean sepetli,
                      Motor motor,
                      int tasitDegeri,
                      int yas
    ) {
        super(motor, tasitDegeri, yas);
        this.tekerSayisi = tekerSayisi;
        this.sepetli = sepetli;
    }

    @Override
    public int yillikVergiHesapla() {
        int hacim = this.motor.hacim;

        if (hacim > 100 && hacim < 250) {
            return 40_000_000;
        } else if (hacim > 250 && hacim < 650) {
            return 75_000_000;
        } else if (hacim > 650 && hacim < 1200) {
            return 150_000_000;
        } else if (hacim > 1200) {
            return 400_000_000;
        } else {
            return 0;
        }
    }


}
