package com.vivachiclayo.fragment;

import android.app.AlertDialog;
//import android.content.Intent;
import android.content.pm.ActivityInfo;
//import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.View;
//import android.widget.Toast;

import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import com.vivachiclayo.R;
import com.vivachiclayo.fragment.EmergenciaFragment;
import com.vivachiclayo.fragment.GuidesFragment;
import com.vivachiclayo.fragment.TaxisFragment;
import com.vivachiclayo.fragment.TravelAgenciesFragment;

/**
 * This activity is an example of a responsive Android UI.
 * On phones, the SlidingMenu will be enabled only in portrait mode.
 * In landscape mode, it will present itself as a dual pane layout.
 * On tablets, it will will do the same general thing. In portrait
 * mode, it will enable the SlidingMenu, and in landscape mode, it
 * will be a dual pane layout.
 * 
 * @author jeremy
 *
 */
public class ResponsiveUIActivity extends SlidingFragmentActivity {

	private Fragment mContent;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setTitle(R.string.responsive_ui);
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
		setContentView(R.layout.responsive_content_frame);

		// check if the content frame contains the menu frame
		if (findViewById(R.id.menu_frame) == null) {			
			setBehindContentView(R.layout.menu_frame);
			getSlidingMenu().setSlidingEnabled(true);
			getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
			// show home as up so we can toggle
			getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		} else {
			// add a dummy view			
			View v = new View(this);
			setBehindContentView(v);
			getSlidingMenu().setSlidingEnabled(false);
			getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
		}

		// set the Above View Fragment
		if (savedInstanceState != null)		
			mContent = getSupportFragmentManager().getFragment(savedInstanceState, "mContent");
				
		//ACA PONER EL FRAGMENT PRINCIPAL, CUANDO INICIA				
		if (mContent == null)		
		{					    							
			Fragment newContent = new InicioFragment();		
		
			if (newContent != null)
				switchContent(newContent);
		}
		
		//ACA SE PONE EL VIEW PRINCIPAL
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame, mContent)
		.commit();

		//ACA SE PONE EL MENU
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.menu_frame, new BirdMenuFragment())
		.commit();

		// customize the SlidingMenu
		SlidingMenu sm = getSlidingMenu();
		sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		sm.setShadowWidthRes(R.dimen.shadow_width);
		sm.setShadowDrawable(R.drawable.shadow);
		sm.setBehindScrollScale(0.25f);
		sm.setFadeDegree(0.25f);

		
	}

	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {	
		
		case android.R.id.home:
			toggle();
			break;	
		case R.id.about:
			new AlertDialog.Builder(this)
			.setTitle(R.string.about)
			.setMessage(Html.fromHtml(getString(R.string.about_msg)))
			.show();
			break;	
		case R.id.resposability:
			new AlertDialog.Builder(this)
			.setTitle(R.string.resposability)
			.setMessage(Html.fromHtml(getString(R.string.resposability_text)))
			.show();
			break;
		case R.id.emergency:
			Fragment newContent = new EmergenciaFragment();		
			
			if (newContent != null)
				switchContent(newContent);
			break;	
		case R.id.taxi:
			Fragment newContent1 = new TaxisFragment();		
			
			if (newContent1 != null)
				switchContent(newContent1);
			break;	
		case R.id.guides:
			Fragment newContent2 = new GuidesFragment();		
			
			if (newContent2 != null)
				switchContent(newContent2);
			break;	
		case R.id.agencies:
			Fragment newContent3 = new TravelAgenciesFragment();		
			
			if (newContent3 != null)
				switchContent(newContent3);
			break;	
		//case R.id.contact:
		//	final Intent email = new Intent(android.content.Intent.ACTION_SEND);
		//	String uriText = "viajemosjuntos@umb.edu.pe" +
		//			"?subject=VIVACHICLAYO Feedback"; 
		//	email.setType("message/rfc822");
		//	email.setData(Uri.parse(uriText));
		//	try {
		//		startActivity(email);
		//	} catch (Exception e) {
		//		Toast.makeText(this, R.string.no_email, Toast.LENGTH_SHORT).show();
		//	}
		//	break;
		}
		return super.onOptionsItemSelected(item);
	}
	

	//@Override
	//public void onSaveInstanceState(Bundle outState) {
	//	super.onSaveInstanceState(outState);
	//	getSupportFragmentManager().putFragment(outState, "mContent", mContent);
	//}

	
	public void switchContent(final Fragment fragment) {
						
		mContent = fragment;		
		getSupportFragmentManager()
		.beginTransaction()		
		.replace(R.id.content_frame, fragment)	
		.addToBackStack(null)
		.commit();		
		Handler h = new Handler();
		h.postDelayed(new Runnable() {
			public void run() {
				getSlidingMenu().showContent();
			}
		}, 50);
		
	}	
	

	//@Override
	//public void onBackPressed() {
	//	Log.d("Back", TAG_FRAGMENT);
	//	mContent = getSupportFragmentManager().findFragmentByTag(TAG_FRAGMENT);	    
	//}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.example_list, menu);
		return true;
	}
		
	
}
