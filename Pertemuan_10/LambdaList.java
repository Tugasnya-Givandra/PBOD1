// Nama file: LambdaList.java
// Penulis  : Givandra Haikal Adjie
// NIM      : 24060121130063
// Deskripsi: Contoh penggunaan lambda pada ArrayList

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<String>();

        // memasukkan elemen ke dalam ArrayList
        mahasiswaList.add("Givandra Haikal");
        mahasiswaList.add("Bukan John Doe");
        mahasiswaList.add("Mahasiswa Sampel");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> {
            System.out.println(nama);
        });

    }
}
