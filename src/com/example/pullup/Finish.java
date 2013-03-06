package com.example.pullup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Finish extends Activity {
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent2 = new Intent(Finish.this, Main.class);
			finish();
			startActivity(intent2);
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.finish);
		
		Button but1 = (Button) findViewById(R.id.button1);
	       but1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent1 = new Intent(Finish.this, Main.class);
				finish();
				startActivity(intent1);
				
				
			}
	    	   
	    	   
	       });
}
}
