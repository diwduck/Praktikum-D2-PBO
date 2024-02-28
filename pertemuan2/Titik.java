package pertemuan2;

/*
 * File			: Titik.java        28/02/2024
 * Penulis		: Thoriq Hadiwinata
 * NIM			: 24060122130086
 * Deskripsi	: Kelas yang berisi atribut dan method dari Titik
 * 
 */

import java.lang.Math;

public class Titik {
	private double absis;
	private double ordinat;
	private static int counterTitik;
	
	public Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	public Titik(double absis, double ordinat){
		this.absis = absis;
		this.ordinat = ordinat;
		counterTitik++;
	}
	
	public void setAbsis(double absis){
		this.absis = absis;
		
	}
	
	public void setOrdinat(double ordinat){
		this.ordinat = ordinat;
		
	}
	
	public double getAbsis(){
		return absis;
	}
	
	public double getOrdinat() {
		return ordinat;
	}
	
	public static int getCounterTitik() {
		return counterTitik;
	}
	
	public double getJarakPusat() {
		return Math.sqrt(absis*absis + ordinat*ordinat);
	}
	
	public void refleksiX(Titik Titik) {
		Titik.ordinat = ordinat*(-1);
	}
	
	public void refleksiY(Titik Titik) {
		Titik.absis = absis*(-1);
	}
	
	public Titik getRefleksiX() {
		return new Titik(this.absis*(-1),this.ordinat);
	}
	
	public Titik getRefleksiY() {
		return new Titik(this.absis*(-1),this.ordinat);
	}	
}