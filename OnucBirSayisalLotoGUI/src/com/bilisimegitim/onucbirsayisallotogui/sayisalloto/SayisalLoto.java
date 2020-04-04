package com.bilisimegitim.onucbirsayisallotogui.sayisalloto;

import java.util.Arrays;
import java.util.Random;

public class SayisalLoto {
	
	public static final int MINDEGER =1; // Bunlar degismeyecek degerler oldugu icin buraya yazdik.
	public static final int MAXDEGER =49;//final degistirilemey anlaminda
	public static final int ARRAY_BOY =6;
	
	public int[] arrayOlustur() 
	
	{
		
		int[] sayilar = new int[ARRAY_BOY];
		
		
		int sayi =0;
		
		//Arrayin Tüm Elemanlarina Sayi Dolduracak
		for (int i = 0; i < sayilar.length; i++) {
			
			
			do {
				
				sayi = rastgeleSayiOlustur();
				
			} while (arraydeVarmi(sayi,sayilar));
			
			sayilar[0] = sayi;
			
			
		}
		
		Arrays.parallelSort(sayilar);
		return sayilar;  //Stringlerde null,int lerde 0 yazilacak kod bitene kadar.Hata almamak icin
		
	}
	
	
	
	private int rastgeleSayiOlustur()
	{
		
		Random rand = new Random();
		return rand.nextInt(MAXDEGER)+1;
		
	}
	
	private boolean arraydeVarmi(int p_sayi,int[] p_array)
	{
		// Arrays.binarySearch kullanmanin sarti arrayin sirali olmasi
		//oldugu icin önce siraliyoruz.
		Arrays.sort(p_array); // Arrayi siraladik
		int sonuc =Arrays.binarySearch(p_array, p_sayi);
		
		if (sonuc >=0) {
			return true;
			
		} else {
			return false;

		}
		
		
		
	}
	
	
	
	
	

}
