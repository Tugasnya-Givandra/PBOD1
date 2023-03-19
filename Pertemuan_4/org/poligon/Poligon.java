/*
 *	Nama File   : Poligon.java
 *	Pembuat	    : Givandra Haikal Adjie
 *	NIM         : 24060121130063
 *	Tanggal     : Minggu, 19 Maret 2023
 *	Deskripsi   : Class parent dari class PersegiPanjang dan Segitiga
*/

package org.poligon;

public class Poligon {
    protected int jumlahSisi;

    public Poligon() {}

    public void setJumlahSisi(int sisi) {
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi () {
        return this.jumlahSisi;
    }
}
