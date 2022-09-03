package Tugas1;

public class Soal1C {
    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 20;

        //Soal no. 1A
        angka1 = angka1 - angka2;
        angka2 = angka2 + angka1;
        angka1 = angka2 - angka1;

        System.out.println("angka1 = " + angka1);
        System.out.println("angka2 = " + angka2);
    }
}
