package com.vivachiclayo.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GuidesAgencies {
	public static List<contentItem> ITEMS = new ArrayList<contentItem>();
	 public static Map<String, contentItem> ITEM_MAP = new HashMap<String, contentItem>();
	//ID DEL 141 AL 160
	 static {
	        // Add 3 sample items.
	        addItem(new contentItem("141","Guides & Agencies", "Tour Guides","8"));
	        addItem(new contentItem("142","Guides & Agencies", "Travel Agencies","8"));
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
