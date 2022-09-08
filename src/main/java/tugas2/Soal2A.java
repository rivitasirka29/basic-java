package tugas2;

import java.util.Scanner;

public class Soal2A {
    public static void main(String[] args) {
        int satuan = 1;
        int puluhan = 10;
        int ratusan = 100;
        int ribuan = 1000;
        int puluhRibuan = 10000;

        int bilangan = -100;

        if (bilangan == satuan) {
            System.out.println("SATUAN");
        } else if (bilangan == puluhan) {
            System.out.println("PULUHAN");
        } else if (bilangan == ratusan) {
            System.out.println("RATUSAN");
        } else if (bilangan == ribuan) {
            System.out.println("RIBUAN");
        } else if (bilangan == puluhRibuan) {
            System.out.println("PULUH RIBUAN");
        } else {
            System.out.println("INPUT TIDAK VALID");
        }
    }
}

