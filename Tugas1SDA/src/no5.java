import java.util.ArrayList;

//5. remove(0), remove(3), remove(2) --> untuk menghilangkan char pada indeks tertentu

public class no5 {
    public static void main(String[] args) {
        //Membuat nama ArrayList dengan tipe data String
        //String[] nama = {"Z", "A", "N", "I"};
        ArrayList<String> nama = new ArrayList<>();

        //Menambahkan data nama dalam bentuk string
        nama.add("Z");//indeks ke-0
        nama.add("A");//indeks ke-1
        nama.add("N");//indeks ke-2
        nama.add("I");//indeks ke-3

        //ArrayList sebelum di remove
        System.out.println("ArrayList sebelum di remove\t: ");
        for(String var: nama){
            System.out.println(var);
       }

       //remove char dari indeks yang diminta
       //ArrayList setelah di remove
       System.out.println("ArrayList setelah di remove\t: ");
       System.out.println(nama.remove(0));
       System.out.println(nama.remove(3));
       System.out.println(nama.remove(2));
       }
   
    }
    
