package com.example.pullup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Timer extends Activity {
	
	
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
					intent1.putExtra("page", p=2); // ��������� ������ � ��������� ��  1_�����(2_��������)
				    startActivity(intent1);}
		
				else
				{						
				if (t==2) 
					{Intent intent1 = new Intent(Timer.this, Level_1.class);
					intent1.putExtra("page", p=3); // ��������� ������ � ��������� ��  1_�����(3_��������)
					startActivity(intent1);} 
					
				else
				{	
				if (t==3)
					{Intent intent1 = new Intent(Timer.this, Level_1.class);
					intent1.putExtra("page", p=4); // ��������� ������ � ��������� ��  1_�����(4_��������) 
					startActivity(intent1);}
				
				else
				{	
				if (t==4)
					{Intent intent1 = new Intent(Timer.this, Level_2.class);
					intent1.putExtra("page", p=2); // ��������� ������ � ��������� ��  2_�����(2_��������) 
					startActivity(intent1);}
					
				else
				{						
				if (t==5) 
					{Intent intent1 = new Intent(Timer.this, Level_2.class);
					intent1.putExtra("page", p=3); // ��������� ������ � ��������� ��  2_�����(3_��������)
					startActivity(intent1);} 
						
				else
				{	
				if (t==6)
					{Intent intent1 = new Intent(Timer.this, Level_2.class);
					intent1.putExtra("page", p=4); // ��������� ������ � ��������� ��  2_�����(4_��������) 
					startActivity(intent1);}
							
				else
				{	
				if (t==7)
					{Intent intent1 = new Intent(Timer.this, Level_3.class);
					intent1.putExtra("page", p=2); // ��������� ������ � ��������� ��  3_�����(2_��������) 
					startActivity(intent1);}
							
				else
				{						
				if (t==8) 
					{Intent intent1 = new Intent(Timer.this, Level_3.class);
					intent1.putExtra("page", p=3); // ��������� ������ � ��������� ��  3_�����(3_��������)
					startActivity(intent1);} 
								
				else
				{	
				if (t==9)
					{Intent intent1 = new Intent(Timer.this, Level_3.class);
					intent1.putExtra("page", p=4); // ��������� ������ � ��������� ��  3_�����(4_��������) 
					startActivity(intent1);}
				
				else
				{	
				if (t==10)
					{Intent intent1 = new Intent(Timer.this, Level_4.class);
					intent1.putExtra("page", p=2); // ��������� ������ � ��������� ��  4_�����(2_��������) 
					startActivity(intent1);}
							
				else
				{						
				if (t==11) 
					{Intent intent1 = new Intent(Timer.this, Level_4.class);
					intent1.putExtra("page", p=3); // ��������� ������ � ��������� ��  4_�����(3_��������)
					startActivity(intent1);} 
								
				else
				{	
				if (t==12)
					{Intent intent1 = new Intent(Timer.this, Level_4.class);
					intent1.putExtra("page", p=4); // ��������� ������ � ��������� ��  4_�����(4_��������) 
					startActivity(intent1);}
				
				else
				{	
				if (t==13)
					{Intent intent1 = new Intent(Timer.this, Level_5.class);
					intent1.putExtra("page", p=2); // ��������� ������ � ��������� ��  5_�����(2_��������) 
					startActivity(intent1);}
							
				else
				{						
				if (t==14) 
					{Intent intent1 = new Intent(Timer.this, Level_5.class);
					intent1.putExtra("page", p=3); // ��������� ������ � ��������� ��  5_�����(3_��������)
					startActivity(intent1);} 
								
				else
				{	
				if (t==15)
					{Intent intent1 = new Intent(Timer.this, Level_5.class);
					intent1.putExtra("page", p=4); // ��������� ������ � ��������� ��  5_�����(4_��������) 
					startActivity(intent1);}
				
				else
				{	
				if (t==16)
					{Intent intent1 = new Intent(Timer.this, Level_6.class);
					intent1.putExtra("page", p=2); // ��������� ������ � ��������� ��  6_�����(2_��������) 
					startActivity(intent1);}
							
				else
				{						
				if (t==17) 
					{Intent intent1 = new Intent(Timer.this, Level_6.class);
					intent1.putExtra("page", p=3); // ��������� ������ � ��������� ��  6_�����(3_��������)
					startActivity(intent1);} 
								
				else
				{	
				if (t==18)
					{Intent intent1 = new Intent(Timer.this, Level_6.class);
					intent1.putExtra("page", p=4); // ��������� ������ � ��������� ��  6_�����(4_��������) 
					startActivity(intent1);}
				
				else
				{	
				if (t==19)
					{Intent intent1 = new Intent(Timer.this, Level_7.class);
					intent1.putExtra("page", p=2); // ��������� ������ � ��������� ��  7_�����(2_��������) 
					startActivity(intent1);}
							
				else
				{						
				if (t==20) 
					{Intent intent1 = new Intent(Timer.this, Level_7.class);
					intent1.putExtra("page", p=3); // ��������� ������ � ��������� ��  7_�����(3_��������)
					startActivity(intent1);} 
								
				else
				{	
				if (t==21)
					{Intent intent1 = new Intent(Timer.this, Level_7.class);
					intent1.putExtra("page", p=4); // ��������� ������ � ��������� ��  7_�����(4_��������) 
					startActivity(intent1);}
				
				else
				{	
				if (t==22)
					{Intent intent1 = new Intent(Timer.this, Level_8.class);
					intent1.putExtra("page", p=2); // ��������� ������ � ��������� ��  8_�����(2_��������) 
					startActivity(intent1);}
							
				else
				{						
				if (t==23) 
					{Intent intent1 = new Intent(Timer.this, Level_8.class);
					intent1.putExtra("page", p=3); // ��������� ������ � ��������� ��  8_�����(3_��������)
					startActivity(intent1);} 
								
				else
				{	
				if (t==24)
					{Intent intent1 = new Intent(Timer.this, Level_8.class);
					intent1.putExtra("page", p=4); // ��������� ������ � ��������� ��  8_�����(4_��������) 
					startActivity(intent1);}
				
				else
				{	
				if (t==25)
					{Intent intent1 = new Intent(Timer.this, Level_9.class);
					intent1.putExtra("page", p=2); // ��������� ������ � ��������� ��  9_�����(2_��������) 
					startActivity(intent1);}
							
				else
				{						
				if (t==26) 
					{Intent intent1 = new Intent(Timer.this, Level_9.class);
					intent1.putExtra("page", p=3); // ��������� ������ � ��������� ��  9_�����(3_��������)
					startActivity(intent1);} 
								
				else
				{	
				if (t==27)
					{Intent intent1 = new Intent(Timer.this, Level_9.class);
					intent1.putExtra("page", p=4); // ��������� ������ � ��������� ��  9_�����(4_��������) 
					startActivity(intent1);}
				
				
						
					else
						{Intent intent1 = new Intent(Timer.this, Main.class);
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
