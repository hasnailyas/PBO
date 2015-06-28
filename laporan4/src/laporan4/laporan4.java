package hasna;

public class Laporan4 {
	
		
		public static void main(String[]args){
			
			//if then else dan switch
			
			int skor =76;
			char grade;
			
			if (skor >=90)
			{
				grade ='A';
			} 
			else if (skor >=80)
			{
				grade ='B';
			}
			else if (skor >=60)
			{
				grade ='C';
			}
			else if (skor >=60)
			{
				grade ='D';
			}
			else 
			{
				grade ='F';
			}
			
			System.out.println("Grade = " + grade);
		
			
			int nilai1=1;
			int nilai2=2;
			int hasil;
			boolean kondisi =true;
			hasil = kondisi ? nilai1 : nilai2;
			
			System.out.println(hasil);
			
			
			int bulan = 2;
			int tahun = 2000;
			int jumlahHari = 0;
			
			switch (bulan) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				jumlahHari = 31;
				break;
			case 2:
				if (((tahun % 4 == 0) && ! (tahun % 100 == 0)) || (tahun % 400 == 0))
					jumlahHari = 29;
				else
					jumlahHari = 28;
				break;
				
			default:
					System.out.println("Bulan Salah");
				break;
			}
			System.out.println("Jumlah hari = " + jumlahHari);
				
			//while, do while dan for
			
				int angka = 1;
				while (angka < 5)
				{
					System.out.println("Angka:" + angka);
					angka++;
				}
				
			int count = 1;
			do {
				System.out.println("Count is : " + count);
				count++;
				
			} while (count <=5);
			
		for (int i=1;i<5;i++)
		{
			System.out.println("For 1 :"+i);
		}
		for (int i = 10;i>=-3;i--)
		{
			System.out.println("For 2 : "+ i);
		}
		for (int i =10,j=2;i>=-3 & j<10;i--,j++)
		{
			System.out.println("For 3:" + i +" " + j);
		}
		
		// break, continue dan return
		
		int[] nom1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int item:nom1){
			System.out.println("Angka: "+ item);
		}
		

		
		int[] ang = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		int cari = 12;
		
		int i;
		boolean ketemu = false;
		
		for(i =0; i<ang.length; i++)
		{
			if (ang[i] == cari) {
				ketemu = true;
				break;
			}
		}
		
		if(ketemu)
		{
			System.out.println("ditemukan " + cari +"pada indeks" + i);
		} else {
			System.out.println(cari + "tidak terdapat dalam array");
		}
		
		
		for (int j=0;j<10;j++) {
			int k=0;
		for (;;)
		{
			do{
				if (k==5) break;
				k++;
			} while (k<10);
			break;
		}
		System.out.println("k = "+ k);
		}
		
		//breaklabeldemo
		
		int[][] arrayAngka = {{ 32,87,3,589}, {12,1076,2000,8},{622,127,77,955}};
		int mencari =12;
		
		int n;
		int m = 0;
		keluar:
			for (n =0; n <arrayAngka.length; n++)
			{
				for (m=0;m<arrayAngka[n].length;m++) 
				{
					if (arrayAngka [n][m] == cari){
					break keluar;}
				}
			}
		
		if (ketemu) {
			System.out.println("ketemu  " + mencari + " pada indeks " + n + "," + m);
		}else{
			System.out.println(cari + " tidak terdapat dalam array");
		}
		
		String kalimat = "ular melingkar di pinggir pagar umar";
		
		int maks=kalimat.length();
		int jumlahR =0; 
		
		for (int k=0;k<maks;k++)
		{
			if (kalimat.charAt(k) !='r')
				continue;
			
				jumlahR++;
		}
		System.out.println("ditemukan "+ jumlahR +" huruf r dalam kalimat.");
		
		//continuelabeldemo
		
		String kalimati = "cari kata ini di dalam kalimat";
		String carii = "ini";
		boolean ketemui = false;
		
		int max = kalimati.length() - carii.length();
		
		test:
		for (int a =0;a<=max;a++)
		{
			int l =carii.length();
			int j =a;
			int k =0;
		
			while (l-- !=0) {
				if (kalimat.charAt(j++) != carii.charAt(k++)) {
					continue test;
				}
			}
			ketemu = true;
			break test;
		}
		System.out.println(ketemu ? "Ketemu" : "Tidak ketemu");
	}

}
