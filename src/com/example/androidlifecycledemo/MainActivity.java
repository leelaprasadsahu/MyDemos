package com.example.androidlifecycledemo;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	String str=null;
	TextView hello=null;
	ActionBar actionbar=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		setContentView(R.layout.activity_main);
		hello=(TextView)findViewById(R.id.hello_textview);
		
		str="oncreate=>";
		hello.setText(str);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}
	@Override
	public void onStart(){
		super.onStart();
		str=str+"onstart=>";
		hello.setText(str);
		
		
		
	}
	@Override
	public void onResume(){
		super.onResume();
		str=str+"onresume=>";
		hello.setText(str);
		
	}
	@Override
	public void onPause(){
		super.onPause();
		str=str+"onpause=>";
		hello.setText(str);
		
	}
	public void onStop(){
		super.onStop();
		str=str+"onstop=>";
		hello.setText(str);
		
	}
	public void onDestroy(){
		super.onDestroy();
		str=str+"ondestroy=>";
		hello.setText(str);
	}
	public void onRestart(){
		super.onRestart();
		str=str+"onrestart=>";
		hello.setText(str);
	}
	public void nextActivity(View view){
		Intent intent=new Intent(this,ActivityTwo.class);
		startActivity(intent);
		
		
		
	}
	public void showDialog(View view){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);

	    builder.setTitle("Confirm");
	    builder.setMessage("Are you sure?");

	    builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

	        public void onClick(DialogInterface dialog, int which) {
	            // Do nothing but close the dialog

	            dialog.dismiss();
	         }

	    });

	    builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

	        @Override
	        public void onClick(DialogInterface dialog, int which) {
	            // Do nothing
	            dialog.dismiss();
	        }
	    });

	    AlertDialog alert = builder.create();
	    alert.show();

			
		 
		
	}
	@Override
	public void onUserInteraction (){
		
		str=str+"usertouched";
		hello.setText(str);
		
	}

}
