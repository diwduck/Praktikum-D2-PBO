package pertemuan2;
/*
 * File			: MGaris.java        28/02/2024
 * Penulis		: Thoriq Hadiwinata
 * NIM			: 24060122130086
 * Deskripsi	: Kelas yang berisi main dari Garis
 * 
 */

public class MGaris {
		public static void main(String[] args) {
			Garis garis1 = new Garis(new Titik(-2, 5), new Titik(7, -4));
	        System.out.printf("Titik 1 pada garis 1 berada pada koordinat (%.2f, %.2f)\n",garis1.getTitikAwal().getAbsis(), garis1.getTitikAwal().getOrdinat());
	        System.out.printf("Titik 2 pada garis 1 berada pada koordinat (%.2f, %.2f)\n",garis1.getTitikAkhir().getAbsis(), garis1.getTitikAkhir().getOrdinat());
	        System.out.printf("Panjang garis 1: %f\n", garis1.getPanjang());
	        System.out.printf("Gradien garis 1: %f\n", garis1.getGradien());
	
	        Garis garis2 = garis1.getRefleksiY();
	        System.out.printf("Titik 1 pada garis 2 berada pada koordinat (%.2f, %.2f)\n",garis2.getTitikAwal().getAbsis(), garis2.getTitikAwal().getOrdinat());
	        System.out.printf("Titik 2 pada garis 2 berada pada koordinat (%.2f, %.2f)\n",garis2.getTitikAkhir().getAbsis(), garis2.getTitikAkhir().getOrdinat());
	        System.out.printf("Panjang garis 2: %f\n", garis2.getPanjang());
	        System.out.printf("Gradien garis 2: %f\n", garis2.getGradien());
	        System.out.printf("Apakah garis 1 dan garis 2 tegak lurus: %b\n", garis1.isTegakLurus(garis2));
	
	        Garis garis3 = new Garis(new Titik(-2, 6), new Titik(3, 6));
	        Garis garis4 = new Garis(new Titik(6, 1), new Titik(6, 9));
	        System.out.printf("Apakah garis 3 dan garis 4 tegak lurus: %b\n", garis3.isTegakLurus(garis4));
    }
}
