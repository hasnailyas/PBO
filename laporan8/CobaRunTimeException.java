package laporan8;

public class CobaRunTimeException {

	public static void main(String args[]) {
		try {
			int a[] = new int[2];
			System.out.println("Akses elemen ke empat :" + a[3]);
			}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException terjadi");
		}
		System.out.println("Keluar blok eksepsi");

	}
}
