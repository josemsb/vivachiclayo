package com.vivachiclayo.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Food {
	public static List<contentItem> ITEMS = new ArrayList<contentItem>();
	 public static Map<String, contentItem> ITEM_MAP = new HashMap<String, contentItem>();
	//ID DEL 121 AL 140
	 static {
	        // Add 3 sample items.
	        addItem(new contentItem("121","Food", "Entrees","7"));
	        addItem(new contentItem("122","Food", "Bakeries","7"));
	        addItem(new contentItem("123","Food", "Recommended Restaurants","7"));
	        addItem(new contentItem("124","Food", "Fruits","7"));
	        addItem(new contentItem("125","Food", "Desserts","7"));
	        addItem(new contentItem("126","Food", "Sides","7"));
	        addItem(new contentItem("127","Food", "Drinks","7"));
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
