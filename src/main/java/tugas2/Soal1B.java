package tugas2;

public class Soal1B {
    public static void main(String[] args) {
        int n, numberOfStars;
        for (n = 5; n < 10; n++) {
            for (numberOfStars = 5; numberOfStars <= n; numberOfStars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 5 < 10 ?   -> 5 <= 5 ? *
        // 6 < 10 ?   -> 6 <= 6 ? **
        // 7 < 10 ?   -> 7 <= 7 ? ***
        // 8 < 10 ?   -> 8 <= 8 ? ****
        // 9 < 10 ?   -> 9 <= 9 ? *****
    }
}
