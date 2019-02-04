package com.vivachiclayo.content;

import java.util.ArrayList;
import java.util.List;


public class MenuCategoria {
	 public static List<contentItem> ITEMS = new ArrayList<contentItem>();
	 
	 static {
	        addItem(new contentItem("HOME", "home.png"));	
	        addItem(new contentItem("About Us", "acerca.png"));     
	        addItem(new contentItem("Museums & Archaelo.", "museums.png"));
	        addItem(new contentItem("Cultural Tourism", "cultural.png"));
	        addItem(new contentItem("Ecoturism", "ecoturism.png"));	        
	        addItem(new contentItem("Hotel - Travel Info", "hotel.png"));
	        addItem(new contentItem("Transportation", "trasportation.png"));
	        addItem(new contentItem("Food", "food.pg"));	        
	    }

	    private static void addItem(contentItem item) {
	        ITEMS.add(item);	       
	    }
	 
	 public static class contentItem {
	        public String texto;
	        public String icono;

	        public contentItem(String texto, String icono) {	            
	            this.texto = texto;
	            this.icono = icono;	            
	        }

	        @Override
	        public String toString() {
	            return texto;
	        }
	    }

}
