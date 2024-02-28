package pertemuan2;
/*
 * File			: Garis.java        28/02/2024
 * Penulis		: Thoriq Hadiwinata
 * NIM			: 24060122130086
 * Deskripsi	: Kelas yang berisi atribut dan method dari Garis
 * 
 */

import java.lang.Math;

public class Garis {
	private Titik titikAwal;
	private Titik titikAkhir;
	private static int counterGaris;
	
	public Garis() {
		titikAwal = new Titik(0,0);
		titikAkhir = new Titik(0,0);
		counterGaris++;
	}
	
	public Garis(Titik titikAwal, Titik titikAkhir){
		this.titikAwal = titikAwal;
		this.titikAkhir = titikAkhir;
		counterGaris++;
	}
	
	public void setTitikAwal(Titik titikAwal){
		this.titikAwal = titikAwal;
		
	}
	
	public void setTitikAkhir(Titik titikAkhir){
		this.titikAkhir = titikAkhir;
		
	}
	
	public Titik getTitikAwal(){
		return titikAwal;
	}
	
	public Titik getTitikAkhir() {
		return titikAkhir;
	}
	
	public static int getCounterGaris() {
		return counterGaris;
	}
	
	public double getPanjang() {
		return Math.sqrt(Math.pow((titikAkhir.getAbsis()-titikAwal.getAbsis()),2) + (Math.pow(titikAkhir.getAbsis()-titikAwal.getOrdinat(),2)));
	}
	
	public double getGradien() {
		return (titikAkhir.getOrdinat()-titikAwal.getOrdinat()/titikAkhir.getAbsis()-titikAwal.getAbsis());
	}
	
	public Garis getRefleksiY() {
		return new Garis(titikAwal.getRefleksiY(),titikAkhir.getRefleksiY());
	}
	
	public boolean isTegakLurus(Garis Garis){
        if (this.titikAkhir.getAbsis() == this.titikAwal.getAbsis()){
            return Garis.getTitikAwal().getOrdinat() == Garis.getTitikAkhir().getOrdinat();
        }
        else{
            return this.titikAwal.getOrdinat() == this.titikAkhir.getOrdinat();
        }

    }
}
