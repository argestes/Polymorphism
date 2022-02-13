public class Main {


    public static void main(String[] args) {

        Horoz hayvan1 = new Horoz();
        Hayvan hayvan2 = new Kopek();
        Hayvan hayvan3 = new Hayvan();


        konustur(hayvan1);
        konustur(hayvan2);
        konustur(hayvan3);


    }

    private static void konustur(Hayvan hayvan) {
        hayvan.sesCikar();
    }
}
