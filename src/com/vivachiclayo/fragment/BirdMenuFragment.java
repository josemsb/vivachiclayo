package com.vivachiclayo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.vivachiclayo.R;
import com.vivachiclayo.content.MenuCategoria;
import com.vivachiclayo.fragment.BirdGridFragment;

public class BirdMenuFragment extends ListFragment {
	 private MenuCategoria.contentItem mItem;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.list, null);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
											
		SampleAdapter adapter = new SampleAdapter(getActivity());
		for (int i = 0; i <  MenuCategoria.ITEMS.size(); i++) {
			mItem = MenuCategoria.ITEMS.get(i);		
			adapter.add(new SampleItem(mItem.texto, getIdentifier(this.getActivity(),mItem.icono)));
		}
		setListAdapter(adapter);
		
	}
		
	public static int getIdentifier(Context context, String name)
	{
	    return context.getResources().getIdentifier(name.substring(0, name.lastIndexOf(".")), "drawable", context.getPackageName());
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
	
	
	@Override
	public void onListItemClick(ListView lv, View v, int position, long id) {
		
		if(position==0)
		{
			Fragment newContent = new InicioFragment();						   
					
			if (newContent != null)
				switchFragment(newContent);
		}
		else
		{
			if(position==1)
			{
				Fragment newContent = new AcercaFragment();						   
				
				if (newContent != null)
					switchFragment(newContent);
			}
			else
			{
				Fragment newContent = new BirdGridFragment();			
				Bundle arg = new Bundle();
				arg.putInt("mPos", position);		    
				newContent.setArguments(arg);		    
						
				if (newContent != null)
					switchFragment(newContent);
			}
							
		}
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
}
