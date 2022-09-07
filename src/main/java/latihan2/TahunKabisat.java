package latihan2;

public class TahunKabisat {
    public static void main(String[] args) {
        int Tahun = 2000;

        if(Tahun % 400 == 0){
            System.out.println("Tahun kabisat");
        }else if(Tahun % 100 == 0){
            System.out.println("Bukan Tahun Kabisat");
        }else if(Tahun % 4 == 0){
            System.out.println("Tahun Kabisat");
        }else{
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
