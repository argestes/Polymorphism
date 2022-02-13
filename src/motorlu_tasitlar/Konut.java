package motorlu_tasitlar;

public class Konut implements Vergilendirilebilir {

    private final int metrekare;

    public Konut(int metrekare) {
        this.metrekare = metrekare;
    }

    @Override
    public int vergilendir() {
        return metrekare * 10;
    }
}
