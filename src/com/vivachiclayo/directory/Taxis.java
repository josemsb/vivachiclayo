package com.vivachiclayo.directory;

import java.util.ArrayList;
import java.util.List;


public class Taxis {
	public static List<contentItem> ITEMS = new ArrayList<contentItem>();
	 static {
	        // Add 3 sample items.
	        addItem(new contentItem("Chiclayo Taxi", "(074) 265410","074265410"));
	        addItem(new contentItem("Taxi América", "(074) 787772","074787772"));
	        addItem(new contentItem("Radio Taxi Chiclayo", "(074) 792727","074792727"));
	        addItem(new contentItem("Taxi Pinos de la Plata", "(074) 797241","074797241"));
	        
	        addItem(new contentItem("Taxi Seguro", "(074) 232244","074232244"));
	        addItem(new contentItem("Tours Cruzero", "(074) 791821","074791821"));
	        addItem(new contentItem("Turismo Chiclayo", "(074) 274000","074274000"));
	        addItem(new contentItem("Vega Taxi", "(074) 793388","074793388"));
	        
	        addItem(new contentItem("Taxi El Rey", "(074) 214355","074214355"));
	        addItem(new contentItem("Taxi Peru Tours", "(074) 791821","074791821"));
	        addItem(new contentItem("Turismo Chiclayo", "(074) 769606","074769606"));
	        addItem(new contentItem("Puntual Chiclayo", "(074) 764141","074764141"));
	        
	        addItem(new contentItem("Gallo Taxi", "(074) 252803","074252803"));
	        addItem(new contentItem("Taxi Chiclayo", "(074) 775500","074775500"));
	        addItem(new contentItem("Mister Tours", "(074) 695218","074695218"));
	        addItem(new contentItem("Luz Divina", "(074) 604112","074604112"));
	    }

	    private static void addItem(contentItem item) {
	        ITEMS.add(item);	        
	    }
	 
	 public static class contentItem {
	        public String id;
	        public String textnumber;
	        public String number;
	      
	        public contentItem(String id, String textnumber, String number) {
	            this.id = id;
	            this.textnumber = textnumber;
	            this.number=number;
	        }

	        @Override
	        public String toString() {
	            return id;
	        }
	    }
}
