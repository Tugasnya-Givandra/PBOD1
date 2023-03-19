/*
 *	Nama File   : BujurSangkar.java
 *	Pembuat	    : Givandra Haikal Adjie
 *	NIM         : 24060121130063
 *	Tanggal     : Minggu, 19 Maret 2023
 *	Deskripsi   : Implementasi class Bujursangkar yang merupakan 
                    turunan dari class Poligon yang akan digunakan
                    sebagai member dari class Kubus
*/


package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi) {
        this.panjangSisi = panjangSisi;
        this.setJumlahSisi(4);
    }

    public double hitungLuas() {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi() {
        return panjangSisi;
    }
}
