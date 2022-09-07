package latihan2;

public class While {
    public static void main(String[] args) {
        int bila = 10000000;
        int counter = 0;
        while (bila > 0){
            System.out.println(bila);
            bila = bila /2;
            counter++;
        }

        System.out.println("counter = " + counter);
    }
}
