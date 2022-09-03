package Tugas1;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int angka;
        System.out.print("Masukan Bilangan = ");
        angka=input.nextInt();

        //Hasil check ganjil atau genap
        int hitungGanjil = ~(angka % 2);
        int hitungGenap = angka % 2;

        //true = ganjil dan false = genap
        boolean trueFalse = hitungGanjil < 0 || hitungGenap > 0;

        if(trueFalse == true){
            System.out.println("angka " + angka + " adalah bilangan Ganjil = " + trueFalse);
        }else{
            System.out.println("angka " + angka + " adalah bilangan Genap = " + trueFalse);
        }
    }
}
