// Nama file: BangunDatarGeneric.java
// Penulis  : Givandra Haikal Adjie
// NIM      : 24060121130063
// Deskripsi: Kelas BangunDatarGeneric

public class BangunDatarGeneric<TT extends BangunDatar> {
	private TT bangunDatar;

	public void set(TT tipeBangunDatar) {
		bangunDatar = tipeBangunDatar;
	}

	public TT get() {
		return bangunDatar;
	}

	public double hitungKeliling() {
		return bangunDatar.hitungKeliling();
	}
}