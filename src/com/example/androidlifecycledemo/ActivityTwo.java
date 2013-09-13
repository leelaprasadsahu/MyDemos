package com.example.androidlifecycledemo;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.view.View;

public class ActivityTwo extends Activity {
	ActionBar actionbar = null;

	@Override
	public void onCreate(Bundle saveInstatanceState) {
		super.onCreate(saveInstatanceState);
		actionbar = getActionBar();
		actionbar.setHomeButtonEnabled(true);

		setContentView(R.layout.activity_two);

	}

	public void finish(View view) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);

		builder.setTitle("Confirm");
		builder.setMessage("Are you sure?");

		builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				// Do nothing but close the dialog

				dialog.dismiss();
				finish();
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

}
