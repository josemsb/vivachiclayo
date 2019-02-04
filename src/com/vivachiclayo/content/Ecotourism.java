package com.vivachiclayo.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Ecotourism {
	public static List<contentItem> ITEMS = new ArrayList<contentItem>();
	 public static Map<String, contentItem> ITEM_MAP = new HashMap<String, contentItem>();
	//ID DEL 41 AL 60
	 static {
		 
	        // Add 3 sample items.
	        addItem(new contentItem("41","Ecotourism", "Pimentel Beach","3"));
	        addItem(new contentItem("42","Ecotourism", "Pómac Forest Historical","3"));
	        addItem(new contentItem("43","Ecotourism", "Puerto Eten","3"));
	        addItem(new contentItem("44","Ecotourism", "Medialuna","3"));
	        addItem(new contentItem("45","Ecotourism", "Chaparri Reserve","3"));
	        addItem(new contentItem("46","Ecotourism", "Mayascon","3"));
	        addItem(new contentItem("47","Ecotourism", "Inca Lagoon","3"));
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
