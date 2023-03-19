/*
 *	Nama File   : PersegiPanjang.java
 *	Pembuat	    : Givandra Haikal Adjie
 *	NIM         : 24060121130063
 *	Tanggal     : Minggu, 19 Maret 2023
 *	Deskripsi   : Class PersegiPanjang yang merupakan turunan dari class Poligon
*/

package org.bangundatar;

import org.poligon.*;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang (double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas () {
        return panjang * lebar;
    }

    public void printInfo () {
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}
