package com.example.pullup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Level_9 extends Activity {
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent2 = new Intent(Level_9.this, Main.class);
			finish();
			startActivity(intent2);
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	
	protected int t;
	public RelativeLayout level;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level);

		level = (RelativeLayout)findViewById(R.id.level);
		level.setBackgroundResource(R.drawable.step9_19);
		
		int p = getIntent().getIntExtra("page", 1);
		if (p==2) {level.setBackgroundResource(R.drawable.step9_18);}
		if (p==3) {level.setBackgroundResource(R.drawable.step9_20);}
		if (p==4) {level.setBackgroundResource(R.drawable.step9_18);} 
		
		Button but1 = (Button) findViewById(R.id.button1);
	       but1.setOnClickListener(new OnClickListener(){
	   
	    	   
	     

		@Override
	    public void onClick(View v) {
			
			int p = getIntent().getIntExtra("page", 1);
					
			
							    	   
			if (p==2) 
				{Intent intent1 = new Intent(Level_9.this, Timer.class);
				intent1.putExtra("timer", t=26);
				finish();
				startActivity(intent1);} //  2 картинка
		
				else
				{						
				if (p==3) 
					{Intent intent1 = new Intent(Level_9.this, Timer.class);
					intent1.putExtra("timer", t=27);
					finish();
					startActivity(intent1);} //  3 картинка
					
					else
					{	
					if (p==4)
						{Intent intent1 = new Intent(Level_9.this, Finish.class);
						finish();
						startActivity(intent1);} // 4 картинка
							
						else
							{Intent intent1 = new Intent(Level_9.this, Timer.class);
							intent1.putExtra("timer", t=25);
							finish();
							startActivity(intent1);}; // поставить 1 картинку и переходим на таймер
									
					}; 
				};
		}
			    	    	
	    });
		
		
	}
}
