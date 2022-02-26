import java.util.ArrayList;

//6. add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)
//untuk menambahkan dan/atau menyisipkan suatu char pada indeks yang ditentukan

public class no6 {
    public static void main(String[] args) {
        //Membuat nama ArrayList dengan tipe data String
        //String[] nama = {"Z", "A", "N", "I"};
        ArrayList<String> nama = new ArrayList<>();

        //Menambahkan data nama dalam bentuk string
        nama.add("Z");
        nama.add("A");
        nama.add("N");
        nama.add("I");

        //Menambahkan atau menyisipkan char tertentu pada indeks tertentu
        nama.add(0,"e");//menambahkan char 'e' pada indeks ke-0
        System.out.println("Nama setelah char 'e' ditambahkan\t: "+ nama);

        nama.add(2,"f");//menambahkan char 'f' pada indeks ke-2
        System.out.println("Nama setelah char 'f' ditambahkan\t: "+ nama);

        nama.add(3,"g");//menambahkan char 'g' pada indeks ke-3
        System.out.println("Nama setelah char 'g' ditambahkan\t: "+ nama);

        nama.add(4,"h");//menambahkan char 'h' pada indeks ke-4
        System.out.println("Nama setelah char 'h' ditambahkan\t: "+ nama);

        nama.add(6,"h");//menambahkan char 'h' pada indeks ke-6
        System.out.println("Nama setelah char 'h' ditambahkan\t: "+ nama);

        nama.add(-3,"j");//menambahkan char 'j' pada indeks ke-(-3) -> error(tdk ada indeks -3)
        System.out.println("Nama setelah char 'j' ditambahkan\t: "+ nama);
    }
    
}
