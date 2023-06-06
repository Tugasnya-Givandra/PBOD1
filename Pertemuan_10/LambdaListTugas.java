
// Nama file: LambdaListTugas.java
// Penulis  : Givandra Haikal Adjie
// NIM      : 24060121130063
// Deskripsi: Menggunakan lambda untuk menampilkan elemen dari objek hashmap
import java.util.*;

public class LambdaListTugas {
    public static void main(String[] args) {
        // inisiasi objek hashmap bernama mahasiswaMap
        Map<String, String> mahasiswaMap = new HashMap<String, String>();

        // memasukkan elemen ke dalam mahasiswaMap dengan key NIM dan value Nama
        mahasiswaMap.put("24060121130063", "Givandra Haikal Adjie");
        mahasiswaMap.put("24060121130064", "Bukan John Doe");
        mahasiswaMap.put("24060121130065", "Mahasiswa Sampel");

        // lambda untuk menampilkan mahasiswaMap
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println(nim + " : " + nama);
        });
    }
}
