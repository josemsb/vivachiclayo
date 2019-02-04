package com.vivachiclayo.fragment;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.vivachiclayo.R;
import com.vivachiclayo.directory.Emergency;


public class EmergenciaFragment extends Fragment {
	 private LinearLayout layout;	 
	 private Emergency.contentItem mItem;	 
	 
	 public EmergenciaFragment() {
	    }
		
	 
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	    	getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
			this.getActivity().setTitle(R.string.emergency);
	       
	 }
	    
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	    	
		
		 View rootView =  inflater.inflate(R.layout.agenda_fragment, container, false);
	     layout = (LinearLayout) rootView.findViewById(R.id.contendor);  
	        
		for (int i = 0; i <  Emergency.ITEMS.size(); i++) {
			mItem = Emergency.ITEMS.get(i);	
			
			LinearLayout contenedorAgenda = (LinearLayout)  inflater.inflate(R.layout.contendor_agenda, null, false);
			
		    TextView textTipo = (TextView) contenedorAgenda.findViewById(R.id.textoTipo);
		    TextView textNumero = (TextView) contenedorAgenda.findViewById(R.id.textoNumero);
		    		    		    
		    textTipo.setText(mItem.id);
		    textNumero.setText(mItem.textnumber);
		 
		    ImageButton btnLlamar = (ImageButton) contenedorAgenda.findViewById(R.id.imageLlamada);
		    btnLlamar.setTag(mItem.number);
		    		    		    
		    btnLlamar.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 startActivity(new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+ v.getTag())));		            	
					
				}
			});
		    		 		    
		    layout.addView(contenedorAgenda);    
					
		}	    			

		 return rootView;
    }
 
}
