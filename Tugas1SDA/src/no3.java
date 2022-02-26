import java.util.ArrayList;

//3. get(0), get(2), get(6), get(-3) --> untuk mengambil elemen pada indeks tertentu

public class no3 {
    public static void main(String[] args) {
        //Membuat nama ArrayList dengan tipe data String
        //String[] nama = {"Z", "A", "N", "I"};
        ArrayList<String> nama = new ArrayList<>();

        //Menambahkan data nama dalam bentuk string
        nama.add("Z");//indeks ke-0
        nama.add("A");//indeks ke-1
        nama.add("N");//indeks ke-2
        nama.add("I");//indeks ke-3

        //Mengambil elemen dari ArrayList
        System.out.println(nama.get(0));//output 'Z' karena yang diambil indeks ke-0 
        System.out.println(nama.get(2));//output 'N' karena yang diambil indeks ke-2
        System.out.println(nama.get(6));//error karena tidak ada indeks ke-6
        System.out.println(nama.get(-3));//error karena tidak ada indeks ke-(-3)

    }
    
}
