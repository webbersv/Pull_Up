package com.example.pullup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class Training extends Activity implements OnClickListener{
	
	protected int a;
	
	

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.training);
		
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
			startActivity(intent1);
			
		}
		if (v.getId()==R.id.imageButton2){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=2);
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton3){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=3);
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton4){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=4);
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton5){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=5);
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton6){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=6);
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton7){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=7);
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton8){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=8);
			startActivity(intent1);
		}
		if (v.getId()==R.id.imageButton9){
			Intent intent1 = new Intent(Training.this, Start.class);
			intent1.putExtra("a", a=9);
			startActivity(intent1);
		}
	}
}