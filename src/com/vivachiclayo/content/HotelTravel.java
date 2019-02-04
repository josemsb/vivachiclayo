package com.vivachiclayo.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HotelTravel {
	public static List<contentItem> ITEMS = new ArrayList<contentItem>();
	 public static Map<String, contentItem> ITEM_MAP = new HashMap<String, contentItem>();
	//ID DEL 81 AL 100
	 static {
	        // Add 3 sample items.
	        addItem(new contentItem("81","Hotel & Travel Info", "Hotels","5"));
	        addItem(new contentItem("82","Hotel & Travel Info", "Hostels","5"));
	        addItem(new contentItem("83","Hotel & Travel Info", "Other","5"));
	        addItem(new contentItem("84","Hotel & Travel Info", "Safety","5"));
	        addItem(new contentItem("85","Hotel & Travel Info", "Phones","5"));
	        addItem(new contentItem("86","Hotel & Travel Info", "Grocery Stores","5"));
	        addItem(new contentItem("86","Hotel & Travel Info", "ATMs","5"));
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
