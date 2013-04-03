package com.example.pullup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class Result extends Activity {

	
	//private int r;

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent2 = new Intent(Result.this, Main.class);
			finish();
			startActivity(intent2);
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		
		Integer res = getIntent().getIntExtra("res", 1);
		
		
		
		TextView text1 = (TextView) findViewById(R.id.editText1);
		//text1.setText("sdfsdf");
		//Integer res = getIntent().getExtras().getInt("res");
		
		res ++;
		text1.setText(res.toString());
		
}
}
