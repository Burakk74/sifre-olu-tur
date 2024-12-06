import java.util.Scanner;
import java.util.Random;
public class SifreOluşturMain {


	
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);  
        Random rastgele = new Random();

        System.out.print("Şifrenin toplam uzunluğunu girin: ");
        int uzunluk = input.nextInt();

        System.out.print("Kaç büyük harf olacak: ");
        int buyukHarfSayisi = input.nextInt();

        System.out.print("Kaç küçük harf olacak: ");
        int kucukHarfSayisi = input.nextInt();

        System.out.print("Kaç rakam olacak: ");
        int rakamSayisi = input.nextInt();

        System.out.print("Kaç özel karakter olacak: ");
        int ozelKarakterSayisi = input.nextInt();

        if (buyukHarfSayisi + kucukHarfSayisi + rakamSayisi + ozelKarakterSayisi != uzunluk) {
            System.out.println("Hata: Karakter sayılarının toplamı, belirtilen uzunluğa eşit değil!");
             
        }
        else {
        	
        	String buyukHarfler = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        	String kucukHarfler = "abcdefghijklmnopqrstuvwxyz";
        	String rakamlar = "0123456789";
        	String ozelKarakterler = "!@#$%^&*()-_=+<>?";
        	
        	StringBuilder sifre = new StringBuilder();
        	
        	for (int i = 0; i < buyukHarfSayisi; i++) {
        		sifre.append(buyukHarfler.charAt(rastgele.nextInt(buyukHarfler.length())));
        	}
        	
        	for (int i = 0; i < kucukHarfSayisi; i++) {
        		sifre.append(kucukHarfler.charAt(rastgele.nextInt(kucukHarfler.length())));
        	}
        	
        	for (int i = 0; i < rakamSayisi; i++) {
        		sifre.append(rakamlar.charAt(rastgele.nextInt(rakamlar.length())));
        	}
        	
        	for (int i = 0; i < ozelKarakterSayisi; i++) {
        		sifre.append(ozelKarakterler.charAt(rastgele.nextInt(ozelKarakterler.length())));
        	}
        	
        	char[] sifreDizisi = sifre.toString().toCharArray();
        	for (int i = 0; i < sifreDizisi.length; i++) {
        		int rastgeleIndeks = rastgele.nextInt(sifreDizisi.length);
        		char gecici = sifreDizisi[i];
        		sifreDizisi[i] = sifreDizisi[rastgeleIndeks];
        		sifreDizisi[rastgeleIndeks] = gecici;
        	}
        	System.out.println("Oluşturulan Şifre: " + new String(sifreDizisi));
        }


		
	}
	
}
