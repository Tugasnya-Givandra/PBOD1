/*
 *	Nama File   : OperasiTitik.java
 *	Pembuat	    : Givandra Haikal Adjie
 *	NIM         : 24060121130063
 *	Tanggal     : Selasa, 7 Maret 2023
 *	Deskripsi   : File untuk realisasi OperasiTitik
*/
// package Pertemuan_2;

class OperasiTitik {

	private Titik refleksiSumbuX(Titik a){
		a.setOrdinat(-a.getOrdinat());
		return a;
	}
	private Titik refleksiSumbuY(Titik a){
        a.setAbsis(-a.getAbsis());
		return a;
	}

	public Titik refleksiX(Titik titik){
		return refleksiSumbuX(titik);
	}
	public Titik refleksiY(Titik titik){
		return refleksiSumbuY(titik);
	}
}