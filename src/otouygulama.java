import java.util.Scanner;

public class otouygulama {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		otoliste liste=new otoliste();
		
		int secim=-1;
		
		while(secim!=0) {
		System.out.println("1 sil");
		System.out.println("2 ekle");
		System.out.println("3 yazdır");
		System.out.println("0 cıkış");
		System.out.println("4 seçiminiz"); secim=scanner.nextInt();
			
		switch (secim) 
		{
		case 1:liste.ekle();break;
		case 2:liste.sil();break;
		case 3:liste.yazdır();break;
		
		case 0:System.out.println("çıkış");break;
		}
		
		}

	}

}
