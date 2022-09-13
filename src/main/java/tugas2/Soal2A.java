package tugas2;

import java.util.Scanner;

public class Soal2A {
    public static void main(String[] args) {
        int n = 10000;

        if(n < 0)
            System.out.println("tidak valid");
        else if ( n < 10)
            System.out.println("satuan");
        else if (n < 100)
            System.out.println("puluhan");
        else if (n < 1000)
            System.out.println("ratusan");
        else if (n < 10000)
            System.out.println("ribuan");
        else if (n < 100000)
            System.out.println("puluh ribuan");
        else
            System.out.println("tidak valid");
    }
}

