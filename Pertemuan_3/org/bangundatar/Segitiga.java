package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;

    public Segitiga (double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = 3;
    }

    public double hitungLuas () {
        return 1./2 * alas * tinggi;
    }

    public void printInfo () {
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}
