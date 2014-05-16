package com.example.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
	private static final String TAG = "LifeCycle";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v(TAG,"onCreate is called.");
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.v(TAG, "onStart s called.");
	}
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.v(TAG, "onRestart is called.");

	}
	@Override
	protected void onResume() {
		super.onResume();
		Log.v(TAG, "onResume is called.");


	}
	@Override
	protected void onPause() {
		super.onPause();


	}
	@Override
	protected void onStop() {
		super.onStop();

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

	}

}
