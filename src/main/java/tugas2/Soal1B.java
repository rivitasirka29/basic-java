package tugas2;

public class Soal1B {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int numberOfStars = 0; numberOfStars <= i; numberOfStars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
