package latihan2;

public class Kalkulator {
    //attribut - global variable
    String merk;
    int harga;

    //cunstructor (digunakan untuk set atribut + set object)
    //access_modifier, nama_class(parameter)
    public Kalkulator(){
        //default
    }

    public Kalkulator(String merk, int harga){
        //kalau namanya sama pakai this.attribute
        this.merk = merk;
        this.harga = harga;
    }

    //method
    //access_modifier, return_value, nama(parameter)
    public void tambah (int bila, int bilb){
        //local variable
        int hasil = bila + bilb;
        System.out.println(hasil);
    }

    public void printDataAtribut(){
        System.out.println(merk);
        System.out.println(harga);
    }
}
