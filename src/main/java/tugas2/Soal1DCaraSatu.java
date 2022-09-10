package tugas2;

public class Soal1DCaraSatu {
    public static void main(String[] args) {
        int n, numberOfStars;
        for (n = 5; n < 10; n++) {
            for (numberOfStars = 5; numberOfStars <= n; numberOfStars++) {
                System.out.print("SIRKA");
            }
            System.out.println();
        }
             for (n = 5; n < 10; n++) {
               for (numberOfStars = 10; numberOfStars > n; numberOfStars--) {
                   System.out.print("SIRKA");
               }
               System.out.println();
        }
    }
}
