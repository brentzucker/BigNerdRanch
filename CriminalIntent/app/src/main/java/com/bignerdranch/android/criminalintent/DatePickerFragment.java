package com.bignerdranch.android.criminalintent;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

/**
 * Created by bvz on 10/29/15.
 */
public class DatePickerFragment extends android.support.v4.app.DialogFragment {

    // FragmentManager of Hosting activity calls this method
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setTitle(R.string.date_picker_title)
                .setPositiveButton(android.R.string.ok, null)
                .create();
    }
}
