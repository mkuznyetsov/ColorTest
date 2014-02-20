package com.example.colortest;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	
	Button redButton;
	Button greenButton;
	Button blueButton;
	View view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		redButton = (Button)findViewById(R.id.red_button);
		greenButton = (Button)findViewById(R.id.green_button);
		blueButton = (Button)findViewById(R.id.blue_button);
		view = (RelativeLayout)findViewById(R.id.main_layout);
		
		/**
		 * RED BUTTON
		 */
		redButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				view.setBackgroundColor(Color.RED);
				
			}
		});
		
		/**
		 * GREEN BUTTON
		 */
		greenButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				view.setBackgroundColor(Color.GREEN);
				
			}
		});
		
		/**
		 * BLUE BUTTON
		 */
		blueButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				view.setBackgroundColor(Color.BLUE);
				
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
