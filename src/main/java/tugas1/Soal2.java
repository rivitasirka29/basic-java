package tugas1;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int angka;
        System.out.print("Masukan Bilangan = ");
        angka=input.nextInt();

        //Hasil check ganjil atau genap, pakai perhitungan faktorisasi atau akar pohon
        //Sisa bagi hasil ganjil = 1, genap = 0
        int hitungHasil  = angka % 2;

        //true = ganjil dan false = genap
        boolean trueFalse = hitungHasil > 0;

        if(trueFalse == true){
            System.out.println("angka " + angka + " adalah bilangan Ganjil = " + trueFalse);
        }else{
            System.out.println("angka " + angka + " adalah bilangan Genap = " + trueFalse);
        }
    }
}
