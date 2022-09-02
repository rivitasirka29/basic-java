package latihan1;

public class JavaVariable {
    public static void main(String[] args) {
        //integer
        byte angka1 = 10;
        short angka2 = 11;
        int angka3 = 12;
        long angka4 = 13L;

        //floating
        float angka5 = 10.5F;
        double angka6 = 10.6;

        //other
        boolean data1 = true;
        char data2 = 'A';

        int angka7 = angka2;

        //casting
        byte angka8 = (byte) angka3;

        float angka9 = (float) angka6;

        System.out.println(angka1);
        System.out.println(angka2);
        System.out.println(angka3);
        System.out.println(angka4);
        System.out.println(angka5);
        System.out.println(angka6);
        System.out.println(data1);
        System.out.println(data2);
    }
}
