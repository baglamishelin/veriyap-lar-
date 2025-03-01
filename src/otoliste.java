
import java.util.Scanner;
class otoliste {
	Scanner scanner=new Scanner(System.in);
	otonode head=null;
	otonode tail=null;
	
	String plaka;
	String marka;      ///
	int model;         //
	String renk;       //
	int alısfiyat;
	int satışfiyat;
	String açıklama;
	
	
	void ekle() {
		otonode araç=new otonode(plaka, marka, model, renk, alısfiyat, satışfiyat, açıklama);
		System.out.println("plaka:");      plaka=scanner.nextLine();
		System.out.println("marka:");      marka=scanner.nextLine();
		System.out.println("model:");      model=scanner.nextInt();
		System.out.println("renk:");       renk=scanner.nextLine();
		System.out.println("alışfiyat:");  alısfiyat=scanner.nextInt();
		System.out.println("satışfiyat:"); satışfiyat=scanner.nextInt();
		System.out.println("açıklama:");   açıklama=scanner.nextLine();
	
		
		if(head==null) {
			System.out.println("araç yok");
			head=araç;
			tail=araç;
			tail.next=head;
		}
		else {
			araç.next=head;
			head=araç;
			tail.next=head;
			System.out.println(plaka +":plakalı araç eklendi");
		}
		
	}
	
	void sil() {
		
		if(head==null) {
			System.out.println("liste boş");
		}
		
		else {
			System.out.println("silmek istediğinız araç");
			plaka=scanner.nextLine();
			scanner.nextLine();
			
			 if(head==tail && head.plaka.equals(plaka)) {
				 System.out.println("silindi");
				 head=null;
				 tail=null;
				 
				
			}else if(head!=tail && head.plaka.equals(plaka)) {
				System.out.println("seçtiğiğniz silind");
				head=head.next;
				tail.next=head;
				
				
			}else {
				otonode temp=head;
				otonode temp2=temp;
				
				while(temp!=tail)
				{
					if (temp.plaka.equals(plaka)) {// Eğer şu anki düğümün plakası aranan plakaya eşitse:
						
						temp2.next=temp.next;// Önceki düğümün 'next' işaretçisini şu anki düğümün sonrasına yönlendir.
						System.out.println(plaka +"plakalı araç"+temp.satışfiyat +"tlye satıldı");
						
					}
					
						// Döngüden çıktıktan sonra, son düğümü kontrol eden ikinci bir koşul var:
				
				temp2=temp;
				temp=temp.next;
				}
			
				
				if (temp.plaka.equals(plaka)) {
					temp2.next=temp.next;
					System.out.println(plaka +"plakalı araç"+temp.satışfiyat +"tlye satıldı");
				   tail.next=head;
				}
			
			
			
		}
		
		
		}}
	
    void yazdır() {
    	if(head==null) {
    		System.out.println("galeride araç yok");
    	}
    	else {
    		otonode temp=head;
    		
    		while(temp!=tail) {
    			System.out.println(temp.plaka+"plaka"+"**"+temp.marka+"marka"+"**"+temp.model+"model"+"**"+temp.renk+"renk"+"**"+temp.alısfiyat+"alışfiyat"+"**"+temp.açıklama+"açıklama");
    		    temp=temp.next;
    		
    		}
    		System.out.println(temp.plaka+"plaka"+"**"+temp.marka+"marka"+"**"+temp.model+"model"+"**"+temp.renk+"renk"+"**"+temp.alısfiyat+"alışfiyat"+"**"+temp.açıklama+"açıklama");
    		
    	}
    	
    	
    }

    
    
}
	
	

















