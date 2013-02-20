package com.example.pullup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Start extends Activity {
	
	protected int c;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		
		
		   Button but1 = (Button) findViewById(R.id.button1);
	       but1.setOnClickListener(new OnClickListener() {
	        	
                

				@Override
				public void onClick(View v) {
					
					// TODO Auto-generated method stub
					
				    int a = getIntent().getIntExtra("a", 1);
									
										
					if (a==1) 
						{Intent intent1 = new Intent(Start.this, Level_1.class);
						startActivity(intent1);}
					
						else
						{						
						if (a==2) 
							{Intent intent1 = new Intent(Start.this, Level_2.class);
							startActivity(intent1);} 
							
							else
							{	
							if (a==3)
								{Intent intent1 = new Intent(Start.this, Level_3.class);
								startActivity(intent1);}
									
								else
								{
								if (a==4)
									{Intent intent1 = new Intent(Start.this, Level_4.class);
									startActivity(intent1);}
								
									else
									{
									if (a==5)
										{Intent intent1 = new Intent(Start.this, Level_5.class);
										startActivity(intent1);}

										else
										{
										if (a==6)
											{Intent intent1 = new Intent(Start.this, Level_6.class);
											startActivity(intent1);}
										
											else
											{
											if (a==7)
												{Intent intent1 = new Intent(Start.this, Level_7.class);
												startActivity(intent1);}
											
												else
												{
												if (a==8)
													{Intent intent1 = new Intent(Start.this, Level_8.class);
													startActivity(intent1);}
																		
													else
													{
														Intent intent1 = new Intent(Start.this, Level_9.class);
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
