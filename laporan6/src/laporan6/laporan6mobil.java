package laporan6;

import chun.Rangka;
import chun.Mesin;

public class Mobil {
	
	public Rangka rangka;
	public Mesin mesin;
	protected String nama;
	
	
	public Mobil() {
		rangka = new Rangka();
		mesin = new Mesin();
		System.out.println("Konstruktor Mobil");
	}
	
	public Mobil(String nama){
		this.nama=nama;
	}

	public void stater(){
		System.out.println("Stater mobil");
	}
}
