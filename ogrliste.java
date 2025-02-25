package ogrkayıtuygulaması;

import java.util.Scanner;

public class ogrliste {
ogrnode head=null;
ogrnode tail=null;
ogrnode temp=null;
ogrnode temp2=null;





int numara;
String isim;
String soyad;
double ortalama;
String durum;
int vize;
int fin;
Scanner scanner=new Scanner(System.in);

void ekle() {
	System.out.println("Bilgisayar bölümüne kayıt olacak öğrenci bilgilerini giriniz : ");
	System.out.print("numara : ");
	numara = scanner.nextInt();
	scanner.nextLine(); // Satır sonu karakterini temizlemek için
	System.out.print("ad     : ");
	isim = scanner.nextLine();
	System.out.print("soyad  : ");
	soyad = scanner.nextLine();
	System.out.print("vize   : ");
	vize = scanner.nextInt();
	System.out.print("final  : ");
	fin = scanner.nextInt();

	
	
	ogrnode eleman=new ogrnode(numara, isim, soyad, vize, fin);
	
	if(head==null) {
		head=eleman;
		tail=eleman;
		System.out.println("liste oluşturuldu");
		
	}
	else {
		eleman.next=head;
		head=eleman;
		System.out.println(numara + "numaralı öğrenci bölüme kayıt edildi");
		
	}
}


void sil() {
	if(head==null) {
		System.out.println("liste boş silinecek öğrenci yok");
		
	}
	else {
		System.out.println("silmek istediğiniz numarayı giriniz:");
		numara=scanner.nextInt();
		
		if(numara==head.numara && head.next==null) {
			head=null;
			tail=null;
			System.out.println(numara +"numaralı öğrenci silindi");
		}
		else if(numara==head.numara && head.next!=null) {
			head=head.next;//bunun yerine head=null kulanamayız çunku head nnulla eşitlemek öbürlerini silmek demmektir
			System.out.println(numara +"numaralı öğrenci silindi");
			//head=head.next bu head düğümünün bir sonraki düğümü işaret etmesini sağlar
		}
		else {
			temp = head;
		    temp2 = head;
			
		    while(temp.next!=null) {//son düğüme kadar gell
		    	
		    	if(numara==temp.numara) {// girdiğimiz numara tempe eşit ise temp düğümünü sil
		    		
		    		temp2.next=temp.next;//seçili düğüm silindi
		    		System.out.println(numara +"numaralı öğrenci silindi");
		    	}
		    	}
		    	temp=temp2;// bu kod tempin bir önceki düğümünü tutuyor
		    	temp=temp.next;// son düğüme geldiğinde 
	    		if(numara==temp.numara) {
	    			temp2.next=null;
	    			tail=temp2;// temp2 ye tail atayarak temp silmiş olduk
	    			System.out.println(numara +"numaralı öğrenci silindi");
	    		}
		    	
		    }
			    
			    }
			}

void yazdır() {
	if (head==null) {
		System.out.println("liste bos");
	}
	else {
		temp=head;
		while(temp!=null) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(temp.durum);
			System.out.println(temp.numara);
			System.out.println(temp.ortalama);
			System.out.println(temp.soyad);
			System.out.println(temp.isim);
			System.out.println(temp.fin);
			System.out.println(temp.vize);
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
			temp=temp.next;
			
		}
	}
}

void enbaşarılı() {
	if(head==null) {
		System.out.println("liste boş");
	}
	else 
	{
	temp=head;
	double buyukk=temp.ortalama;// bu değişken tempin ortalamasını tutuyor
	if(buyukk<temp.ortalama) {// eğer temp bir sonrakinin ortalamısnıdan buyukse 
		buyukk=temp.ortalama;//yeni temp ile değiştir
		numara=temp.numara;
		isim=temp.isim;
		soyad=temp.soyad;
		vize=temp.vize;}
		temp=temp.next;
	
	}
	System.out.println("!!!!!!!!!!!!!!!!!!!!!");
	System.out.println("başarılı öğrenci bilgileri");
	System.out.println("numara"+numara);
	System.out.println("isim" + isim);
	System.out.println("soyad" + soyad);
	System.out.println("vize" + vize);
	System.out.println("!!!!!!!!!!!!!!!!!!!!!");
	
}

}
	

			
		




















