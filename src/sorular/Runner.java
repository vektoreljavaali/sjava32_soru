package sorular;

public class Runner {

	public static void main(String[] args) {
		
		//islem sýnýfýnda toplama ve çarpma yapan
		//iki method tanýmlanacak ve bu metodlar
		//geriye deðer çevirecekler(Double tipinde) 
		//ayrýca dýþarýdan 2(iki) Double sayý deðeri
		//alabilecekler.
		
		//1-geriye dönen sonuçlarý kullanarak çarpým
		//  deðerinin toplama deðerinin kaç katý olduðunu
		//  ekrana yazdýran programý yapýnýz.
		//  Süre: 15 dk.
		
		double s1=23;
		double s2=5;
		
		islem islemyap = new islem();
		
		double toplaminsonucu = islemyap.topla(s1, s2);
		double carpiminsonucu = islemyap.carp(s1, s2);
		
		System.out.println(carpiminsonucu/toplaminsonucu);
		
		
		
		

	}// Main Method sonu

}// Class Sonu



