package com.example.testapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Moreinfo extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_moreinfo);
		
		Button goBack = (Button)findViewById(R.id.btnGoBack);
		goBack.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent x = new Intent(this, MainActivity.class);
		startActivity(x);
		
	}

}
