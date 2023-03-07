/*
 *	Nama File   : Titik.java
 *	Pembuat	    : Givandra Haikal Adjie
 *	NIM         : 24060121130063
 *	Tanggal     : Selasa, 28 Februari 2023
 *	Deskripsi   : File untuk realisasi class Titik
*/
// package Pertemuan_2;

class Titik {
    private double absis; //absis
    private double ordinat; //ordinat
    static int counterTitik = 0; //penghitung objek titik yang telah dibuat

    Titik() {
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }
    Titik(double absis, double ordinat) {
        counterTitik++;
        this.absis = absis;
        this.ordinat = ordinat;
    }
    Titik(double absisOrdinat) {
        counterTitik++;
        this.absis = absisOrdinat;
        this.ordinat = absisOrdinat;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }
}
