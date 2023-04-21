/*
 *	Nama File   : BangunDatar.java
 *	Pembuat	    : Givandra Haikal Adjie
 *	NIM         : 24060121130063
 *	Tanggal     : Jum'at, 21 April 2023
 *	Deskripsi   : Abstract class dari bangun datar
*/

public abstract class BangunDatar{
	protected double luas;

	public abstract double hitungLuas(double sisi);

	public void setLuas(double l){
		luas = l;
	}

	public double getLuas(){
		return luas;
	}
}