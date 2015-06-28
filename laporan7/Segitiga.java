package laporan7;

public abstract class Segitiga extends bentuk {
	protected float alas;
	protected float tinggi;
	
	public Segitiga() {
		alas = 5;
		tinggi = 5;
	}
	
	public float hitungluas() {
		return (alas*tinggi)/2;
	}

}
