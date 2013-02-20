package com.example.pullup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Level_3 extends Activity {
	
	
	protected int t;
	

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level);
		
		
		Button but1 = (Button) findViewById(R.id.button1);
	       but1.setOnClickListener(new OnClickListener(){
	   
	    	   
	     

		@Override
	    public void onClick(View v) {
			
			int p = getIntent().getIntExtra("page", 1);
					
			
							    	   
			if (p==2) 
				{Intent intent1 = new Intent(Level_3.this, Timer.class);
				intent1.putExtra("timer", t=9);
				startActivity(intent1);} // поставить 2 картинку и переходим на таймер
		
				else
				{						
				if (p==3) 
					{Intent intent1 = new Intent(Level_3.this, Timer.class);
					intent1.putExtra("timer", t=8);
					startActivity(intent1);} // поставить 3 картинку и переходим на таймер
					
					else
					{	
					if (p==4)
						{Intent intent1 = new Intent(Level_3.this, Finish.class);
						startActivity(intent1);} // поставить 4 картинку и переходим на финиш
							
						else
							{Intent intent1 = new Intent(Level_3.this, Timer.class);
							intent1.putExtra("timer", t=7);
							startActivity(intent1);}; // поставить 1 картинку и переходим на таймер
									
					}; 
				};
		}
			    	    	
	    });
		
		
	}
}
