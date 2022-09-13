package tugas2;

public class Soal1C {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int numberOfStars = n; numberOfStars > i; numberOfStars--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
