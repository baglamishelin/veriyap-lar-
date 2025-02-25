package ogrkayıtuygulaması;

import java.util.Scanner;

public class ogruygulama {

	public static void main(String[] args) {
		int secim=-1;
		ogrliste bilbölüm=new ogrliste();
		Scanner scanner=new Scanner(System.in);

		
		
		while(secim!=0) {
			System.out.println();
			System.out.println("bilgisayar bölümü öğrenci kayıt uygulaması");
			System.out.println("1-yeni kayıt");
			System.out.println("2-kayıt sil");
			System.out.println("3-kayıtları listele");
			System.out.println("4-en başarılı öğrenci bilgileri");
		    System.out.println("0- çıkış");
		    System.out.println("seçiminiz");
		    secim=scanner.nextInt();
		    
		    
		    if(secim==1) 
		    	bilbölüm.ekle();
		    else if(secim==2)
		    	bilbölüm.sil();
		    else if(secim==3)
		    	bilbölüm.yazdır();
		    else if(secim==4)
		    	bilbölüm.enbaşarılı();
		    else if(secim==0)
		    	System.out.println("programi sonlandırınız");
		    else {
				System.out.println("hatalı seçim");
			}
		
		}

	}

}
