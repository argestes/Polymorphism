package motorlu_tasitlar;

public class KaptiKacti extends MotorluTasit {
    public KaptiKacti(Motor motor, int tasitDegeri, int yas) {
        super(motor, tasitDegeri, yas);
    }

    @Override
    public int yillikVergiHesapla() {
        return 40000;
    }

}
