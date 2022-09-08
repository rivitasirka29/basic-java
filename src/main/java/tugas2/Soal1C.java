package tugas2;

public class Soal1C {
    public static void main(String[] args) {
        int n, numberOfStars;
        for (n = 5; n < 10; n++) {
            for (numberOfStars = 10; numberOfStars > n; numberOfStars--) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 5 < 10 ?   -> 10 > 5 ? *****
        // 6 < 10 ?   -> 9  > 6 ? ****
        // 7 < 10 ?   -> 8  > 7 ? ***
        // 8 < 10 ?   -> 7  > 8 ? **
        // 9 < 10 ?   -> 6  > 9 ? *
    }
}
