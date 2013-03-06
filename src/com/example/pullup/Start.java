package com.example.pullup;

//import com.examle.qwe.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;



public class Start extends Activity {
	
	protected int c;
	public RelativeLayout start;
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent2 = new Intent(Start.this, Training.class);
			finish();
			startActivity(intent2);
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		
		
		start = (RelativeLayout)findViewById(R.id.start);
		int a = getIntent().getIntExtra("a", 1);
		
		if (a==1) {start.setBackgroundResource(R.drawable.start_1);}
		if (a==2) {start.setBackgroundResource(R.drawable.start_2);}
		if (a==3) {start.setBackgroundResource(R.drawable.start_3);}
		if (a==4) {start.setBackgroundResource(R.drawable.start_4);}   
		if (a==5) {start.setBackgroundResource(R.drawable.start_5);}
		if (a==6) {start.setBackgroundResource(R.drawable.start_6);}
		if (a==7) {start.setBackgroundResource(R.drawable.start_7);}
		if (a==8) {start.setBackgroundResource(R.drawable.start_8);}
		if (a==9) {start.setBackgroundResource(R.drawable.start_9);}
		
		 
	    Button but1 = (Button) findViewById(R.id.button1);
	    but1.setOnClickListener(new OnClickListener() {
	        	
               @Override
				public void onClick(View v) {
					
					// TODO Auto-generated method stub
					
				    int a = getIntent().getIntExtra("a", 1);
									
										
					if (a==1) 
						{Intent intent1 = new Intent(Start.this, Level_1.class);
						finish();
						startActivity(intent1);}
					
						else
						{						
						if (a==2) 
							{Intent intent1 = new Intent(Start.this, Level_2.class);
							finish();
							startActivity(intent1);} 
							
							else
							{	
							if (a==3)
								{Intent intent1 = new Intent(Start.this, Level_3.class);
								finish();
								startActivity(intent1);}
									
								else
								{
								if (a==4)
									{Intent intent1 = new Intent(Start.this, Level_4.class);
									finish();
									startActivity(intent1);}
								
									else
									{
									if (a==5)
										{Intent intent1 = new Intent(Start.this, Level_5.class);
										finish();
										startActivity(intent1);}

										else
										{
										if (a==6)
											{Intent intent1 = new Intent(Start.this, Level_6.class);
											finish();
											startActivity(intent1);}
										
											else
											{
											if (a==7)
												{Intent intent1 = new Intent(Start.this, Level_7.class);
												finish();
												startActivity(intent1);}
											
												else
												{
												if (a==8)
													{Intent intent1 = new Intent(Start.this, Level_8.class);
													finish();
													startActivity(intent1);}
																		
													else
													{
														Intent intent1 = new Intent(Start.this, Level_9.class);
														finish();
														startActivity(intent1);
													};
												};
											};
										};
									};
								};
							}; 
						};
			
				
				
				
				
				}

				 							
	});                 	        
}
}
