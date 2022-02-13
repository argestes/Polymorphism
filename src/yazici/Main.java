package yazici;

import java.io.OutputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        Yazici yazici = new RenkliYazdirici();
//        yazici.yazdir("Selam benim adim Sevval");


        RenkliStream renkliStream = new RenkliStream();

        PrintStream printStream = System.out;


        renkliStream.println("Selam");
        renkliStream.print("Selam\n");
        printStream.println("Selam");
    }



}
