package tugas2;

public class Soal1Dversi2 {
    public static void main(String[] args) {
        int n = 5;
        String text = "SIRKA";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                char letter = text.charAt(j % text.length());
                System.out.print(letter);
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                char letter = text.charAt(j % text.length());
                System.out.print(letter);
            }
            System.out.println();
        }
    }
}
