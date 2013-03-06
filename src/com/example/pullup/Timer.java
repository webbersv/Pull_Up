package com.example.pullup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Timer extends Activity {
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent2 = new Intent(Timer.this, Main.class);
			finish();
			startActivity(intent2);
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	protected int p;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.timer);
		
		Button but1 = (Button) findViewById(R.id.button1);
	       but1.setOnClickListener(new OnClickListener(){
	   
	    	   
	       @Override
	    public void onClick(View v) {
	    	   
	    	   int t = getIntent().getIntExtra("timer", 1); // b=2
	    	  
	    	   if (t==1) 
					{Intent intent1 = new Intent(Timer.this, Level_1.class);
					intent1.putExtra("page", p=2);
					finish(); // поставить таймер и переходим на  1_левел(2_картинка)
				    startActivity(intent1);}
		
				else
				{						
				if (t==2) 
					{Intent intent1 = new Intent(Timer.this, Level_1.class);
					intent1.putExtra("page", p=3);
					finish(); // поставить таймер и переходим на  1_левел(3_картинка)
					startActivity(intent1);} 
					
				else
				{	
				if (t==3)
					{Intent intent1 = new Intent(Timer.this, Level_1.class);
					intent1.putExtra("page", p=4);
					finish(); // поставить таймер и переходим на  1_левел(4_картинка) 
					startActivity(intent1);}
				
				else
				{	
				if (t==4)
					{Intent intent1 = new Intent(Timer.this, Level_2.class);
					intent1.putExtra("page", p=2);
					finish(); // поставить таймер и переходим на  2_левел(2_картинка) 
					startActivity(intent1);}
					
				else
				{						
				if (t==5) 
					{Intent intent1 = new Intent(Timer.this, Level_2.class);
					intent1.putExtra("page", p=3);
					finish(); // поставить таймер и переходим на  2_левел(3_картинка)
					startActivity(intent1);} 
						
				else
				{	
				if (t==6)
					{Intent intent1 = new Intent(Timer.this, Level_2.class);
					intent1.putExtra("page", p=4);
					finish(); // поставить таймер и переходим на  2_левел(4_картинка) 
					startActivity(intent1);}
							
				else
				{	
				if (t==7)
					{Intent intent1 = new Intent(Timer.this, Level_3.class);
					intent1.putExtra("page", p=2);
					finish(); // поставить таймер и переходим на  3_левел(2_картинка) 
					startActivity(intent1);}
							
				else
				{						
				if (t==8) 
					{Intent intent1 = new Intent(Timer.this, Level_3.class);
					intent1.putExtra("page", p=3); 
					finish();// поставить таймер и переходим на  3_левел(3_картинка)
					startActivity(intent1);} 
								
				else
				{	
				if (t==9)
					{Intent intent1 = new Intent(Timer.this, Level_3.class);
					intent1.putExtra("page", p=4);
					finish(); // поставить таймер и переходим на  3_левел(4_картинка) 
					startActivity(intent1);}
				
				else
				{	
				if (t==10)
					{Intent intent1 = new Intent(Timer.this, Level_4.class);
					intent1.putExtra("page", p=2);
					finish(); // поставить таймер и переходим на  4_левел(2_картинка) 
					startActivity(intent1);}
							
				else
				{						
				if (t==11) 
					{Intent intent1 = new Intent(Timer.this, Level_4.class);
					intent1.putExtra("page", p=3);
					finish(); // поставить таймер и переходим на  4_левел(3_картинка)
					startActivity(intent1);} 
								
				else
				{	
				if (t==12)
					{Intent intent1 = new Intent(Timer.this, Level_4.class);
					intent1.putExtra("page", p=4);
					finish(); // поставить таймер и переходим на  4_левел(4_картинка) 
					startActivity(intent1);}
				
				else
				{	
				if (t==13)
					{Intent intent1 = new Intent(Timer.this, Level_5.class);
					intent1.putExtra("page", p=2); 
					finish();// поставить таймер и переходим на  5_левел(2_картинка) 
					startActivity(intent1);}
							
				else
				{						
				if (t==14) 
					{Intent intent1 = new Intent(Timer.this, Level_5.class);
					intent1.putExtra("page", p=3);
					finish(); // поставить таймер и переходим на  5_левел(3_картинка)
					startActivity(intent1);} 
								
				else
				{	
				if (t==15)
					{Intent intent1 = new Intent(Timer.this, Level_5.class);
					intent1.putExtra("page", p=4);
					finish(); // поставить таймер и переходим на  5_левел(4_картинка) 
					startActivity(intent1);}
				
				else
				{	
				if (t==16)
					{Intent intent1 = new Intent(Timer.this, Level_6.class);
					intent1.putExtra("page", p=2);
					finish(); // поставить таймер и переходим на  6_левел(2_картинка) 
					startActivity(intent1);}
							
				else
				{						
				if (t==17) 
					{Intent intent1 = new Intent(Timer.this, Level_6.class);
					intent1.putExtra("page", p=3);
					finish(); // поставить таймер и переходим на  6_левел(3_картинка)
					startActivity(intent1);} 
								
				else
				{	
				if (t==18)
					{Intent intent1 = new Intent(Timer.this, Level_6.class);
					intent1.putExtra("page", p=4);
					finish(); // поставить таймер и переходим на  6_левел(4_картинка) 
					startActivity(intent1);}
				
				else
				{	
				if (t==19)
					{Intent intent1 = new Intent(Timer.this, Level_7.class);
					intent1.putExtra("page", p=2);
					finish(); // поставить таймер и переходим на  7_левел(2_картинка) 
					startActivity(intent1);}
							
				else
				{						
				if (t==20) 
					{Intent intent1 = new Intent(Timer.this, Level_7.class);
					intent1.putExtra("page", p=3);
					finish(); // поставить таймер и переходим на  7_левел(3_картинка)
					startActivity(intent1);} 
								
				else
				{	
				if (t==21)
					{Intent intent1 = new Intent(Timer.this, Level_7.class);
					intent1.putExtra("page", p=4);
					finish(); // поставить таймер и переходим на  7_левел(4_картинка) 
					startActivity(intent1);}
				
				else
				{	
				if (t==22)
					{Intent intent1 = new Intent(Timer.this, Level_8.class);
					intent1.putExtra("page", p=2);
					finish(); // поставить таймер и переходим на  8_левел(2_картинка) 
					startActivity(intent1);}
							
				else
				{						
				if (t==23) 
					{Intent intent1 = new Intent(Timer.this, Level_8.class);
					intent1.putExtra("page", p=3);
					finish(); // поставить таймер и переходим на  8_левел(3_картинка)
					startActivity(intent1);} 
								
				else
				{	
				if (t==24)
					{Intent intent1 = new Intent(Timer.this, Level_8.class);
					intent1.putExtra("page", p=4);
					finish(); // поставить таймер и переходим на  8_левел(4_картинка) 
					startActivity(intent1);}
				
				else
				{	
				if (t==25)
					{Intent intent1 = new Intent(Timer.this, Level_9.class);
					intent1.putExtra("page", p=2); 
					finish();// поставить таймер и переходим на  9_левел(2_картинка) 
					startActivity(intent1);}
							
				else
				{						
				if (t==26) 
					{Intent intent1 = new Intent(Timer.this, Level_9.class);
					intent1.putExtra("page", p=3);
					finish(); // поставить таймер и переходим на  9_левел(3_картинка)
					startActivity(intent1);} 
								
				else
				{	
				if (t==27)
					{Intent intent1 = new Intent(Timer.this, Level_9.class);
					intent1.putExtra("page", p=4);
					finish(); // поставить таймер и переходим на  9_левел(4_картинка) 
					startActivity(intent1);}
				
				
						
					else
						{Intent intent1 = new Intent(Timer.this, Main.class);
						finish();
						startActivity(intent1);};
				};
				};
				};
				};
				};
				};
				};
				};
				};
				};
				};
				};
				};
				};
				};
				};
				};
				};
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
