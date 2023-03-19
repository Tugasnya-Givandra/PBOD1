/*
 *	Nama File   : Kubus.java
 *	Pembuat	    : Givandra Haikal Adjie
 *	NIM         : 24060121130063
 *	Tanggal     : Minggu, 19 Maret 2023
 *	Deskripsi   : Impementasi class Kubus yang menggunakan class BujurSangkar
                    sebagai membernya
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan) {
        this.permukaan = permukaan;
    }

    public double hitungVolume() {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi*panjangSisi*panjangSisi;
    }

    public double hitungLuasAlas() {
        return permukaan.hitungLuas();
    }
}
