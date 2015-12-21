package com.bignerdranch.android.criminalintent;

//import android.R;

import java.util.UUID;

import android.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {

	@Override
	protected android.support.v4.app.Fragment createFragement() {
		// return new CrimeFragment();
		UUID crimeID = (UUID) getIntent().getSerializableExtra(
				CrimeFragment.EXTRA_CRIME_ID);
		return CrimeFragment.newInstance(crimeID);

	}

}
