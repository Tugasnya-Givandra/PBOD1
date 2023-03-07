/*
 *	Nama File   : MOperasiTitik.java
 *	Pembuat	    : Givandra Haikal Adjie
 *	NIM         : 24060121130063
 *	Tanggal     : Selasa, 7 Maret 2023
 *	Deskripsi   : Class untuk menggunakan class OperasiTitik
*/
// package Pertemuan_2;

class MOperasiTitik{
	public static void main(String[] args){
		Titik t;
		OperasiTitik op;
		t = new Titik(6, 9);
		op = new OperasiTitik();

		System.out.println("Titik("+t.getAbsis()+", "+t.getOrdinat()+")");
		op.refleksiX(t);
		System.out.println("Titik setelah refleksi sumbu X: titik("+t.getAbsis()+", "+t.getOrdinat()+")");
		op.refleksiY(t);
		System.out.println("Titik setelah refleksi sumbu Y: titik("+t.getAbsis()+", "+t.getOrdinat()+")");
	}
}