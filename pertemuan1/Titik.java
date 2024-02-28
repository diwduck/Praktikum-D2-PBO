package pertemuan1;
/*
 * File			: Titik.java        21/02/2024
 * Penulis		: Thoriq Hadiwinata
 * NIM			: 24060122130086
 * Deskripsi	: Kelas yang berisi atribut dan method dari Titik
 * 
 */

public class Titik {
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double absis, double ordinat){
		this.absis = absis;
		this.ordinat = ordinat;
		counterTitik++;
	}
	
	void setAbsis(double absis){
		this.absis = absis;
		
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat() {
		return ordinat;
	}
	
	static int getCounterTitik() {
		return counterTitik;
	}
	
	
}

