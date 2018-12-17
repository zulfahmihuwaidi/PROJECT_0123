package mataUang;

import java.util.Scanner;

public class KonversiRupiah {
	public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float rupiah, dolar;
        
        System.out.println("Masukan Jumlah Rupiah dan Dolar = ");
     
        rupiah = masukan.nextFloat();
        dolar = masukan.nextFloat();
        
        rupiah = (float) (dolar*14000);
        dolar = (float) (rupiah/14000);
        
        System.out.println();
        System.out.println("Hasil Konversi = ");
        System.out.println("Dolar = " + dolar);
        System.out.println("Rupiah = " + rupiah);
	}
	
}
