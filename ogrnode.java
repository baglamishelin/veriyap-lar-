package ogrkayıtuygulaması;

import java.util.Scanner;

public class ogrnode {
int numara;
String isim;
String soyad;
double ortalama;
String durum;
int vize;
int fin;
ogrnode next;

public ogrnode(int numara,String isim,String soyad,int vize,int fin) {
	this.numara=numara;
	this.isim=isim;
	this.soyad=soyad;
	this.vize=vize;
	this.fin=fin;
	ortalama=vize*0.4+fin*0.6;
	if(ortalama>50) {
		durum="geçti";}
	else {
			durum="kaldı";
		}
				
	
	next=null;
}


}
