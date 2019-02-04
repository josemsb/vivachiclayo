package com.vivachiclayo.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Transportation {
	public static List<contentItem> ITEMS = new ArrayList<contentItem>();
	 public static Map<String, contentItem> ITEM_MAP = new HashMap<String, contentItem>();
	//ID DEL 101 AL 120
	 static {
	        // Add 3 sample items.
	        addItem(new contentItem("101","Transportation", "Flight Info","6"));
	        addItem(new contentItem("102","Transportation", "Bus Stations","6"));
	        addItem(new contentItem("103","Transportation", "Taxis & Moto-Taxis","6"));
	        //addItem(new contentItem("104","Transportation", "Taxi Phone Numbers","6"));
	        addItem(new contentItem("105","Transportation", "Combi","6"));
	        addItem(new contentItem("106","Transportation", "Typical Prices","6"));
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
