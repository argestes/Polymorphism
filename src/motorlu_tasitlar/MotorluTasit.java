package motorlu_tasitlar;

public abstract class MotorluTasit implements Vergilendirilebilir {

    public MotorluTasit(Motor motor, int tasitDegeri, int yas) {
        this.motor = motor;
        this.tasitDegeri = tasitDegeri;
        this.yas = yas;
    }

    @Override
    public final int vergilendir() {
        int vergi = yasaGoreVergiHesapla();
        return vergi;
    }

    public Motor motor;
    protected final int tasitDegeri;
    private int yas;

    public abstract int yillikVergiHesapla();

    final public int yasaGoreVergiHesapla() {
        int i = yillikVergiHesapla();

        if (yas < 5) {
            return i / 2;
        } else {
            float v = i * 1.1f;
            return (int) v;
        }
    }

}
