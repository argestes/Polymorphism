package bitwise;

public class Bitwise {

    public static void main(String[] args) {

        int birtane = 0xf;

        /*
         00              0               0000
         01              1               0001
         02              2               0010
         03              3               0011
         04              4               0100
         05              5               0101
         06              6               0110
         07              7               0111
         08              8               1000
         09              9               1001
         10              A               1010
         11              B               1011
         12              C               1100
         13              D               1101
         14              E               1110 = 8 + 4 + 2 + 0
         15              F               1111

         99
        100
         */

        int a = 0xff; // f * 16 + f * 1
        int b = 0b1111_1111;
        int c = 255;


        int q = 0b0001_1010_0100_1010;
        int p = 0b1111_1111_0000_0000;
        // and ________________________
        int w = 0b0001_1010_0000_0000;

    }
}
