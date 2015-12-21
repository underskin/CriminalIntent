package com.bignerdranch.android.criminalintent;

import android.app.Fragment;
import android.os.Bundle;

public class CrimeListActivity extends SingleFragmentActivity {

	@Override
	protected android.support.v4.app.Fragment createFragement() {
		return new CrimeListFragment();
	}

	// @Override
	// protected void onCreate(Bundle savedInstanceState) {
	// super.onCreate(savedInstanceState);
	// setContentView(R.layout.activity_main);
	// }

}
