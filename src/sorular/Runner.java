package sorular;

public class Runner {

	public static void main(String[] args) {
		
		//islem s�n�f�nda toplama ve �arpma yapan
		//iki method tan�mlanacak ve bu metodlar
		//geriye de�er �evirecekler(Double tipinde) 
		//ayr�ca d��ar�dan 2(iki) Double say� de�eri
		//alabilecekler.
		
		//1-geriye d�nen sonu�lar� kullanarak �arp�m
		//  de�erinin toplama de�erinin ka� kat� oldu�unu
		//  ekrana yazd�ran program� yap�n�z.
		//  S�re: 15 dk.
		
		double s1=23;
		double s2=5;
		
		islem islemyap = new islem();
		
		double toplaminsonucu = islemyap.topla(s1, s2);
		double carpiminsonucu = islemyap.carp(s1, s2);
		
		System.out.println(carpiminsonucu/toplaminsonucu);
		
		
		
		

	}// Main Method sonu

}// Class Sonu



