package com.vivachiclayo.fragment;


import com.vivachiclayo.R;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class InicioFragment extends Fragment {
	
	@Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
		getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
		this.getActivity().setTitle("HOME");
        return inflater.inflate(R.layout.inicio_fragment, container, false);
    }
 
	
	
	

}


