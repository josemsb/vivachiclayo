package com.vivachiclayo.directory;

import java.util.ArrayList;
import java.util.List;


public class Emergency {
	public static List<contentItem> ITEMS = new ArrayList<contentItem>();
	 static {
	        // Add 3 sample items.
	        addItem(new contentItem("Emergency", "114","114"));
	        addItem(new contentItem("Firefighters", "113","113"));
	        addItem(new contentItem("Radio Patrulla", "105","105"));
	        addItem(new contentItem("Civil Defense", "(074) 231187","074231187"));
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
