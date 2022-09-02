package Tugas1;

public class Soal1 {
    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 20;

        //membalik nilai angka1 & angka2 - percobaan 1
        int angka3 = angka2;
        int angka4 = angka1;

        System.out.println("angka1 = " + angka3);
        System.out.println("angka2 = " + angka4);

        //membalik nilai angka1 & angka2 - percobaan 2
        System.out.println("angka1 = " + angka2);
        System.out.println("angka2 = " + angka1);

        //solusi kode tanpa menambah variable lain
        int angka5 = angka1 + angka1;
        int angka6 = angka2 - angka1;
        int angka7 = angka1 * 2;
        int angka8 = angka2 / 2;

        System.out.println("angka1 = " + angka5);
        System.out.println("angka2 = " + angka6);
        System.out.println("angka1 = " + angka7);
        System.out.println("angka2 = " + angka8);
    }
}
