package com.example.testapp;


import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

@SuppressLint("SetJavaScriptEnabled")
public class Webpage extends Activity implements OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webpage);
		WebView webview = (WebView)findViewById(R.id.webView1);
		Button goBack = (Button)findViewById(R.id.goBack);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl(getString(R.string.weburl));
		goBack.setOnClickListener(this);
	}

	public String currentUrl;
	public void setUrl(String url){
		currentUrl = url;
	}
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.goBack:
			Intent x = new Intent(this, MainActivity.class);
			startActivity(x);
			break;
		}
	}
	
	

}
