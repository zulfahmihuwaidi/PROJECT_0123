package mataUang;

import java.util.Scanner;

public class KonversiRupiah {
	public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float rupiah, dolar;
        System.out.print("Masukan Jumlah Rupiah = ");
        rupiah = masukan.nextFloat();
        dolar = (float) (rupiah/14000);
        
        System.out.println();
        System.out.println("Hasil Konversi = ");
        System.out.println("Dolar = " + dolar);
	}
	
}
