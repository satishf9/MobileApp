package com.example.testapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button moreInfo = (Button) findViewById(R.id.btnMoreInfo);
		Button openWeb = (Button)findViewById(R.id.btnWeb);
		openWeb.setOnClickListener(this);
		moreInfo.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
			case R.id.btnMoreInfo:
				Intent x = new Intent(this, Moreinfo.class);
				startActivity(x);
				break;
			case R.id.btnWeb:
				Intent y = new Intent(this, Webpage.class);
				startActivity(y);
				break;
		}
	}
		
}

