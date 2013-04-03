package com.example.pullup;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Main extends Activity {
	
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
              
        Button but1 = (Button) findViewById(R.id.button1);//About
        but1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent1 = new Intent(Main.this, About.class);
				startActivity(intent1);
			}
		});
        
        Button but3 = (Button) findViewById(R.id.button2);//EXIT
        but3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
				
			}
		});
        
        Button but4 = (Button) findViewById(R.id.button3);//TRAINING
        but4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent1 = new Intent(Main.this, Training.class);
				finish();
				startActivity(intent1);
			}
		});
        
        
    }
    
    
}
