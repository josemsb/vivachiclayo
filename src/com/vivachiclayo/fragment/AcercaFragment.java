package com.vivachiclayo.fragment;

import com.vivachiclayo.R;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class AcercaFragment extends Fragment {

		@Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	    	
			getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
	    	View rootView = inflater.inflate(R.layout.acerca_fragment, container, false);
	    	
	    	this.getActivity().setTitle(R.string.aboutus);
        	WebView myWebView = (WebView) rootView.findViewById(R.id.webView2);
        	WebSettings webSettings = myWebView.getSettings();
        	webSettings.setJavaScriptEnabled(true);        	
        	myWebView.loadUrl("file:///android_asset/acerca.html");         
        
	        return rootView;
	    }
		
		
	
}
