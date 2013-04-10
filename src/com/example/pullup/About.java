package com.example.pullup;



import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;



public class About extends Activity {
	
	
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent2 = new Intent(About.this, Main.class);
			finish();
			startActivity(intent2);
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	
	//public RelativeLayout relativeLayout;
 
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		MediaPlayer mp1 = MediaPlayer.create(About.this, R.raw.med);
		mp1.start();
		
		final Button but1 = (Button) findViewById(R.id.button1);
		but1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation anim1 = AnimationUtils.loadAnimation(About.this, R.anim.tweenanimation);
				but1.startAnimation(anim1);
				//MediaPlayer mp1 = MediaPlayer.create(About.this, R.raw.mel2);
				//mp1.start();
			}
		});
		
		
	}
	
	}
