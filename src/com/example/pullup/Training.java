package com.example.pullup;

//import com.examle.qwe.R;

//import com.examle.qwe.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
//import android.widget.RelativeLayout;


public class Training extends Activity implements OnClickListener{
	
	protected int a;
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent2 = new Intent(Training.this, Main.class);
			finish();
			startActivity(intent2);
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.training);
		
		 Button but1 = (Button) findViewById(R.id.button1);
	        but1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent1 = new Intent(Training.this,Preferense.class);
					finish();
					startActivity(intent1);
					
					
				}
			});
		
		ImageButton ibut1 = (ImageButton) findViewById(R.id.ImageButton1);
		ibut1.setOnClickListener(this);
		ImageButton ibut2 = (ImageButton) findViewById(R.id.imageButton2);
		ibut2.setOnClickListener(this);
		ImageButton ibut3 = (ImageButton) findViewById(R.id.imageButton3);
		ibut3.setOnClickListener(this);
		ImageButton ibut4 = (ImageButton) findViewById(R.id.imageButton4);
		ibut4.setOnClickListener(this);
		ImageButton ibut5 = (ImageButton) findViewById(R.id.imageButton5);
		ibut5.setOnClickListener(this);
		ImageButton ibut6 = (ImageButton) findViewById(R.id.imageButton6);
		ibut6.setOnClickListener(this);
		ImageButton ibut7 = (ImageButton) findViewById(R.id.imageButton7);
		ibut7.setOnClickListener(this);
		ImageButton ibut8 = (ImageButton) findViewById(R.id.imageButton8);
		ibut8.setOnClickListener(this);
		ImageButton ibut9 = (ImageButton) findViewById(R.id.imageButton9);
		ibut9.setOnClickListener(this);
}
 
	@Override
	public void onClick(View v) {
		
		// TODO Auto-generated method stub
		if (v.getId()==R.id.ImageButton1){
			
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=1);
			finish();
			startActivity(intent1);
			
		}
		if (v.getId()==R.id.imageButton2){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=2);
			finish();
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton3){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=3);
			finish();
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton4){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=4);
			finish();
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton5){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=5);
			finish();
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton6){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=6);
			finish();
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton7){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=7);
			finish();
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton8){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=8);
			finish();
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton9){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=9);
			finish();
			startActivity(intent1);
		}
	}
}