
public class otonode {
	
	String plaka;
	String marka;
	int model;
	String renk;
	int alısfiyat;
	int satışfiyat;
	String açıklama;
	
	otonode next;

	public otonode(String plaka, String marka, int model, String renk, int alısfiyat, int satışfiyat, String açıklama) {
		
		this.plaka = plaka;
		this.marka = marka;
		this.model = model;
		this.renk = renk;
		this.alısfiyat = alısfiyat;
		this.satışfiyat = satışfiyat;
		this.açıklama = açıklama;
		
		next=null;
	}
	
	
	
	

}
