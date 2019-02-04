package com.vivachiclayo.directory;

import java.util.ArrayList;
import java.util.List;


public class Guides {
	public static List<contentItem> ITEMS = new ArrayList<contentItem>();
	 static {
	        // Add 3 sample items.
	        addItem(new contentItem("Martha Samillan Rivas", "979619393","979619393","mahesa_22@hotmail.com","Spanish, Alemán"));
	        addItem(new contentItem("María Isabel Larrea Ordoñez", "979942406","979942406","milarreao@hotmail.com","English, Francés, Italian, Portugués, Spanish"));
	        addItem(new contentItem("Sonia Raquel Malca Gordillo", "(074) 238228","074238228","proviatur-peru@hotmail.com","Spanish"));
	        addItem(new contentItem("Regina Cecilia Montenegro Otiniano", "979669202","979669202","ceciliadaniel@hotmail.com","Spanish"));
	        
	        addItem(new contentItem("Sysy Amparo Moreno Silva", "979670775","979670775","sysysilva@hotmail.com","Spanish"));
	        addItem(new contentItem("Pedro Rios Rostaing", "978886686","978886686","pedro.rostaing @ gmail.com","Spanish, English"));
	        addItem(new contentItem("Dorris Paraguez Bances", "970000698","970000698","","Spanish"));
	        addItem(new contentItem("Luis Tello Vega", "979997836","979997836","feuix1811@hotmail.com","Spanish"));
	        
	        addItem(new contentItem("Flor Rojas Tirado", "979609904 ","979609904 ","flor-got@hotmail.com","Spanish"));
	    }

	    private static void addItem(contentItem item) {
	        ITEMS.add(item);	        
	    }
	 
	 public static class contentItem {
	        public String id;
	        public String textnumber;
	        public String number;
	        public String correo;
	        public String idioma;
	      
	        public contentItem(String id, String textnumber, String number, String correo, String idioma) {
	            this.id = id;
	            this.textnumber = textnumber;
	            this.number=number;
	            this.correo = correo;
	            this.idioma=idioma;
	        }

	        @Override
	        public String toString() {
	            return id;
	        }
	    }
}
