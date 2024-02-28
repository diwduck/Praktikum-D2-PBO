package pertemuan2;

/*
 * File			: MTitik.java        21/02/2024
 * Penulis		: Thoriq Hadiwinata
 * NIM			: 24060122130086
 * Deskripsi	: Kelas yang berisi main dari Titik
 * 
 */

public class MTitik {
	public static void main(String[] args) {
        Titik t1 = new Titik(6, 7);
        Titik t2 = new Titik(3, 6);
        Titik t3 = new Titik(-1, 2);
        System.out.println(String.format("Jumlah Titik: %d", Titik.getCounterTitik()));
        System.out.println(String.format("Titik t1 memiliki absis: %.1f dan ordinat: %.1f", t1.getAbsis(), t1.getOrdinat()));
        System.out.println(String.format("Titik t2 memiliki absis: %.1f dan ordinat: %.1f", t2.getAbsis(), t2.getOrdinat()));
        System.out.println(String.format("Titik t3 memiliki absis: %.1f dan ordinat: %.1f", t3.getAbsis(), t3.getOrdinat()));
        System.out.println(String.format("Titik t1 memiliki jarak pusat: %.1f", t1.getJarakPusat()));
        System.out.println(String.format("Titik t2 memiliki jarak pusat: %.1f", t2.getJarakPusat()));
        System.out.println(String.format("Titik t3 memiliki jarak pusat: %.1f", t3.getJarakPusat()));
        t1.refleksiX(t1);
        System.out.println(String.format("Titik t1 telah direfleksi terhadap sumbu X"));
        System.out.println(String.format("Titik t1 memiliki absis: %.1f dan ordinat: %.1f", t1.getAbsis(), t1.getOrdinat()));
        t1.refleksiY(t1);
        System.out.println(String.format("Titik t1 telah direfleksi terhadap sumbu Y"));
        System.out.println(String.format("Titik t1 memiliki absis: %.1f dan ordinat: %.1f", t1.getAbsis(), t1.getOrdinat()));
        Titik t4 = t2.getRefleksiX();
        System.out.println(String.format("Titik t4 memiliki absis: %.1f dan ordinat: %.1f", t4.getAbsis(), t4.getOrdinat()));
        Titik t5 = t2.getRefleksiY();
        System.out.println(String.format("Titik t5 memiliki absis: %.1f dan ordinat: %.1f", t5.getAbsis(), t5.getOrdinat()));
    }
}
