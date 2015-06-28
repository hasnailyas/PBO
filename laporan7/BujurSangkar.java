package laporan7;

public class BujurSangkar extends bentuk {
	private float sisi;
	
	public BujurSangkar() {
		sisi = 5;
	}
	public float hitungluas() {
		return sisi*sisi;
	}
	public void tulis(){
		System.out.println("Bujur Sangkar");
	}

}
