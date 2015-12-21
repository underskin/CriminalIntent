package com.bignerdranch.android.criminalintent;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

public abstract class SingleFragmentActivity extends AppCompatActivity {
	protected abstract android.support.v4.app.Fragment createFragement();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment);

		android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
		android.support.v4.app.Fragment fragment = fm
				.findFragmentById(R.id.fragmentContainer);

		if (fragment == null) {
			fragment = createFragement();
			fm.beginTransaction().add(R.id.fragmentContainer, fragment)
					.commit();
		}
	}

}
