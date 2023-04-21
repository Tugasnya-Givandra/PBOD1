/*
 *	Nama File   : AngkaSialException.java
 *	Pembuat	    : Givandra Haikal Adjie
 *	NIM         : 24060121130063
 *	Tanggal     : Jum'at, 21 April 2023
 *	Deskripsi   : Eksepsi buatan sendiri, menolak masukan angka 13
 *
*/

public class AngkaSialException extends Exception {
	public AngkaSialException() {
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
 }