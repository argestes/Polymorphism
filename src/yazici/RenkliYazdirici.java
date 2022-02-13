package yazici;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RenkliYazdirici extends EkranaYazdirici {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    private static List<String> colors = List.of(
            ANSI_RED,
            ANSI_GREEN,
            ANSI_YELLOW,
            ANSI_BLUE,
            ANSI_PURPLE,
            ANSI_CYAN
    );

    Random random = new Random();


    @Override
    public void yazdir(String string) {


        for (char c : string.toCharArray()) {
            int i = random.nextInt(colors.size());
            System.out.print(colors.get(i));
            System.out.print(c);
            System.out.print(ANSI_RESET);
        }

        System.out.print("\n");
    }
}
