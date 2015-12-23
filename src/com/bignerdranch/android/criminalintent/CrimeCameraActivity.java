package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeCameraActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragement() {
		return new CrimeCameraFragment();
	}

}
