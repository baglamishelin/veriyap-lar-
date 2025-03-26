package yeniiiiveriyapısı;

import java.util.Scanner;

public class listeyapısı {
	node head=null;
	node tail=null;
	
	void başaekle(int data) {
		node eleman=new node();
		eleman.data=data;
		 if(head==null) {
			 eleman.next=null;
			 head=eleman;
			 tail=eleman;
			 System.out.println("ilk eleman eklendi"+eleman.data);
		 }
		 else {
			 eleman.next=head;
			 head=eleman;
			 System.out.println("başa yeni eleman eklendi"+eleman.data);
		 }
	}
	

	void arayaekle(int indis,int data) {
		
		node eleman=new node();
		eleman.data=data;
		
		if(head==null && indis==0 ) {
			eleman.next=head;
			head=eleman;
			tail=eleman;
			eleman.next=null;
		}
		else if(indis==0&& head!=null) {
			 eleman.next=head;
			 head=eleman;
		}
		else {
		    node temp=head;
		    node temp2=head;
		    int n=0;
		    while(temp.next!=null) {
		    	temp2=temp;
		    	temp=temp.next;
		    	n++;
		    }
		    if(indis==n) {
		    	temp2.next=eleman;
		    	eleman.next=temp;
		    	
		    }else {
		    	temp=head;
		    	temp2=head;
		    	int i=0;
		    	while(i!=indis) {
		    		temp2=temp;
		    		temp=temp.next;
		    		i++;
		    	}  
		    	temp2.next=eleman;
		    	eleman.next=temp;
		    	
		    }
		}
		
	}
	void sonaekle(int data) {
		node eleman=new node();
		eleman.data=data;
		if(head==null) {
			eleman.next=head;
			head=eleman;
			tail=eleman;
			eleman.next=null;
			System.out.println("sondan ilk eleman eklendi");
			
		}else {
			tail.next=eleman;
			tail=eleman;
			eleman.next=null;
			System.out.println("birsonraki sondan eklendi");
		}
	}
	

	
	
  void bastansil(){
	  if(head==null) {
		  System.out.println("liste boş silinecek eleman yok");
	  }
	  else if(head.next==null) {
		  head=null;
		  tail=null;
		  System.out.println("listedeki son eleman da silindi");
	  }else {
		  head=head.next;
		  System.out.println("baştan eleman silindi");
	  }
  }
  
	void listeyiyazdır() {
		node temp=new node();
		if(head==null) {
			System.out.println("listede eleman yok");
		}else {
			 temp=head;
			 while(temp!=null) {
				 System.out.print(temp.data+">");
				temp=temp.next;
			 }
		}
		
	}
	
     void sondansil() {
    	 if(head==null) {
    		 System.out.println("listede eleman  yok");
    	 }else if(head.next==null) {
    		 head=null;
    		 tail=null;
    	 }
    	 else {
    		 node temp=head;
    		 node temp2=head;
    		 while(temp.next!=null) {
    			 temp2=temp;
    			 temp=temp.next;
    		 }
    		 temp2.next=null;
    		 tail=temp2;
    	 }
     }
     
     void aradansil(int indis) {
    	 if(head==null) {
    		 System.out.println("silinecek eleman yok");
    	 }
    	 else if(head!=null&&indis==0) {
    		 head=null;
    		 tail=null;
    		 System.out.println("silinecek tek eleman da silindi");
    	 }
    	 else {
    		 node temp=head;
    		 node temp2=head;
    		 int i=0;
    		 while(temp.next!=null) {
    			 temp2=temp;
    			 temp=temp.next;
    			 i++;
    		 }
    		 if(indis==i) {
    			 temp2.next=null;
    			 temp2=tail;
    		 }else {
    			 temp=head;
    			 temp2=head;
    			 int j=0;
    			 while(j<indis) {
    				 temp2=temp;
    				 temp=temp.next;
    				 j++;
    			 }
    			 temp2.next=temp.next;
    			 
    			 
    			 
    		 }
    		 
    	 }
     }

}






















