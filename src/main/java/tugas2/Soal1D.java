package tugas2;

public class Soal1D {
    public static void main(String[] args) {
        int n, numberOfStars;
        for (n = 5; n < 14; n++) {
                switch (n){
                    case 5,13 :
                        System.out.println("S");
                    break;
                    case 6,12 :
                        System.out.println("S" + "I");
                    break;
                    case 7,11 :
                        System.out.println("S" + "I" + "R");
                    break;
                    case 8,10 :
                        System.out.println("S" + "I" + "R" + "K");
                    break;
                    case 9 :
                        System.out.println("S" + "I" + "R" + "K" + "A");
                    break;
                }
        }
    }
}