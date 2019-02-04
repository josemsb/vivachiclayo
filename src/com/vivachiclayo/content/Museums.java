package com.vivachiclayo.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Museums {
	public static List<contentItem> ITEMS = new ArrayList<contentItem>();
	 public static Map<String, contentItem> ITEM_MAP = new HashMap<String, contentItem>();
	//ID DEL 1 AL 20
	 static {
	        // Add 3 sample items.
	        addItem(new contentItem("1","Museums & Archeological", "Pómac Forest Historical","1"));
	        addItem(new contentItem("2","Museums & Archeological", "Zaña","1"));
	        addItem(new contentItem("3","Museums & Archeological", "Royal Tombs Museum","1"));
	        addItem(new contentItem("4","Museums & Archeological", "Ventarron","1"));
	        addItem(new contentItem("5","Museums & Archeological", "Huaca Chotuna","1"));
	        addItem(new contentItem("6","Museums & Archeological", "Huaca Rajada","1"));
	        addItem(new contentItem("7","Museums & Archeological", "Túcume","1"));
	        addItem(new contentItem("8","Museums & Archeological", "Pátapo","1"));
	        addItem(new contentItem("9","Museums & Archeological", "Brüning Museum","1"));
	        addItem(new contentItem("10","Museums & Archeological", "Sicán National Museum","1"));
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
