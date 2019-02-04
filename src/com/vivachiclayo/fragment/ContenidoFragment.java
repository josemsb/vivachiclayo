package com.vivachiclayo.fragment;


import android.content.Context;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import com.vivachiclayo.R;
import com.vivachiclayo.content.Museums;
import com.vivachiclayo.content.Cultural;
import com.vivachiclayo.content.Ecotourism;
import com.vivachiclayo.content.HotelTravel;
import com.vivachiclayo.content.Transportation;
import com.vivachiclayo.content.Food;
import com.vivachiclayo.content.GuidesAgencies;


public class ContenidoFragment extends Fragment {
	    
    public int position = -1;	
    public String subcategoria = "";	
    public int mPos = -1;	   
    public String url="http://josemsb-001-site1.smarterasp.net/VIVACHICLAYO-ENG/";
    
    private Museums.contentItem mItemMuseums;
    private Cultural.contentItem mItemCultural;
    private Ecotourism.contentItem mItemEcotourism;
  
    private HotelTravel.contentItem mItemHotelTravel;
    private Transportation.contentItem mItemTransportation;
    private Food.contentItem mItemFood;
    private GuidesAgencies.contentItem mItemGuidesAgencies;

    public ContenidoFragment() {
    }
	
       
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	
    	getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
    	position = getArguments().getInt("position"); //POSICION DE SUBCATEGORIA	
    	mPos= getArguments().getInt("mPos");    //POSICION DE CATEGORIA
    	
    	View rootView = inflater.inflate(R.layout.contenido_webview, container, false);
    	
    	if(isOnline())
   	 	{
    	switch (mPos) {	 	        	
		case 2:
			mItemMuseums = Museums.ITEMS.get(position);			
		        if (mItemMuseums != null) {     
		        	this.getActivity().setTitle(mItemMuseums.subcategoria);
		        	WebView myWebView = (WebView) rootView.findViewById(R.id.webView1);
		        	WebSettings webSettings = myWebView.getSettings();
		        	webSettings.setJavaScriptEnabled(true);        	
		        	myWebView.loadUrl(url + mItemMuseums.id + ".html");         	
		        }
			break;
		case 3:
			mItemCultural = Cultural.ITEMS.get(position);			
		        if (mItemCultural != null) {     
		        	this.getActivity().setTitle(mItemCultural.subcategoria);
		        	WebView myWebView = (WebView) rootView.findViewById(R.id.webView1);
		        	WebSettings webSettings = myWebView.getSettings();
		        	webSettings.setJavaScriptEnabled(true);        	
		        	myWebView.loadUrl(url + mItemCultural.id + ".html"); 
		        }
			break;	  
		case 4:
			mItemEcotourism = Ecotourism.ITEMS.get(position);			
	        if (mItemEcotourism != null) {     
	        	this.getActivity().setTitle(mItemEcotourism.subcategoria);
	        	WebView myWebView = (WebView) rootView.findViewById(R.id.webView1);
	        	WebSettings webSettings = myWebView.getSettings();
	        	webSettings.setJavaScriptEnabled(true);        	
	        	myWebView.loadUrl(url + mItemEcotourism.id + ".html"); 
	        }
			break;		
		case 5:
			mItemHotelTravel = HotelTravel.ITEMS.get(position);			
	        if (mItemHotelTravel != null) {     
	        	this.getActivity().setTitle(mItemHotelTravel.subcategoria);
	        	WebView myWebView = (WebView) rootView.findViewById(R.id.webView1);
	        	WebSettings webSettings = myWebView.getSettings();
	        	webSettings.setJavaScriptEnabled(true);        	
	        	myWebView.loadUrl(url + mItemHotelTravel.id + ".html"); 
	        }
			break;	
		case 6:
			mItemTransportation = Transportation.ITEMS.get(position);			
	        if (mItemTransportation != null) {     
	        	this.getActivity().setTitle(mItemTransportation.subcategoria);
	        	WebView myWebView = (WebView) rootView.findViewById(R.id.webView1);
	        	WebSettings webSettings = myWebView.getSettings();
	        	webSettings.setJavaScriptEnabled(true);        	
	        	myWebView.loadUrl(url + mItemTransportation.id + ".html"); 
	        }
			break;	
		case 7:
			mItemFood = Food.ITEMS.get(position);			
	        if (mItemFood != null) {     
	        	this.getActivity().setTitle(mItemFood.subcategoria);
	        	WebView myWebView = (WebView) rootView.findViewById(R.id.webView1);
	        	WebSettings webSettings = myWebView.getSettings();
	        	webSettings.setJavaScriptEnabled(true);        	
	        	myWebView.loadUrl(url + mItemFood.id + ".html"); 
	        }
			break;	
		case 8:
			mItemGuidesAgencies = GuidesAgencies.ITEMS.get(position);			
	        if (mItemGuidesAgencies != null) {     
	        	this.getActivity().setTitle(mItemGuidesAgencies.subcategoria);
	        	WebView myWebView = (WebView) rootView.findViewById(R.id.webView1);
	        	WebSettings webSettings = myWebView.getSettings();
	        	webSettings.setJavaScriptEnabled(true);        	
	        	myWebView.loadUrl(url + mItemGuidesAgencies.id + ".html"); 
	        }
			break;	
		}	
   	 }
    	else{Toast.makeText(this.getActivity(), " None discover internet connection to perform this function ..",Toast.LENGTH_LONG).show();}
    	    	    	        
        return rootView;
    }
    
    public boolean isOnline() {
		ConnectivityManager cm = (ConnectivityManager) this.getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);

		NetworkInfo netInfo = cm.getActiveNetworkInfo();

		if (netInfo != null && netInfo.isConnectedOrConnecting()) {
		return true;
		}

		return false;
		} 
	
}
