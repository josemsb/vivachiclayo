package com.vivachiclayo.directory;

import java.util.ArrayList;
import java.util.List;


public class TravelAgencies {
	public static List<contentItem> ITEMS = new ArrayList<contentItem>();
	 static {
	        // Add 3 sample items.
	        addItem(new contentItem("MOCHE TOURS", "(074) 224637","074224637"," mochetourschiclayo.com.pe","Calle 7 de Enero, Chiclayo","mochetours_chiclayo@hotmail.com"));
	        addItem(new contentItem("TUMI TOURS", "(074) 225371","074225371"," tumitours.com","532 Elias Aguirre St., Chiclayo",""));
	        addItem(new contentItem("DISCOVERY PERU", "(074) 783099","074783099"," discoveryperu.com.pe"," Av. Balta N. 291, Chiclayo","reservas@discoveryperu.com.pe"));
	        addItem(new contentItem("MARAVILLAS TOURS PERU", "(074) 204591","074204591","","Trompeteros – Urb. Federico Villarreal , 319 ","maravillastoursperu@hotmail.com"));	        
	        
	    }

	    private static void addItem(contentItem item) {
	        ITEMS.add(item);	        
	    }
	 
	 public static class contentItem {
	        public String id;
	        public String textnumber;
	        public String number;
	        public String web;
	        public String direccion;
	        public String correo;
	      
	        public contentItem(String id, String textnumber, String number,String web, String direccion, String correo) {
	            this.id = id;
	            this.textnumber = textnumber;
	            this.number=number;
	            this.web = web;
	            this.direccion = direccion;
	            this.correo=correo;
	        }

	        @Override
	        public String toString() {
	            return id;
	        }
	    }
}
