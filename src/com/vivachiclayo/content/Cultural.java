package com.vivachiclayo.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cultural {
	public static List<contentItem> ITEMS = new ArrayList<contentItem>();
	 public static Map<String, contentItem> ITEM_MAP = new HashMap<String, contentItem>();
	//ID DEL 21 AL 40
	 static {
	        // Add 3 sample items.
	        addItem(new contentItem("21","Cultural Tourism", "Mercado Modelo","2"));
	        addItem(new contentItem("22","Cultural Tourism", "Dancing & Music","2"));
	        addItem(new contentItem("23","Cultural Tourism", "Book Street","2"));
	        addItem(new contentItem("24","Cultural Tourism", "Lambayeque","2"));
	        addItem(new contentItem("25","Cultural Tourism", "House of Culture","2"));
	        addItem(new contentItem("26","Cultural Tourism", "Eten Artisan Market","2"));
	        addItem(new contentItem("27","Cultural Tourism", "Monsefú Crafts Market","2"));
	        addItem(new contentItem("28","Cultural Tourism", "City Center","2"));
	    }

	    private static void addItem(contentItem item) {
	        ITEMS.add(item);
	        ITEM_MAP.put(item.id, item);
	    }
	 
	 public static class contentItem {
	        public String id;
	        public String categoria;
	        public String subcategoria;  
	        public String idcategoria;  

	        public contentItem(String id, String categoria, String subcategoria,String idcategoria) {
	            this.id = id;
	            this.categoria = categoria;
	            this.subcategoria = subcategoria;
	            this.idcategoria=idcategoria;
	        }

	        @Override
	        public String toString() {
	            return subcategoria;
	        }
	    }
}
