package tugas2;

public class Soal1DCaraDua {
    public static void main(String[] args) {
        //baris x kolom = 9 x 5
        for (int b = 0; b <= 9; b++) {
            for (int k = 0; k <= 5; k++) {
                if (b == 1 && k == 1 || b == 9 && k == 1) {
                    System.out.println("S");
                    break;
                } else if (b == 2 && k >= 1 && k <= 2 || b == 8 && k >= 1 && k <= 2) {
                    System.out.println("S" + "I");
                    break;
                } else if (b == 3 && k >= 1 && k <= 3 || b == 7 && k >= 1 && k <= 3) {
                    System.out.println("S" + "I" + "R");
                    break;
                } else if (b == 4 && k >= 1 && k <= 4 || b == 6 && k >= 1 && k <= 4) {
                    System.out.println("S" + "I" + "R" + "K");
                    break;
                } else if (b == 5 && k >= 1 && k <= 5) {
                    System.out.println("S" + "I" + "R" + "K" + "A");
                    break;
                }
            }
        }
    }
}
