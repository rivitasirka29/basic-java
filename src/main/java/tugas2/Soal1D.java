package tugas2;

public class Soal1D {
    public static void main(String[] args) {
        int n = 5;
        String text = "SIRKA";
        //0 % 5 = 0

        for (int i = 0; i < n; i++) {
            for (int numberOfStars = 0; numberOfStars <= i; numberOfStars++) {
                char letter = text.charAt(numberOfStars % text.length());
                System.out.print(letter);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int numberOfStars = n - 1; numberOfStars > i; numberOfStars--) {
                char letter = text.charAt(numberOfStars % text.length());
                System.out.print(letter);
            }
            System.out.println();
        }
    }
}
