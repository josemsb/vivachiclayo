package com.vivachiclayo.fragment;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;

import com.vivachiclayo.R;
import com.vivachiclayo.content.Museums;
import com.vivachiclayo.content.Cultural;
import com.vivachiclayo.content.Ecotourism;
import com.vivachiclayo.content.HotelTravel;
import com.vivachiclayo.content.Transportation;
import com.vivachiclayo.content.Food;

public class BirdGridFragment extends ListFragment {

	public int mPos = -1;	
	private Museums.contentItem mItem;
	private Cultural.contentItem mItem1;
	private Ecotourism.contentItem mItem2;
	private HotelTravel.contentItem mItem4;
	private Transportation.contentItem mItem5;
	private Food.contentItem mItem6;

		
	
	public BirdGridFragment() { }
	
		
	@Override
	public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
	        
	    	        
	        mPos = getArguments().getInt("mPos");
	        
	        if (mPos == -1 && savedInstanceState != null)
	        {
				mPos = savedInstanceState.getInt("mPos");	
	        								
	        }
	        else
	        {	 
	        	//String[] birds = getResources().getStringArray(R.array.categorias);	
	        	//this.getActivity().setTitle(birds[mPos]);
	        	
	        	SampleAdapter adapter = new SampleAdapter(getActivity());	    		    	
	        	switch (mPos) {	 	        	
	    		case 2:	 	    	    			
	    			for (int i = 0; i <  Museums.ITEMS.size(); i++) {
		    			mItem = Museums.ITEMS.get(i);		
		    			adapter.add(new SampleItem(mItem.subcategoria,R.drawable.subcategoria));
		    		}	    			
	    			this.getActivity().setTitle(mItem.categoria);
	    			break;
	    		case 3:
	    			for (int i = 0; i <  Cultural.ITEMS.size(); i++) {
		    			mItem1 = Cultural.ITEMS.get(i);		
		    			adapter.add(new SampleItem(mItem1.subcategoria,R.drawable.subcategoria));
		    		}	    			
	    			this.getActivity().setTitle(mItem1.categoria);
	    			break;	  
	    		case 4:
	    			for (int i = 0; i <  Ecotourism.ITEMS.size(); i++) {
		    			mItem2 = Ecotourism.ITEMS.get(i);		
		    			adapter.add(new SampleItem(mItem2.subcategoria,R.drawable.subcategoria));
		    		}		    		
	    			this.getActivity().setTitle(mItem2.categoria);
	    			break;		    	
	    		case 5:
	    			for (int i = 0; i <  HotelTravel.ITEMS.size(); i++) {
		    			mItem4 = HotelTravel.ITEMS.get(i);		
		    			adapter.add(new SampleItem(mItem4.subcategoria,R.drawable.subcategoria));
		    		}		    			
	    			this.getActivity().setTitle(mItem4.categoria);
	    			break;	
	    		case 6:
	    			for (int i = 0; i <  Transportation.ITEMS.size(); i++) {
		    			mItem5 = Transportation.ITEMS.get(i);		
		    			adapter.add(new SampleItem(mItem5.subcategoria,R.drawable.subcategoria));
		    		}		    			
	    			this.getActivity().setTitle(mItem5.categoria);
	    			break;	
	    		case 7:
	    			for (int i = 0; i <  Food.ITEMS.size(); i++) {
		    			mItem6 = Food.ITEMS.get(i);		
		    			adapter.add(new SampleItem(mItem6.subcategoria,R.drawable.subcategoria));
		    		}		    			
	    			this.getActivity().setTitle(mItem6.categoria);
	    			break;		    	
	    		}	  	        	
    			setListAdapter(adapter);
	        }
	        
	    }
	
		
	 	  	  
	 @Override
	    public void onListItemClick(ListView listView, View view, int position, long id) {
	        super.onListItemClick(listView, view, position, id);
	        	        	         
	        Fragment newContent = new ContenidoFragment();	
			
			Bundle arg = new Bundle();
			arg.putInt("position", position);	
			arg.putInt("mPos",mPos);
			newContent.setArguments(arg);		    
					
			if (newContent != null)
				switchFragment(newContent);
	    }
	 
	 
	 	 
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("mPos", mPos);
	}
	
	// the meat of switching the above fragment
		private void switchFragment(Fragment fragment) {
			if (getActivity() == null)
				return;

			if (getActivity() instanceof ResponsiveUIActivity) {
								
					
				ResponsiveUIActivity ra = (ResponsiveUIActivity) getActivity();
				ra.switchContent(fragment);
			}
		}
	
		
		
		private class SampleItem {
			public String tag;
			public int iconRes;
			
			public SampleItem(String tag, int iconRes) {
				this.tag = tag; 
				this.iconRes = iconRes;
			}
		}

		public class SampleAdapter extends ArrayAdapter<SampleItem> {

			public SampleAdapter(Context context) {
				super(context, 0);
			}

			public View getView(int position, View convertView, ViewGroup parent) {
				if (convertView == null) {
					convertView = LayoutInflater.from(getContext()).inflate(R.layout.row, null);
				}
							
				ImageView icon = (ImageView) convertView.findViewById(R.id.row_icon);
				icon.setImageResource(getItem(position).iconRes);
				TextView title = (TextView) convertView.findViewById(R.id.row_title);
				title.setText(getItem(position).tag);

				return convertView;
			}

		}
		
			

}
