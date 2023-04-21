/*
 *	Nama File   : Lingkaran.java
 *	Pembuat	    : Givandra Haikal Adjie
 *	NIM         : 24060121130063
 *	Tanggal     : Jum'at, 21 April 2023
 *	Deskripsi   : kelas implementasi IArea berupa
 *					cara menghitung luas lingkaran
*/

// mengambil konstanta yang ada di kelas java.lang.Math
import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jarijari;

	public Lingkaran(double r){
		jarijari = r;
	}

	public double hitungLuas(){
		return PI*jarijari*jarijari;
	}
}