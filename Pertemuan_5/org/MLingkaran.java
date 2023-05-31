
/*
 *	Nama File   : MLingkaran.java
 *	Pembuat	    : Givandra Haikal Adjie
 *	NIM         : 24060121130063
 *	Tanggal     : Jum'at, 19 Maret 2023
 *	Deskripsi   : Class yang mengimplementasikan cara menghitung
					luas lingkarang
*/

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan Jari-Jari: ");
		double jarijari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jarijari);
		System.out.println("Luas lingkaran dengan "+
			"jari jari "+jarijari+" satuan adalah "+l.hitungLuas());
	}
}
