/*
 *	Nama File   : MPoligon.java
 *	Pembuat	    : Givandra Haikal Adjie
 *	NIM         : 24060121130063
 *	Tanggal     : Minggu, 19 Maret 2023
 *	Deskripsi   : Driver class untuk pertemuan 3, menguji class PersegiPanjang dan Segitiga
*/


package org.main;

import org.bangundatar.PersegiPanjang;
import org.bangundatar.Segitiga;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang :" + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(10, 7);
        segitiga.printInfo();
        System.out.println("Luas Segitiga :" + segitiga.hitungLuas());
    }
}
