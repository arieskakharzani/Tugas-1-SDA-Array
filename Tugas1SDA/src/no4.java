import java.util.ArrayList;

//4. indexOf(a), indexOf(c), indexOf(q) --> untuk mencari indeks dari char yang ditentukan

public class no4 {
    public static void main(String[] args) {
        //Membuat nama ArrayList dengan tipe data String
        //String[] nama = {"Z", "A", "N", "I"};
        ArrayList<String> nama = new ArrayList<>();

        //Menambahkan data nama dalam bentuk string
        nama.add("Z");
        nama.add("A");
        nama.add("N");
        nama.add("I");

        //Mencari indeks dari char yang diminta
        System.out.println(nama.indexOf("a"));//error karena tidak ada char 'a' pada data
        System.out.println(nama.indexOf("c"));//error karena tidak ada char 'c' pada data
        System.out.println(nama.indexOf("q"));//error karena tidak ada char 'q' pada data
    }
    
}
