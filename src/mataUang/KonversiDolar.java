package mataUang;

import java.util.Scanner;

public class KonversiDolar {
		public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float rupiah, dolar;
        System.out.print("Masukan Jumlah Dolar = ");
        dolar = masukan.nextFloat();
        rupiah = (float) (dolar*14000);
        
        System.out.println();
        System.out.println("Hasil Konversi = ");
        System.out.println("Dolar = " + rupiah);
	}
}
